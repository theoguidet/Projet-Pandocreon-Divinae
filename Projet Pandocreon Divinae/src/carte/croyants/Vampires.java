package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Vampires extends Croyant{
	

	
	public Vampires (String d1, String d2, String d3){
		super();
		this.nom = "Vampires";
		this.capacite = "Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifi�. La capacit� sp�ciale du sacrifice est jou�e.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(d1, d2, d3, "NUIT");
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
