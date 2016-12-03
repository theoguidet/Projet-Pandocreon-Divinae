package carte.divinite;

import carte.Carte;
import carte.TypeCarte;

public class Killinstred extends Carte{
	
	public static Killinstred instance;
	
	private Killinstred(){
		this.nom = "Killinstred";
		this.capacite = "Peut obliger un joueur � poser une carte Apocalypse s'il en poss�de une.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public Killinstred getInstance(){
		if (instance == null) {
			instance = new Killinstred();
		}
		return instance;
	}

}
