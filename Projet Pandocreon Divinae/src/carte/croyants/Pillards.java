package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Pillards extends Croyant{
	

	
	public Pillards (){
		super();
		this.nom = "Pillards";
		this.capacite = "Récupérez les points d'Action d'une Divinité n'ayant pas encore joué durant ce tour. Les points d'Action gardent leur Origine. La Divinité perd ses points.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.NATURE, Dogme.SYMBOLES, Origine.NUIT);
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
