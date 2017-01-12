package vue;

import javax.swing.JLabel;
import javax.swing.JPanel;

import joueurs.Joueur;

public class VueJoueur extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1154320634819110429L;
	/**
	 * main du joueur
	 */
	protected JPanel mainDuJoueur;
	/**
	 * nom du joueur
	 */
	protected JLabel nomDuJoueur;
	/**
	 * point action du joueur
	 */
	protected JLabel pointActionJoueur;
	/**
	 * score
	 */
	protected JLabel score;
	/**
	 * place a mettre les Croyant a rattacher
	 */
	protected JPanel placeAGarderCroyant;
	/**
	 * place a mettre les Guides Spirituels a jouer
	 */
	protected JPanel placeAJouerGuide;
	
}
