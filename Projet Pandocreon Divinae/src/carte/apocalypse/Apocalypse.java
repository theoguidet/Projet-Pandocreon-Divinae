package carte.apocalypse;

import partie.Partie;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;
/**
 * Apocalypse hérite de la classe abstraite Carte 
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
		this.capacite = "Vous faites perdre le joueur ayant le moins de prières (4 joueurs ou plus) ou vous faites gagner le joueur ayant le plus de prières (2 ou 3 joueurs).";
		this.typeCarte = TypeCarte.apocalyspe;
		this.propriete = new Propriete(o);
	}

	/**
	 * capacité associée a l'Apocalypse
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
