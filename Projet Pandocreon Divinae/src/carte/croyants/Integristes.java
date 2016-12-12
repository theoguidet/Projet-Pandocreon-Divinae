package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Integristes hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Integristes extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Integristes (){
		super();
		this.nom = "Integristes";
		this.capacite = "Impose le sacrifice d'un Guide Spirituel d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.NATURE, Dogme.CHAOS, Origine.JOUR);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacité de la carte
	 */
	public void sacrifice(){
		
	}
}
