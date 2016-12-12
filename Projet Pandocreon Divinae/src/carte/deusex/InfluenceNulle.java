package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceNulle hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceNulle extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public InfluenceNulle(){
		this.nom = "Influence Nulle";
		this.capacite = "Annule la capacité spéciale d'une autre carte d'Action.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
