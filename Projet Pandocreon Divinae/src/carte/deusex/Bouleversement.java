package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Bouleversement h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Bouleversement extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Bouleversement(){
		this.nom = "Bouleversement";
		this.capacite = "Relancez le d� de Cosmogonie. Le tour de jeu se terminera normalement, mais sous la nouvelle influence.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
