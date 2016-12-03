package carte;

public class Drinded extends Carte{
	
	public static Drinded instance;
	
	private Drinded(){
		this.nom = "Drinded";
		this.capacite = "Peut empêcher le sacrifice d'un des Guides Spirituels de n'importe quel joueur.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public Drinded getInstance(){
		if (instance == null) {
			instance = new Drinded();
		}
		return instance;
	}

}
