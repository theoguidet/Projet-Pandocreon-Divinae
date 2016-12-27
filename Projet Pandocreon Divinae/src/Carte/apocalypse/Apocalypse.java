package Carte.apocalypse;

import Carte.Carte;
import Carte.TypeCarte;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;
/**
 * Apocalypse h�rite de la classe abstraite Carte 
 * @author Admin
 *
 */
public class Apocalypse extends Carte{
	
	/**
	 * Constructeur de la classe
	 * @param o
	 * 		Origine de l'Apocalypse
	 */
	public Apocalypse(Origine o){
		super();
		this.nom = "Apocalypse";
		this.capacite = "Vous faites perdre le joueur ayant le moins de pri�res (4 joueurs ou plus) ou vous faites gagner le joueur ayant le plus de pri�res (2 ou 3 joueurs).";
		this.typeCarte = TypeCarte.apocalyspe;
		this.propriete = new Propriete(o);
	}

	/**
	 * capacit� associ�e a l'Apocalypse
	 * @param p
	 * 		partie en cours
	 */
	public void utiliserCapacite(Partie p){
		if (p.getNbJoueur() >= 4) {
			p.supprimerJoueur();
		}else{
			p.determinerGagnant();
		}
	}
}
