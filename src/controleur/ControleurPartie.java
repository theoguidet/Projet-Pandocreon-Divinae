package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import cartes.Carte;
import cartes.EvenementCarte;
import cartes.TypeCarte;
import cartes.divinite.Divinite;
import joueurs.EvenementJoueur;
import joueurs.Joueur;
import joueurs.JoueurVirtuel;
import partie.EvenementPartie;
import partie.Partie;
import vue.FenetrePartie;
import vue.FenetrePrincipale;
import vue.VueCarte;
import vue.VueJoueur;
import vue.VueJoueurPhysique;
import vue.VueJoueurVirtuel;

public class ControleurPartie{
	private FenetrePartie fenetrePartie;
	private FenetrePrincipale fenetrePrincipale;

	public ControleurPartie(){
		fenetrePrincipale = new FenetrePrincipale();
		fenetrePrincipale.getBtnPartie().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				commencer();

			}
		});
		fenetrePrincipale.getBtnSortie().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				fenetrePrincipale.dispose();
			}
		});
	}
	
	public void commencer() {
		Partie nouvellePartie = new Partie();
		Partie.setUniquePartie(nouvellePartie);
		fenetrePrincipale.setVisible(false);
		fenetrePrincipale.dispose();
		fenetrePartie = new FenetrePartie();
		fenetrePartie.getBtnFinir().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Partie.getUniquePartie().getJoueurEnCours().passerAction();
//			Partie.getUniquePartie().getJoueurEnCours().tourDeJeu(action+1, Partie.getUniquePartie());

			}
		});
		
		nouvellePartie.addObserver(fenetrePartie);
		JOptionPane.showMessageDialog(null, "C'est la partie de Pandocreon Divinae");
//		fenetrePartie.setControleurPartie(this);
//		fenetrePartie.setPartieEnCours(nouvellePartie);
//		fenetrePartie.setSize(new Dimension(500, 500));
//		fenetrePartie.setLocation(0, 0);
//		fenetrePartie.setMaximizable(true);
//		fenetrePartie.setClosable(true);
//		fenetrePartie.setResizable(true);
		fenetrePartie.setTitle("PARTIE");
		demanderInformationDuJoueur();
		fenetrePartie.construirePlateau();
		nouvellePartie.debuterJeu();
//		ArrayList<Joueur> listJ=nouvellePartie.getJoueurs();
//		Iterator<Joueur> it= listJ.iterator();
//		while(it.hasNext()){
//			Joueur j= it.next();
//			System.out.println(j.getNom());
//		}
	}

	public void demanderInformationDuJoueur() {
		int nbJoueurs = demanderNbJoueurs();
		String nomJoueur = demanderNomJoueurPhysique();
		String[] listNomJoueurVirtuel = demanderListNomJoueursVirtuel(nbJoueurs);
		Partie.getUniquePartie().initialiserJoueurs(nbJoueurs, nomJoueur, listNomJoueurVirtuel);
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
			nomJoueursVirtuel[indice - 1] = JOptionPane.showInputDialog(null,
					"Entrez le nom du joueur virtuel" + indice, "Nom du joueur virtuel", JOptionPane.QUESTION_MESSAGE);
			indice++;
		}
		return nomJoueursVirtuel;
	}

	/**
	 * demander le nom du joueur physique
	 * 
	 * @return
	 */
	public String demanderNomJoueurPhysique() {
		String nomJoueur;
		nomJoueur = JOptionPane.showInputDialog(null, "Entrez votre nom", "Nom du joueur physique",
				JOptionPane.QUESTION_MESSAGE);

		return nomJoueur;

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
				nbJoueur = JOptionPane.showInputDialog(null, "Combien de joueurs voulez-vous dans la partie?",
						"Nobmre de joueurs", JOptionPane.QUESTION_MESSAGE);
				nbJoueurs = Integer.parseInt(nbJoueur);
				if (nbJoueurs < 2 || nbJoueurs > 7) {
					JOptionPane.showMessageDialog(null, "Le nombre de joueurs doit etre entre 2 et 7",
							"Nombre de joueurs", JOptionPane.WARNING_MESSAGE);
				} else {
					mauvaischoix = false;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Le nombre de joueurs doit etre entier", "Nombre de joueurs:",
						JOptionPane.WARNING_MESSAGE);
			}
		} while (mauvaischoix);
		return nbJoueurs;
	}
	
	/**
	 * afficher les messages pendant la partie
	 */
	public void afficher(String arg) {
		fenetrePartie.getMessageAAfficher().setText(arg);
	}
	
	
	private synchronized void attendre() {
		JOptionPane.showMessageDialog(null, "Tapez pour continuer");
	}
}
