package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Diversion h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Diversion extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public Diversion(){
		this.nom = "Diversion";
		this.capacite = "Prenez 3 cartes dans la main d'un autre joueur et incluez-les � votre main.";
		this.propriete = new Propriete(Origine.NUIT);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
