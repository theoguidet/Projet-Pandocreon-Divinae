package Carte.deusex;

import Carte.TypeCarte;
import Joueur.Joueur;
import propriete.Origine;
import propriete.Propriete;

/**
 * Diversion h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Diversion extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public Diversion(int idDiversion){
		this.nom = "Diversion";
		this.capacite = "Prenez 3 cartes dans la main d'un autre joueur et incluez-les � votre main.";
		this.propriete = new Propriete(Origine.NUIT);
		this.setIdCarte(idDiversion);
		this.typeCarte=TypeCarte.deusEx;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Prenez 3 cartes dans la main
		d'un autre joueur et
		incluez-les � votre main.
		 */
		
		Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
		this.getProprietaire().piocherCarte(3, joueurAAttaquer);
	}
}
