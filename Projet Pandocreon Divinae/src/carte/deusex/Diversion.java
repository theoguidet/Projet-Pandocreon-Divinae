package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Diversion hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Diversion extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public Diversion(){
		this.nom = "Diversion";
		this.capacite = "Prenez 3 cartes dans la main d'un autre joueur et incluez-les à votre main.";
		this.propriete = new Propriete(Origine.NUIT);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
