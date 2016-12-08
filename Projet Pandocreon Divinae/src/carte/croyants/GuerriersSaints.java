package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class GuerriersSaints extends Croyant{
	

	
	public GuerriersSaints (){
		super();
		this.nom = "Guerriers Saints";
		this.capacite = "Un Guide Spirituel revient dans la main de sa Divinité. Ses Croyants reviennent au centre de la table.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.NATURE, Dogme.SYMBOLES, Origine.JOUR);
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
