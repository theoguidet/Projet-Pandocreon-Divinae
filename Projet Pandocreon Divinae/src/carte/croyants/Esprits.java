package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Esprits extends Croyant{
	

	
	public Esprits (Dogme d1, Dogme d2, Dogme d3){
		super();
		this.nom = "Esprits";
		this.capacite = "Donne un point d'Action d'Origine Néant.";
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
