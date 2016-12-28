package controleur;

import javax.swing.JOptionPane;

import partie.Partie;
import vue.FenetrePartie;
import vue.FenetrePrincipale;


public class ControleurPartie {
	private FenetrePartie fenetrePartie;
	public void commencer(){
		Partie nouvellePartie= 	Partie.getUniquePartie();
	
		fenetrePartie.setTitle("PARTIE");
		fenetrePartie.setVisible(true);
		nouvellePartie.addObserver(fenetrePartie);
		JOptionPane.showMessageDialog(null, "C'est la partie de Pandocreon Divinae");
		fenetrePartie.setControleurPartie(this);
		demanderInformationDuJoueur();
		nouvellePartie.creationJeuDeCarte();
		nouvellePartie.distribuerDivinites();
		nouvellePartie.distribuerCarte();
		
	}
	public void demanderInformationDuJoueur(){
		int nbJoueurs= fenetrePartie.demanderNbJoueurs();
		String nomJoueur= fenetrePartie.demanderNomJoueurPhysique();
		String[] listNomJoueurVirtuel= fenetrePartie.demanderListNomJoueursVirtuel(nbJoueurs);
		Partie.getUniquePartie().initialiserJoueurs(nbJoueurs, nomJoueur, listNomJoueurVirtuel);
	}
	

}
