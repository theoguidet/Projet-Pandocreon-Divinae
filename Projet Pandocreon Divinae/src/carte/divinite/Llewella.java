package carte.divinite;

import carte.Carte;
import carte.TypeCarte;

public class Llewella extends Carte{
	
	public static Llewella instance;
	
	private Llewella(){
		this.nom = "Llewella";
		this.capacite = "Peut obliger un joueur � poser une carte Apocalypse s'il en poss�de une.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public Llewella getInstance(){
		if (instance == null) {
			instance = new Llewella();
		}
		return instance;
	}

}