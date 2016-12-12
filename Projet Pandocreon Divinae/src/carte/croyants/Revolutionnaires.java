package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Moines hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Revolutionnaires extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Revolutionnaires (){
		super();
		this.nom = "Révolutionnaires";
		this.capacite = "Imposez le sacrifice d'une carte de Croyants à autant de Divinités que vous le voulez. Chaque Divinité choisit la carte à sacrifier. Les capacités spéciales sont jouées";
		this.nbCroyants= 2;
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS, Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacité de la carte
	 */
	public void sacrifice(){
		
	}
}