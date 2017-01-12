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
import cartes.divinite.Divinite;
import controleur.ControleurPartie;
import joueurs.EvenementJoueur;
import joueurs.Joueur;
import joueurs.JoueurVirtuel;
import cartes.EvenementCarte;
import partie.EvenementPartie;
import partie.Partie;
import javax.swing.border.EtchedBorder;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseEvent;

public class FenetrePartie extends JFrame implements Observer {

	private FenetrePartie fenetrePartie;
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
	private JButton btnFinir;
	
	public FenetrePartie() {
		super();
		setTitle("PANDOCREON DIVINAE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(640, 700));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		setResizable(false);
		fenetrePartie = this;

		plateau = new JPanel();
		getContentPane().add(plateau, BorderLayout.CENTER);
		GridBagLayout gbl_plateau = new GridBagLayout();
		gbl_plateau.columnWeights = new double[] { 0.2, 0.7, 0.5 };
		gbl_plateau.rowWeights = new double[] { 0.5, 1.0, 0.0, 0.5 };
		plateau.setLayout(gbl_plateau);
		GridBagConstraints gbc = new GridBagConstraints();


		siegeDuJoueurVirtuel = new JPanel();
		siegeDuJoueurVirtuel.setLayout(new FlowLayout());
		siegeDuJoueurVirtuel.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		plateau.add(siegeDuJoueurVirtuel, gbc);

		messageAAfficher = new JTextPane();
		messageAAfficher.setEditable(false);
		messageAAfficher.setSize(new Dimension(70, 70));
		messageAAfficher.setBorder(BorderFactory.createEtchedBorder(Color.PINK, Color.GREEN));
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 1;
		plateau.add(messageAAfficher, gbc);
		
		btnFinir = new JButton("FINIR");
		btnFinir.setSize(50, 20);
		btnFinir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Partie.getUniquePartie().getJoueurEnCours().passerAction();
//			Partie.getUniquePartie().getJoueurEnCours().tourDeJeu(action+1, Partie.getUniquePartie());

			}
		});
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.VERTICAL;
		plateau.add(btnFinir, gbc);
		

		siegeDuJoueurPhysique = new JPanel();
		siegeDuJoueurPhysique.setLayout(new BorderLayout());
		siegeDuJoueurPhysique.setBorder(BorderFactory.createRaisedBevelBorder());
//		GridBagConstraints gbc_siegeDuJoueurPhysique = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 3;
		plateau.add(siegeDuJoueurPhysique, gbc);

		champ = new JPanel();
		champ.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
//		GridBagConstraints gbc_champ = new GridBagConstraints();
		champ.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 1;
		plateau.add(champ, gbc);
		

		this.setContentPane(plateau);
	}

	public JPanel getPlateau() {
		return plateau;
	}

	public JPanel getChamp() {
		return champ;
	}

	public JButton getBtnFinir() {
		return btnFinir;
	}
	
	public JPanel getSiegeDuJoueurPhysique() {
		return siegeDuJoueurPhysique;
	}

	public JPanel getSiegeDuJoueurVirtuel() {
		return siegeDuJoueurVirtuel;
	}

	public JTextPane getMessageAAfficher() {
		return messageAAfficher;
	}

//	/**
//	 * demander nombre de Joueurs dans la partie
//	 * 
//	 * @return
//	 */
//	public int demanderNbJoueurs() {
//		// TODO Auto-generated method stub
//		int nbJoueurs = 0;
//		String nbJoueur;
//		boolean mauvaischoix = true;
//		do {
//			try {
//				nbJoueur = JOptionPane.showInputDialog(this, "Combien de joueurs voulez-vous dans la partie?",
//						"Nobmre de joueurs", JOptionPane.QUESTION_MESSAGE);
//				nbJoueurs = Integer.parseInt(nbJoueur);
//				if (nbJoueurs < 2 || nbJoueurs > 7) {
//					JOptionPane.showMessageDialog(this, "Le nombre de joueurs doit etre entre 2 et 7",
//							"Nombre de joueurs", JOptionPane.WARNING_MESSAGE);
//				} else {
//					mauvaischoix = false;
//				}
//			} catch (NumberFormatException e) {
//				JOptionPane.showMessageDialog(this, "Le nombre de joueurs doit etre entier", "Nombre de joueurs:",
//						JOptionPane.WARNING_MESSAGE);
//			}
//		} while (mauvaischoix);
//		return nbJoueurs;
//	}

