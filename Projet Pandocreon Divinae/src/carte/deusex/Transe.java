package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Transe hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Transe extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Transe(){
		this.nom = "Transe";
		this.capacite = "Permet de récupérer les effets bénéfiques d'une carte d'Action posée par une autre Divinité. S'il s'agit d'une carte Croyants ou Guide Spirituel, vous posez la carte devant vous.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
