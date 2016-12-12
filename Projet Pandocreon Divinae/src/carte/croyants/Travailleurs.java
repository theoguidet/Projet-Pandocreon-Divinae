package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Travailleurs hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Travailleurs extends Croyant{
	

	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 */
	public Travailleurs (Dogme d1, Dogme d2, Dogme d3, String capacite){
		super();
		this.nom = "Travaileurs";
		this.capacite = capacite;
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
