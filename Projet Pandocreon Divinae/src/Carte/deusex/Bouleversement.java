package Carte.deusex;

import Carte.TypeCarte;
import propriete.Origine;
import propriete.Propriete;

/**
 * Bouleversement hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Bouleversement extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Bouleversement(int idBouleversement){
		this.nom = "Bouleversement";
		this.capacite = "Relancez le dé de Cosmogonie. Le tour de jeu se terminera normalement, mais sous la nouvelle influence.";
		this.propriete = new Propriete(Origine.NULL);
		this.typeCarte=TypeCarte.deusEx;
		this.setIdCarte(idBouleversement);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Relancez le dé de Cosmogonie.
			Le tour de jeu se terminera
			normalement, mais sous la
			nouvelle influence
		 */
		this.getProprietaire().lancerDe();
		
		
	}
}
