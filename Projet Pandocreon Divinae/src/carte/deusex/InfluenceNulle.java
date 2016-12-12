package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceNulle h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceNulle extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public InfluenceNulle(){
		this.nom = "Influence Nulle";
		this.capacite = "Annule la capacit� sp�ciale d'une autre carte d'Action.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
