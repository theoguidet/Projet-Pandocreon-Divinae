package joueurs;

public class EvenementJoueur {
/**
 * evenement du joueur
 */
	private EvenementJoueurType evenement;

	private Joueur objet;

	/**
	 * @param evenement
	 * @param objet
	 */
	public EvenementJoueur(EvenementJoueurType evenement, Joueur objet) {
		this.evenement = evenement;
		this.objet = objet;
	}

	public EvenementJoueurType getEvenement() {
		return evenement;
	}

	public Joueur getObjet() {
		return objet;
	}

}
