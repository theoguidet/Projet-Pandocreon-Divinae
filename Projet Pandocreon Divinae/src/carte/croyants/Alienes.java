package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Alienes hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Alienes extends Croyant{
	

	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 * @param capacite
	 * 		description de la capacité de la carte
	 */
	public Alienes (Dogme d1, Dogme d2, Dogme d3, String capacite){
		super();
		this.nom = "Aliénés";
		this.capacite = capacite;
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacité effectuée lors du sacrifice de la carte
	 */
	public void sacrifice(){
		
	}
}