//	/**
//	 * demander le nom du joueur physique
//	 * 
//	 * @return
//	 */
//	public String demanderNomJoueurPhysique() {
//		String nomJoueur;
//		nomJoueur = JOptionPane.showInputDialog(this, "Entrez votre nom", "Nom du joueur physique",
//				JOptionPane.QUESTION_MESSAGE);
//
//		return nomJoueur;
//
//	}

//	/**
//	 * demander list des noms des joueurs virtuels
//	 * 
//	 * @param nbJoueurs
//	 * @return
//	 */
//	public String[] demanderListNomJoueursVirtuel(int nbJoueurs) {
//		// TODO Auto-generated method stub
//		int indice = 1;
//		String[] nomJoueursVirtuel = new String[nbJoueurs - 1];
//		while (indice <= nbJoueurs - 1) {
//			nomJoueursVirtuel[indice - 1] = JOptionPane.showInputDialog(null,
//					"Entrez le nom du joueur virtuel" + indice, "Nom du joueur virtuel", JOptionPane.QUESTION_MESSAGE);
//			indice++;
//		}
//		return nomJoueursVirtuel;
//	}

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
	 * Depose la carte choisie par joueur actuel a la champ de depose.
	 * 
	 * @param evenement
	 *            contenant la carte choisie
	 */
	private void deposerCarteAChampDeposeCarte(EvenementCarte evenement) {

		Carte objet = evenement.getObjet();
		VueCarte vueCarte = new VueCarte(objet);
		vueCarte.affichageRelle();
		champ.add(vueCarte);
	}

