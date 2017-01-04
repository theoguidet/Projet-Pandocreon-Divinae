package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import partie.Partie;
import vue.FenetrePartie;
import vue.FenetrePrincipale;

public class ControleurPartie implements ActionListener {
	private FenetrePartie fenetrePartie;

	public void commencer() {
		Partie nouvellePartie = new Partie();
		Partie.setUniquePartie(nouvellePartie);
		fenetrePartie = new FenetrePartie(FenetrePrincipale.getFenetrePrincipale());
		FenetrePrincipale.getFenetrePrincipale().getFrame().add(fenetrePartie);
		nouvellePartie.addObserver(fenetrePartie);
		JOptionPane.showMessageDialog(null, "C'est la partie de Pandocreon Divinae");
		fenetrePartie.setControleurPartie(this);
		fenetrePartie.setPartieEnCours(nouvellePartie);
//		fenetrePartie.setSize(new Dimension(500, 500));
//		fenetrePartie.setLocation(0, 0);
//		fenetrePartie.setMaximizable(true);
//		fenetrePartie.setClosable(true);
//		fenetrePartie.setResizable(true);
		fenetrePartie.setTitle("PARTIE");
		fenetrePartie.setVisible(true);
		demanderInformationDuJoueur();
		fenetrePartie.construirePlateau();
		nouvellePartie.debuterJeu();
	}

	public void demanderInformationDuJoueur() {
		int nbJoueurs = fenetrePartie.demanderNbJoueurs();
		String nomJoueur = fenetrePartie.demanderNomJoueurPhysique();
		String[] listNomJoueurVirtuel = fenetrePartie.demanderListNomJoueursVirtuel(nbJoueurs);
		Partie.getUniquePartie().initialiserJoueurs(nbJoueurs, nomJoueur, listNomJoueurVirtuel);
	}

	public void demanderADefausserCarte() {
		fenetrePartie.demanderChoixADefausserCarte();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		commencer();
	}

}
