package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Travailleurs extends Croyant{
	

	
	public Travailleurs (String d1, String d2, String d3, String capacite){
		super();
		this.nom = "Travaileurs";
		this.capacite = capacite;
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, "JOUR");
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
