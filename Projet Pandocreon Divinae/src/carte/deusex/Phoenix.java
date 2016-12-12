package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Phoenix hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Phoenix extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Phoenix(){
		this.nom = "Phoenix";
		this.capacite = "Permet de bénéficier de la capacité spéciale de l'un de vos Croyants ou Guides Spirituels sans sacrifier la carte.";
		this.propriete = new Propriete(Origine.JOUR);
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){

	}
}
