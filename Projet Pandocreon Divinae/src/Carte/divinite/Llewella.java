package Carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Carte.Carte;
import Carte.TypeCarte;

/**
 * Llewella hérite de Divinite
 * représente une carte divinité du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Llewella extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Llewella instance;
	
	/**
	 * constructeur privé de la classe 
	 */
	private Llewella(){
		this.nom = "Llewella";
		this.capacite = "Peut obliger un joueur à poser une carte Apocalypse s'il en possède une.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.NATURE, Dogme.MYSTIQUE, Dogme.CHAOS, Origine.NUIT);
		this.propriete = p; 
	}
	
	/**
	 * méthode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Llewella getInstance(){
		if (instance == null) {
			instance = new Llewella();
		}
		return instance;
	}

}
