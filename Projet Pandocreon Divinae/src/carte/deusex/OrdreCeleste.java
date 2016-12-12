package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * OrdreCeleste hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class OrdreCeleste extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public OrdreCeleste(){
		this.nom = "Ordre Celeste";
		this.capacite = "Vous récupérez un des Guides Spirituels posés devant une autre Divinité et le placez devant vous avec les Croyants qui y sont attachés.";
		this.propriete = new Propriete(Origine.JOUR);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
