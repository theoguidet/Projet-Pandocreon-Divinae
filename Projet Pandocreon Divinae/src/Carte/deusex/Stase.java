package Carte.deusex;

import Carte.TypeCarte;
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
	public Stase(int idStase){
		this.nom = "Stase";
		this.capacite = "Prot�ge un Guide Spirituel et ses Croyants jusqu'� ce que cette carte soit annul�e ou jusqu'� la prochaine tentative d'Apocalypse.";
		this.propriete = new Propriete(Origine.JOUR);
		this.setIdCarte(idStase);
		this.typeCarte=TypeCarte.deusEx;
	}

	/**
	 * capacit� de la carte
	 */
	@Override
	public void utiliserCapacite(){

	}
}
