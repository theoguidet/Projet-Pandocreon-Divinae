package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Vampires h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Vampires extends Croyant{
	
	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 */
	public Vampires (Dogme d1, Dogme d2, Dogme d3){
		super();
		this.nom = "Vampires";
		this.capacite = "Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifi�. La capacit� sp�ciale du sacrifice est jou�e.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(d1, d2, d3, Origine.NUIT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void sacrifice(){
		
	}
}
