package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Phoenix h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Phoenix extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Phoenix(){
		this.nom = "Phoenix";
		this.capacite = "Permet de b�n�ficier de la capacit� sp�ciale de l'un de vos Croyants ou Guides Spirituels sans sacrifier la carte.";
		this.propriete = new Propriete(Origine.JOUR);
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){

	}
}
