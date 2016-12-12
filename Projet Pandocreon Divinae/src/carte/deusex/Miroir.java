package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Miroir hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Miroir extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public Miroir(){
		this.nom = "Miroir";
		this.capacite = "Retourne les effets d'une carte d'Action sur la Divinité qui l'a posée.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
