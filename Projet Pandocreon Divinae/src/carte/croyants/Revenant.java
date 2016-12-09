package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Revenant extends Croyant{
	

	
	public Revenant (){
		super();
		this.nom = "Revenant";
		this.capacite = "Lancez le d� de Cosmogonie. Le tour se fini normalement, mais sous cette nouvelle influence.";
		this.nbCroyants= 1;
		this.propriete = new Propriete("HUMAIN", "NATURE", "MYSTIQUE", "NEANT");
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
