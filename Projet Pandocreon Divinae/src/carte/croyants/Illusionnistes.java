package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Illusionnistes extends Croyant{
	

	
	public Illusionnistes (){
		super();
		this.nom = "Illusionnistes";
		this.capacite = "Vous bénéficiez de la capacité spéciale de sacrifice d'une carte de Croyants appartenant à une autre Divinité. La carte en question reste en jeu.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS, Dogme.SYMBOLES, Origine.NUIT);
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
