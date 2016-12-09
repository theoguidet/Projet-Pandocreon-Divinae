package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Demons extends Croyant{
	

	
	public Demons (String d1, String d2, String d3){
		super();
		this.nom = "Demons";
		this.capacite = "Donne un point d'Action d'Origine Nuit.";
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, "NUIT");
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
