package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceNeant hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceNeant extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public InfluenceNeant(){
		this.nom = "Influence Neant";
		this.capacite = "Annule la capacité spéciale d'une carte d'Action d'Origine Jour ou Nuit.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
