package vue;

import javax.swing.JPanel;

import joueurs.Joueur;

import java.awt.BorderLayout;

public class MainDuJoueurPhysique extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private Joueur proprietaire;
	
	public MainDuJoueurPhysique() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel CartesActuelles = new JPanel();
		add(CartesActuelles);

	}

}