//	/**
//	 * afficher les choix de sacrifier Cartes du Joueur
//	 * 
//	 * @param joueurEnCours
//	 * @param carteASacrifier
//	 */
//
//	public void affichageChoixDeSacrifierDuJoueur(Joueur joueurEnCours, Carte carteASacrifier) {
//		String msg1 = null;
//		boolean mauvaisChoix = true;
//		do {
//			if (carteASacrifier.getTypeCarte() == TypeCarte.croyant
//					|| carteASacrifier.getTypeCarte() == TypeCarte.guideSpirituel) {
//				if (joueurEnCours instanceof JoueurVirtuel) {
//					msg1 = joueurEnCours.getNom() + " a sacrifie" + carteASacrifier.getTypeCarte().toString()
//							+ carteASacrifier.getNom() + "." + carteASacrifier.getNom() + "a le sacrifice "
//							+ carteASacrifier.getCapacite();
//				} else {
//					msg1 = "Vous avez sacrifie la carte " + carteASacrifier.getTypeCarte().toString()
//							+ carteASacrifier.getNom() + "." + "Cette carte a le sacrifice "
//							+ carteASacrifier.getCapacite();
//				}
//				afficher(msg1);
//			} else {
//				msg1 = "Cette carte ne peut pas etre sacrifie";
//				mauvaisChoix = false;
//			}
//		} while (mauvaisChoix);
//	}

	/**
	 * afficher les messages pendant la partie
	 */
	public void afficher(String arg) {
		messageAAfficher.setText(arg);
	}

	public int demanderChoixADefausserCarte() {
		int choix;

		choix = JOptionPane.showConfirmDialog(this, "Defausser de tout ou partie de main?", "Defausser cartes",
				JOptionPane.YES_NO_OPTION);
		
			
			if (choix == JOptionPane.YES_OPTION) {

				JOptionPane.showMessageDialog(this, "Defaussez cartes, s'il vous plait", "Defausser carte",
						JOptionPane.PLAIN_MESSAGE);
				choix = 1;

			} else if (choix == JOptionPane.NO_OPTION) {
				choix = 2;
			

		}
		attendre();
		return choix;
	}



	/**
	 * preparer du jeu
	 */
	public void preparer() {
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
			Divinite carteDiv = joueur.getDivinite();
			VueCarte vueDiv;
			vueDiv = new VueCarte(carteDiv);
			carteDiv.addObserver(this);
			//
			if (joueur instanceof JoueurVirtuel) {
				siegeDuJoueurVirtuel.add(vueJoueur);
			} else {
				siegeDuJoueurPhysique.add(vueJoueur);
			}
		}

	}

	/**
	 * construire le Plateau
	 */
	public void construirePlateau() {

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (arg != null) {
			if (arg instanceof EvenementJoueur) {
				EvenementJoueur evenement = (EvenementJoueur) arg;
				switch (evenement.getEvenement()) {
				case DEFAUSSE_CARTES:
					if (demanderChoixADefausserCarte() == 1) {
						((VueJoueurPhysique) siegeDuJoueurPhysique.getComponent(0))
								.rendreToutesLesCartesValideADefausser();
						// evenement.getObjet().choisirCarteADefausser(partieEnCours);
						
					}
					attendre();
					break;
				// case FINIR_DEFAUSSER:
				// int choix=demanderSiContinuerOuNon();
				// if(choix==1){
				// ((VueJoueurPhysique)
				// siegeDuJoueurPhysique.getComponent(0)).rendreToutesLesCartesValideADefausser();
				// evenement.getObjet().choisirCarteADefausser(partieEnCours);
				// }
				// break;
				case LANCERDE:
					affichageFaceDeDe(evenement);
					break;
				case CALCULER_POINT_ACTION:
					affichagePointActionDuJoueur(evenement);
					break;
				case NON_JOUER:
					afficher("Vous ne pouvez jouer aucune carte");
					break;
				case CARTE_POSSIBLE:
					afficher(evenement.getObjetsSupplementaires()[0].toString());
					((VueJoueurPhysique) siegeDuJoueurPhysique.getComponent(0))
							.rendreLesCartesPossibleValideAJouer(evenement.getObjetsSupplementaires()[0]);
					attendre();
					break;
				case PRESENTER_MAIN:
					presenterMainDuJoueur(evenement);
					break;
				case JOUE_CARTES:
					JOptionPane.showMessageDialog(this, "Choisissez carte a jouer");
					break;
				case SACRIFIE_CARTE:
					break;
				case PASSER_ACTION:
					int action=(int) evenement.getObjetsSupplementaires()[0];
					if(action<=4){
					Partie.getUniquePartie().getJoueurEnCours().tourDeJeu(action, Partie.getUniquePartie());
					}else{
						afficher("Le tour est passe");
						attendre();
						Partie.getUniquePartie().choisirJoueurACommencer();
					}
					break;
				case PIOCHER_CARTE:
					choixCarteAPiocher(evenement);
				default:
					break;
				}
			} else if (arg instanceof EvenementPartie) {
				EvenementPartie eve = (EvenementPartie) arg;
				switch (eve.getEvenement()) {
				case PREPARER:
					preparer();
					break;
				
				default:
					break;
				}
			} else if (arg instanceof EvenementCarte) {
				EvenementCarte eveCarte = (EvenementCarte) arg;
				switch (eveCarte.getEvenement()) {
				case EST_CHOISIE:
//					deposerCarteAChampDeposeCarte(eveCarte);
					break;
				case EST_JOUE:
					mettreEnSceneCarteAJouer(eveCarte);
					break;
				case EST_SACRIFIE:
					break;
				default:
					break;
				}
			}
		}
		super.repaint();
	}

	private void choixCarteAPiocher(EvenementJoueur evenement) {
		// TODO Auto-generated method stub
		int nbCarte= (int) evenement.getObjetsSupplementaires()[0];
		Joueur joueurAAttaquer= (Joueur) evenement.getObjetsSupplementaires()[1];
		if(evenement.getObjet() instanceof JoueurVirtuel){
			afficher(evenement.getObjet().getNom()+ " piocher 2 cartes de "+ joueurAAttaquer.getNom());
		}else{
			rendreToutesLesCartesDeJoueurAAttaquerValideAPiocher(joueurAAttaquer);
			JOptionPane.showMessageDialog(this, "Piocher 2 cartes de " +joueurAAttaquer.getNom());
		}
	}

	private void rendreToutesLesCartesDeJoueurAAttaquerValideAPiocher(Joueur joueurAAttaquer) {
		// TODO Auto-generated method stub
		
	}

	private void mettreEnSceneCarteAJouer(EvenementCarte eveCarte) {
		// TODO Auto-generated method stub
		Carte carteAJouer=eveCarte.getObjet();
		VueCarte vue= new VueCarte(carteAJouer);
		switch (carteAJouer.getTypeCarte()) {
		case croyant:
			deposerCarteAChampDeposeCarte(eveCarte);
			break;
		case guideSpirituel:
			VueJoueurPhysique vueJoueurPhysique=(VueJoueurPhysique)siegeDuJoueurPhysique.getComponent(0);
			vueJoueurPhysique.placeAJouerGuide.add(vue);
			break;
		default:
			break;
		}
	}

	private void presenterMainDuJoueur(EvenementJoueur evenement) {
		// TODO Auto-generated method stub
		Carte carte = (Carte) evenement.getObjetsSupplementaires()[0];
		System.out.println(evenement.getObjetsSupplementaires()[0]);
		VueCarte vueCarte = new VueCarte(carte);
		afficher("Completer main est en cours.....");
		if (evenement.getObjet() instanceof JoueurVirtuel) {
			VueJoueurVirtuel vueJoueur = (VueJoueurVirtuel) siegeDuJoueurVirtuel.getComponent(0);
			vueJoueur.mainDuJoueur.add(vueCarte);
		} else {
			VueJoueurPhysique vueJoueurPhysique = (VueJoueurPhysique) siegeDuJoueurPhysique.getComponent(0);
			vueJoueurPhysique.mainDuJoueur.add(vueCarte);
		}
		attendre();
	}

	private void affichagePointActionDuJoueur(EvenementJoueur evenement) {
		// TODO Auto-generated method stub
		afficher(evenement.getObjet().getDivinite().toString());
		attendre();
		afficher("Vous avez: " + evenement.getObjetsSupplementaires()[0] + "point Action Jour");
		attendre();
		afficher("Vous avez: " + evenement.getObjetsSupplementaires()[1] + "point Action Nuit");
		attendre();
		afficher("Vous avez: " + evenement.getObjetsSupplementaires()[2] + "point Action Neant");
		attendre();
	}

	/**
	 * afficher le resultat de dé
	 * 
	 * @param evenement
	 */
	private void affichageFaceDeDe(EvenementJoueur evenement) {
		// TODO Auto-generated method stub

		afficher("Le resultat du de est: " + evenement.getObjetsSupplementaires()[0].toString());
		attendre();

	}

	/**
	 * 
	 * @return
	 */
	private synchronized void attendre() {
		JOptionPane.showMessageDialog(this, "Tapez pour continuer");
	}

//	private int demanderSiContinuerOuNon() {
//		// TODO Auto-generated method stub
//		int choix;
//		boolean mauvaisChoix = true;
//		do {
//
//			choix = JOptionPane.showConfirmDialog(this, "Voulez-vous continuer?", "Continuer ou non",
//					JOptionPane.YES_NO_OPTION);
//				if (choix == JOptionPane.NO_OPTION) {
//					choix = 2;
//				}
//		} while (mauvaisChoix);
//		return choix;
//	}

}
