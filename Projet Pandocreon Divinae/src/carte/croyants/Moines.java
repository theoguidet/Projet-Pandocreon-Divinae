package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Moines extends Croyant{
	

	
	public Moines (String d1, String d2, String d3){
		super();
		this.nom = "Moines";
		this.capacite = "Donne un point d'Action d'Origine Jour.";
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, "JOUR");
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
