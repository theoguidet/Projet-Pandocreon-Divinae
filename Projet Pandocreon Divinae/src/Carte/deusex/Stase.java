package Carte.deusex;

import Carte.TypeCarte;
import propriete.Origine;
import propriete.Propriete;

/**
 * Stase hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Stase extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Stase(int idStase){
		this.nom = "Stase";
		this.capacite = "Protège un Guide Spirituel et ses Croyants jusqu'à ce que cette carte soit annulée ou jusqu'à la prochaine tentative d'Apocalypse.";
		this.propriete = new Propriete(Origine.JOUR);
		this.setIdCarte(idStase);
		this.typeCarte=TypeCarte.deusEx;
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){

	}
}
