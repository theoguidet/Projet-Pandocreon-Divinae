package vue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import cartes.Carte;
import cartes.TypeCarte;
import controleur.ControleurPartie;
import joueurs.EvenementJoueur;
import joueurs.Joueur;
import joueurs.JoueurVirtuel;
import partie.EvenementPartie;
import partie.Partie;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Insets;

public class FenetrePartie extends JInternalFrame implements Observer {
	public FenetrePartie(FenetrePrincipale fenetrePrincipale) {
		super();
		setResizable(false);
		fenetreMere= fenetrePrincipale;
		fenetrePartie=this;
	}
	public ControleurPartie getControleurPartie() {
		return controleurPartie;
	}
	/**
	 * 
	 */
	private static FenetrePrincipale fenetreMere;
	/**
	 * 
	 */
	private static FenetrePartie fenetrePartie;
	/**
	 * 
	 */
	private static final long serialVersionUID = 6651769382331271200L;
	/**
	 * Le controleur de partie actuelle.
	 */
	private ControleurPartie controleurPartie;
	/**
	 * champ de poser cartes
	 */
	private JPanel champ;
	/**
	 * plateau du jeu
	 */
	private JPanel plateau;
	/**
	 * siege du joueur physique
	 */
	private JPanel siegeDuJoueurPhysique;
	/**
	 * siege du joueur virtuel
	 */
	private JPanel siegeDuJoueurVirtuel;
	/**
	 * afficher les messages dans la partie
	 */
	private JTextPane messageAAfficher;
	/**
	 * 
	 */
	private Partie partieEnCours;
	/**
	 * 
	 * joueur en cours
	 */
	private Joueur joueurEnCours;

	public void setPartieEnCours(Partie partieEnCours) {
		this.partieEnCours = partieEnCours;
	}

	public JPanel getPlateau() {
		return plateau;
	}

	public void setPlateau(JPanel plateau) {
		this.plateau = plateau;
	}

	public JPanel getChamp() {
		return champ;
	}

	public Partie getPartieEnCours() {
		return partieEnCours;
	}


	public void setControleurPartie(ControleurPartie controleurPartie) {
		this.controleurPartie = controleurPartie;
	}

	/**
	 * demander nombre de Joueurs dans la partie
	 * 
	 * @return
	 */
	public int demanderNbJoueurs() {
		// TODO Auto-generated method stub
		int nbJoueurs = 0;
		String nbJoueur;
		boolean mauvaischoix = true;
		do {
			try {
				nbJoueur = JOptionPane.showInputDialog(this, "Combien de joueurs voulez-vous dans la partie?",
						"Nobmre de joueurs", JOptionPane.QUESTION_MESSAGE);
				nbJoueurs = Integer.parseInt(nbJoueur);
				if (nbJoueurs < 2 || nbJoueurs > 7) {
					JOptionPane.showMessageDialog(this, "Le nombre de joueurs doit etre entre 2 et 7",
							"Nombre de joueurs", JOptionPane.WARNING_MESSAGE);
				} else {
					mauvaischoix = false;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Le nombre de joueurs doit etre entier", "Nombre de joueurs:",
						JOptionPane.WARNING_MESSAGE);
			}
		} while (mauvaischoix);
		return nbJoueurs;
	}

	/**
	 * demander le nom du joueur physique
	 * 
	 * @return
	 */
	public String demanderNomJoueurPhysique() {
		String nomJoueur;
		nomJoueur = JOptionPane.showInputDialog(this, "Entrez votre nom", "Nom du joueur physique",
				JOptionPane.QUESTION_MESSAGE);

		return nomJoueur;

	}

	/**
	 * demander list des noms des joueurs virtuels
	 * 
	 * @param nbJoueurs
	 * @return
	 */
	public String[] demanderListNomJoueursVirtuel(int nbJoueurs) {
		// TODO Auto-generated method stub
		int indice = 1;
		String[] nomJoueursVirtuel = new String[nbJoueurs - 1];
		while (indice <= nbJoueurs - 1) {
			nomJoueursVirtuel[indice - 1] = JOptionPane.showInputDialog(this,
					"Entrez le nom du joueur virtuel" + indice, "Nom du joueur virtuel", JOptionPane.QUESTION_MESSAGE);
			indice++;
		}
		return nomJoueursVirtuel;
	}

