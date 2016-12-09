package carte.divinite;

import propriete.Dogme; 
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Brewalen extends Divinite{
	
	public static Brewalen instance;
	
	private Brewalen(){
		this.nom = "Brewalen";
		this.capacite = "Peut emp�cher l'utilisation d'une carte Apocalypse. La carte est d�fauss�e.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		this.propriete = new Propriete("NATURE", "HUMAIN", "MYSTIQUE", "JOUR");
	}
	
	public static Brewalen getInstance(){
		if (instance == null) {
			instance = new Brewalen();
		}
		return instance;
	}
}
