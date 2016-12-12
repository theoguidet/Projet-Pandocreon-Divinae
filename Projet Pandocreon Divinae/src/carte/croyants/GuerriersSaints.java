package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * GuerriersSaints h�rite de Croyant
 * repr�sente une carte du jeu
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
		this.capacite = "Un Guide Spirituel revient dans la main de sa Divinit�. Ses Croyants reviennent au centre de la table.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.SYMBOLES, Origine.JOUR);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� effectu�e lors du sacrifice de la carte
	 */
	public void sacrifice(){
		
	}
}