	/**
	 * presenter les Joueurs dans la partie
	 */
	public void presenterJoueurs() {
		ArrayList<Joueur> listJoueur = Partie.getUniquePartie().getJoueurs();
		for (int indice = 0; indice <= listJoueur.size(); indice++) {
			Joueur joueur = listJoueur.get(indice);
			if (joueur instanceof JoueurVirtuel) {
				JOptionPane.showMessageDialog(this, joueur.getNom() + "est à la position" + indice);
			} else {
				JOptionPane.showMessageDialog(this, "Vous etes à la position " + indice);
			}
		}
	}

	/**
	 * afficher les choix de sacrifier Cartes du Joueur
	 * 
	 * @param joueurEnCours
	 * @param carteASacrifier
	 */

	public void affichageChoixDeSacrifierDuJoueur(Joueur joueurEnCours, Carte carteASacrifier) {
		String msg1 = null;
		boolean mauvaisChoix = true;
		do {
			if (carteASacrifier.getTypeCarte() == TypeCarte.croyant
					|| carteASacrifier.getTypeCarte() == TypeCarte.guideSpirituel) {
				if (joueurEnCours instanceof JoueurVirtuel) {
					msg1 = joueurEnCours.getNom() + " a sacrifie" + carteASacrifier.getTypeCarte().toString()
							+ carteASacrifier.getNom() + "." + carteASacrifier.getNom() + "a le sacrifice "
							+ carteASacrifier.getCapacite();
				} else {
					msg1 = "Vous avez sacrifie la carte " + carteASacrifier.getTypeCarte().toString()
							+ carteASacrifier.getNom() + "." + "Cette carte a le sacrifice "
							+ carteASacrifier.getCapacite();
				}
				afficher(msg1);
			} else {
				msg1 = "Cette carte ne peut pas etre sacrifie";
				mauvaisChoix = false;
			}
		} while (mauvaisChoix);
	}

	/**
	 * afficher les messages pendant la partie
	 */
	public void afficher(String arg) {
		messageAAfficher.setText(arg);
	}

	public int demanderChoixADefausserCarte() {
		int choix;
		boolean mauvaisChoix = true;
		do {
			
			choix = JOptionPane.showConfirmDialog(this, "Defausser de tout ou partie de main?", "Defausser cartes",
					JOptionPane.YES_NO_OPTION);
			if (choix == JOptionPane.CLOSED_OPTION) {
				if (sortir()) {
					mauvaisChoix = false;
					choix=2;
				}
			} else {
				if (choix == JOptionPane.YES_OPTION) {
				
						JOptionPane.showMessageDialog(this, "Defaussez cartes, s'il vous plait",
								"Defausser carte", JOptionPane.PLAIN_MESSAGE);
						choix=1;
				}else if(choix== JOptionPane.NO_OPTION){
					choix=2;
				}
			
			}
		} while (mauvaisChoix);
		return choix;
	}

	/**
	 * Sort de cette fenetre.
	 * 
	 * @return <code>true</code> si l'utilisateur veut quitter et
	 *         <code>false</code> sinon
	 */
	private synchronized boolean sortir() {
		int option = JOptionPane.showConfirmDialog(null, "Voulez-vous quitter?", "Sortie",
				JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			doDefaultCloseAction();
			return true;
		}
		return false;
	}

	/**
	 * preparer du jeu
	 */
	public void preparer() {
		partieEnCours = Partie.getUniquePartie();
		ArrayList<Joueur> listJoueurs = Partie.getUniquePartie().getJoueurs();
		for (int indice = 0; indice < listJoueurs.size(); indice++) {
			Joueur joueur = listJoueurs.get(indice);
			VueJoueur vueJoueur;
			if (joueur instanceof JoueurVirtuel) {
				vueJoueur = new VueJoueurVirtuel((JoueurVirtuel) joueur);
			} else {
				vueJoueur = new VueJoueurPhysique(joueur);
			}
			joueur.addObserver(this);
			ArrayList<Carte> listCarte = joueur.getMain();
			Iterator<Carte> it = listCarte.iterator();
			while (it.hasNext()) {
				Carte carte = it.next();
				VueCarte vueCarte;
				vueCarte = new VueCarte(carte);
				carte.addObserver(this);
				vueJoueur.mainDuJoueur.add(vueCarte);
			}
			if (joueur instanceof JoueurVirtuel) {
				siegeDuJoueurPhysique.add(vueJoueur);
			} else {
				siegeDuJoueurVirtuel.add(vueJoueur);
			}
		}

	}

