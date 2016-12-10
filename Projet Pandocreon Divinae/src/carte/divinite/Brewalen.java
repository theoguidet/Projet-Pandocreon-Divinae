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
		this.capacite = "Peut empêcher l'utilisation d'une carte Apocalypse. La carte est défaussée.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		this.propriete = new Propriete(Dogme.NATURE, Dogme.HUMAIN, Dogme.MYSTIQUE, Origine.JOUR);
	}
	
	public static Brewalen getInstance(){
		if (instance == null) {
			instance = new Brewalen();
		}
		return instance;
	}
}
