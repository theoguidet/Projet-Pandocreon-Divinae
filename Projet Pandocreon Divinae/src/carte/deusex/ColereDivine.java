package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * ColereDivine hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class ColereDivine extends DeusEx{

	/**
	 * constructeur de la classe
	 * @param o
	 * 		Origine de la carte
	 */
	public ColereDivine(Origine o){
		this.nom = "ColereDivine";
		this.capacite = "Détruit une carte Guide Spirituel d'Origine Nuit ou Néant, dont la capacité spéciale n'a pas effet. Les Croyants attachés reviennent au centre de la table.";
		this.propriete = new Propriete(o);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