	/**
	 * construire le Plateau
	 */
	public void construirePlateau() {
		plateau = new JPanel();
		
		getContentPane().add(plateau, BorderLayout.CENTER);
		GridBagLayout gbl_plateau = new GridBagLayout();
		gbl_plateau.columnWeights = new double[] { 0.5,1.0,0.5,0.3 };
		gbl_plateau.rowWeights = new double[] { 0.5,1.0,0.5,0.3 };
		plateau.setLayout(gbl_plateau);
		
		champ = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		plateau.add(champ, gbc_panel);
		champ.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		siegeDuJoueurPhysique = new JPanel();
		siegeDuJoueurPhysique.setLayout(new BorderLayout());
		siegeDuJoueurPhysique.setBorder(BorderFactory.createRaisedBevelBorder());
		GridBagConstraints gbc_siegeDuJoueurPhysique = new GridBagConstraints();
		gbc_siegeDuJoueurPhysique.gridx = 0;
		gbc_siegeDuJoueurPhysique.gridy = 2;
		gbc_siegeDuJoueurPhysique.gridwidth = 3;
		plateau.add(siegeDuJoueurPhysique, gbc_siegeDuJoueurPhysique);
		
		siegeDuJoueurVirtuel = new JPanel();
		siegeDuJoueurVirtuel.setLayout(new BorderLayout());
		siegeDuJoueurVirtuel.setBorder(BorderFactory.createRaisedBevelBorder());
		GridBagConstraints gbc_siegeDuJoueurVirtuel = new GridBagConstraints();
		gbc_siegeDuJoueurVirtuel.gridx = 0;
		gbc_siegeDuJoueurVirtuel.gridy = 0;
		gbc_siegeDuJoueurVirtuel.gridwidth = 3;
		plateau.add(siegeDuJoueurVirtuel, gbc_siegeDuJoueurVirtuel);
		
		
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(arg!=null){
			if(arg instanceof EvenementJoueur){
				EvenementJoueur evenement= (EvenementJoueur) arg;
				switch (evenement.getEvenement()) {
				case DEFAUSSE_CARTES:
					if(demanderChoixADefausserCarte()==1){
						((VueJoueurPhysique) siegeDuJoueurPhysique.getComponent(0)).rendreToutesLesCartesValideADefausser();
						evenement.getObjet().choisirCarteADefausser(partieEnCours);
					}

				break;
				case FINIR_DEFAUSSER:
					int choix=demanderSiContinuerOuNon();
					if(choix==1){
						((VueJoueurPhysique) siegeDuJoueurPhysique.getComponent(0)).rendreToutesLesCartesValideADefausser();
						evenement.getObjet().choisirCarteADefausser(partieEnCours);
					}
				break;	
				case JOUE_CARTES:
					
				default:
					break;
				}
			}else if(arg instanceof EvenementPartie){
				EvenementPartie eve =(EvenementPartie) arg;
				switch (eve.getEvenement()) {
				case PREPARER:
					preparer();
					break;

				default:
					break;
				}
			}
		}
	}

	private int demanderSiContinuerOuNon() {
		// TODO Auto-generated method stub
		int choix;
		boolean mauvaisChoix = true;
		do {
			
			choix = JOptionPane.showConfirmDialog(this, "Voulez-vous continuer?", "Defausser cartes",
					JOptionPane.YES_NO_OPTION);
			if (choix == JOptionPane.CLOSED_OPTION) {
				if (sortir()) {
					mauvaisChoix = false;
				}
			} else {
				if (choix == JOptionPane.YES_OPTION) {
				
						JOptionPane.showMessageDialog(this, "Defaussez cartes, s'il vous plait",
								"Defausser carte", JOptionPane.PLAIN_MESSAGE);
						choix=1;
				}else{
					choix=2;
				}
			
			}
		} while (mauvaisChoix);
		return choix;
	}

}
