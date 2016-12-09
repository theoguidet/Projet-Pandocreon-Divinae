package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Shingva extends Divinite{
	public static Shingva instance;
	private Propriete propriete;
	
	private Shingva(){
		this.nom = "Shingva";
		this.capacite = "Peut imposer le sacrifice d'un Guide Spirituel ayant le Dogme Symboles ou Nature.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete("HUMAIN", "MYSTIQUE", "CHAOS", "AUBE");
		this.propriete = p; 
	}
	
	public static Shingva getInstance(){
		if (instance == null) {
			instance = new Shingva();
		}
		return instance;
	}

}
