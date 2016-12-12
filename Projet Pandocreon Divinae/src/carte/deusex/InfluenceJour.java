package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceJour hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceJour extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public InfluenceJour(){
		this.nom = "Influence Jour";
		this.capacite = "Annule la capacité spéciale d'une carte d'Action d'Origine Nuit ou Néant.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}

}
