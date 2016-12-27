package Carte.deusex;

import Carte.TypeCarte;
import propriete.Origine;
import propriete.Propriete;

/**
 * Transe h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Transe extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Transe(){
		this.nom = "Transe";
		this.capacite = "Permet de r�cup�rer les effets b�n�fiques d'une carte d'Action pos�e par une autre Divinit�. S'il s'agit d'une carte Croyants ou Guide Spirituel, vous posez la carte devant vous.";
		this.propriete = new Propriete(Origine.NULL);
		this.typeCarte=TypeCarte.deusEx;
	}
	
	/**
	 * capacit� de la carte
	 */
	@Override
	public void utiliserCapacite(){
		
	}
}
