package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Drinded extends Divinite{
	
	public static Drinded instance;
	private Propriete propriete;
	
	private Drinded(){
		this.nom = "Drinded";
		this.capacite = "Peut emp�cher le sacrifice d'un des Guides Spirituels de n'importe quel joueur.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		this.propriete = new Propriete("NATURE", "HUMAIN","SYMBOLES", "JOUR"); 
	}
	
	public static Drinded getInstance(){
		if (instance == null) {
			instance = new Drinded();
		}
		return instance;
	}

}
