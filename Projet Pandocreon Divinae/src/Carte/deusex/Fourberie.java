package Carte.deusex;

import Carte.Carte;
import Carte.TypeCarte;
import Joueur.Joueur;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;

/**
 * Fourberie hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Fourberie extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public Fourberie(int idFourberie){
		this.nom = "Fourberie";
		this.capacite = "Sacrifiez 2 cartes Croyants d'une autre Divinité. Les capacités spéciales ne sont pas jouées.";
		this.propriete = new Propriete(Origine.NUIT);
		this.typeCarte= TypeCarte.deusEx;
		this.setIdCarte(idFourberie);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Sacrifiez 2 cartes Croyants
		d'une autre Divinité. Les
		capacités spéciales ne sont pas
		jouées.

		 */
		int indice;
		Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
		for(indice=0;indice<2;indice++){
			Carte carteVictime=joueurAAttaquer.choisirCarteVictime(TypeCarte.croyant);
			Partie.getUniquePartie().ajouterADefausse(carteVictime);
			joueurAAttaquer.getMain().remove(carteVictime);
			indice++;
		}
	}
}
