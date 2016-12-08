package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Ermite extends Croyant{
	

	
	public Ermite (Dogme d1, Dogme d2, Dogme d3){
		super();
		this.nom = "Ermite";
		this.capacite = "Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. La capacit� sp�ciale du sacrifice est jou�e.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(d1, d2, d3, Origine.JOUR);
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
