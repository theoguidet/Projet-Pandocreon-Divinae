package carte.divinite;

import carte.Carte;
import carte.TypeCarte;

public class Shingva extends Carte{
	public static Shingva instance;
	
	private Shingva(){
		this.nom = "Shingva";
		this.capacite = "Peut imposer le sacrifice d'un Guide Spirituel ayant le Dogme Symboles ou Nature.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public Shingva getInstance(){
		if (instance == null) {
			instance = new Shingva();
		}
		return instance;
	}

}
