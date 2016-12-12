package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Revenants h�rite de Croyant
 * repr�sente une carte du jeu
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
		this.capacite = "Lancez le d� de Cosmogonie. Le tour se fini normalement, mais sous cette nouvelle influence.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUE, Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void sacrifice(){
		
	}
}
