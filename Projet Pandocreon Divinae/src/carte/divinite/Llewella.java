package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Llewella extends Divinite{
	
	public static Llewella instance;
	private Propriete propriete;
	
	private Llewella(){
		this.nom = "Llewella";
		this.capacite = "Peut obliger un joueur � poser une carte Apocalypse s'il en poss�de une.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete("NATURE", "MYSTIQUE", "CHAOS", "NUIT");
		this.propriete = p; 
	}
	
	public static Llewella getInstance(){
		if (instance == null) {
			instance = new Llewella();
		}
		return instance;
	}

}
