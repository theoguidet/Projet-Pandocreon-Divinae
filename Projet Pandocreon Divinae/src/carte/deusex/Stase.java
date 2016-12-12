package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Stase h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Stase extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Stase(){
		this.nom = "Stase";
		this.capacite = "Prot�ge un Guide Spirituel et ses Croyants jusqu'� ce que cette carte soit annul�e ou jusqu'� la prochaine tentative d'Apocalypse.";
		this.propriete = new Propriete(Origine.JOUR);
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){

	}
}
