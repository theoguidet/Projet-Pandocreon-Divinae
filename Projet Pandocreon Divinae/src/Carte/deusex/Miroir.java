package Carte.deusex;

import Carte.TypeCarte;
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
	public Miroir(int idMiroir){
		this.nom = "Miroir";
		this.capacite = "Retourne les effets d'une carte d'Action sur la Divinité qui l'a posée.";
		this.propriete = new Propriete(Origine.NULL);
		this.setIdCarte(idMiroir);
		this.typeCarte=TypeCarte.deusEx;
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Retourne les effets d'une carte d'Action sur la Divinité qui l'a posée.
		 */
		
		
	}
}
