package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * GuerriersSaints hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class GuerriersSaints extends Croyant{
	

	/**
	 * contructeur de la classe
	 */
	public GuerriersSaints (){
		super();
		this.nom = "Guerriers Saints";
		this.capacite = "Un Guide Spirituel revient dans la main de sa Divinité. Ses Croyants reviennent au centre de la table.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.SYMBOLES, Origine.JOUR);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacité effectuée lors du sacrifice de la carte
	 */
	public void sacrifice(){
		
	}
}
