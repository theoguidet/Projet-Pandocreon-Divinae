package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceJour h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceJour extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public InfluenceJour(){
		this.nom = "Influence Jour";
		this.capacite = "Annule la capacit� sp�ciale d'une carte d'Action d'Origine Nuit ou N�ant.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}

}
