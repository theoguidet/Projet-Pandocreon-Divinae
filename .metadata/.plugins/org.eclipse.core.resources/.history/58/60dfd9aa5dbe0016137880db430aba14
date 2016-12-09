package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Killinstred extends Divinite{
	
	public static Killinstred instance;
	private Propriete propriete;
	
	private Killinstred(){
		this.nom = "Killinstred";
		this.capacite = "Peut obliger un joueur à poser une carte Apocalypse s'il en possède une.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.NATURE, Dogme.MYSTIQUE, Dogme.CHAOS, Origine.NUIT);
		this.propriete = p; 
	}
	
	public static Killinstred getInstance(){
		if (instance == null) {
			instance = new Killinstred();
		}
		return instance;
	}

}
