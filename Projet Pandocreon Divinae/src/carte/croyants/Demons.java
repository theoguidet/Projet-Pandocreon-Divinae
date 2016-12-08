package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Demons extends Croyant{
	

	
	public Demons (Dogme d1, Dogme d2, Dogme d3){
		super();
		this.nom = "Demons";
		this.capacite = "Donne un point d'Action d'Origine Nuit.";
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, Origine.NUIT);
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}