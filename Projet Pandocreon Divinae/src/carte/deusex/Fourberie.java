package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Fourberie hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Fourberie extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public Fourberie(){
		this.nom = "Fourberie";
		this.capacite = "Sacrifiez 2 cartes Croyants d'une autre Divinité. Les capacités spéciales ne sont pas jouées.";
		this.propriete = new Propriete(Origine.NUIT);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
