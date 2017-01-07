package joueurs;

public class EvenementJoueur {
/**
 * evenement du joueur
 */
	private EvenementJoueurType evenement;

	private Joueur objet;
	/**
	 * objets supplementaires
	 */
	private Object[] objetsSupplementaires;

	public Object[] getObjetsSupplementaires() {
		return objetsSupplementaires;
	}

	public void setObjetsSupplementaires(Object[] objetsSupplementaires) {
		this.objetsSupplementaires = objetsSupplementaires;
	}

	/**
	 * @param evenement
	 * @param objet
	 */
	public EvenementJoueur(EvenementJoueurType evenement, Joueur objet) {
		this.evenement = evenement;
		this.objet = objet;
	}
	public EvenementJoueur(EvenementJoueurType evenement, Joueur objet, Object[] objetsSupplementaires){
		this.evenement= evenement;
		this.objet= objet;
		this.objetsSupplementaires= objetsSupplementaires;
	}

	public EvenementJoueurType getEvenement() {
		return evenement;
	}

	public Joueur getObjet() {
		return objet;
	}

}
