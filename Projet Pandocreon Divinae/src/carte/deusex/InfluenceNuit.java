package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceNuit hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceNuit extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public InfluenceNuit(){
		this.nom = "Influence Nuit";
		this.capacite = "Annule la capacité spéciale d'une carte d'Action d'Origine Jour ou Néant.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
