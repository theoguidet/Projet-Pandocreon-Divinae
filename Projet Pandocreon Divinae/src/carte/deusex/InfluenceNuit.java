package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceNuit h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceNuit extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public InfluenceNuit(){
		this.nom = "Influence Nuit";
		this.capacite = "Annule la capacit� sp�ciale d'une carte d'Action d'Origine Jour ou N�ant.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
