package partie;

public class EvenementPartie {
	/**
	 * evenement de la partie
	 */
	private EvenementPartieType evenement;
	private Partie objetPartie;
	
	public EvenementPartie(EvenementPartieType eve,Partie partie){
		this.objetPartie= partie;
		this.evenement=eve;
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
