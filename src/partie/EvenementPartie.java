package partie;

public class EvenementPartie {
	/**
	 * evenement de la partie
	 */
	private EvenementPartieType evenement;
	private Partie objetPartie;
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

	public EvenementPartie(EvenementPartieType eve,Partie partie){
		this.objetPartie= partie;
		this.evenement=eve;
	}
	public EvenementPartie(EvenementPartieType eve, Partie partie, Object[] objetsSupplementaires ){
		this.objetPartie=partie;
		this.evenement=eve;
		this.objetsSupplementaires= objetsSupplementaires;
	}

	public EvenementPartieType getEvenement() {
		return evenement;
	}

	public void setEvenement(EvenementPartieType evenement) {
		this.evenement = evenement;
	}

	public Partie getObjetPartie() {
		return objetPartie;
	}

	public void setObjetPartie(Partie objetPartie) {
		this.objetPartie = objetPartie;
	}
}
