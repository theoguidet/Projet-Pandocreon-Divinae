package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Revenants hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Revenant extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Revenant (){
		super();
		this.nom = "Revenant";
		this.capacite = "Lancez le dé de Cosmogonie. Le tour se fini normalement, mais sous cette nouvelle influence.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUE, Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacité de la carte
	 */
	public void sacrifice(){
		
	}
}
