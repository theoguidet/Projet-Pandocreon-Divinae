package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Integristes extends Croyant{
	

	
	public Integristes (){
		super();
		this.nom = "Integristes";
		this.capacite = "Impose le sacrifice d'un Guide Spirituel d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.NATURE, Dogme.CHAOS, Origine.JOUR);
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
