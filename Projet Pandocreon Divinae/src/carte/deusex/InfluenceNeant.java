package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceNeant h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceNeant extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public InfluenceNeant(){
		this.nom = "Influence Neant";
		this.capacite = "Annule la capacit� sp�ciale d'une carte d'Action d'Origine Jour ou Nuit.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
