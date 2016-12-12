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
public class Moines extends Croyant{
	

	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 */
	public Moines (Dogme d1, Dogme d2, Dogme d3){
		super();
		this.nom = "Moines";
		this.capacite = "Donne un point d'Action d'Origine Jour.";
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, Origine.JOUR);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacité de la carte
	 */
	public void sacrifice(){
		
	}
}
