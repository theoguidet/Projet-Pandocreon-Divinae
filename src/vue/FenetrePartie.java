package vue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

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
import partie.Partie;

public class FenetrePartie extends JInternalFrame implements Observer {

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

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

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

	public void demanderADefausserCarte(EvenementJoueur evenement) {
		int choix;
		int indice1;
		String indice2;
		boolean mauvaisChoix = true;
		do {
			choix = JOptionPane.showConfirmDialog(this, "Defausser de tout ou partie de main?", "Defausser cartes",
					JOptionPane.YES_NO_OPTION);
			if (choix == JOptionPane.CLOSED_OPTION) {
				if (sortir()) {
					mauvaisChoix = false;
				}
			} else {
				if (choix == JOptionPane.YES_OPTION) {
					try {
						indice2 = JOptionPane.showInputDialog(this, "Entrez le numero de la carte a defausse",
								"Defausser carte", JOptionPane.QUESTION_MESSAGE);
						indice1 = Integer.parseInt(indice2);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(this, "Le numero doit etre un entier", "Input Invalide",
								JOptionPane.WARNING_MESSAGE);
					}

				}
			}
		} while (mauvaisChoix);

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
			if(joueur instanceof JoueurVirtuel){
				siegeDuJoueurPhysique.add(vueJoueur);
			}else{
				siegeDuJoueurVirtuel.add(vueJoueur);
			}
		}

	}

	/**
	 * construire le Plateau
	 */
	public void construirePlateau() {

	}

}
