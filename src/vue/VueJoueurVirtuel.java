package vue;

import javax.swing.JPanel;

import joueurs.Joueur;

public class VueJoueurVirtuel extends VueJoueur {
	public VueJoueurVirtuel(Joueur joueurVirtuel){
		super();
		this.mainDuJoueur = new JPanel();
	}

}
