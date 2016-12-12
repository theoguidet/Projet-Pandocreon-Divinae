package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Concentration hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Concentration extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Concentration(){
		this.nom = "Concentration";
		this.capacite = "Vous récupérez un des Guides Spirituels posés devant une autre Divinité et le placez devant vous avec les Croyants qui y sont attachés.";
		this.propriete = new Propriete(Origine.NEANT);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
