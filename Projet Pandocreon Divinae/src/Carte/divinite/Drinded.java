package Carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Carte.TypeCarte;

/**
 * Drinded hérite de Divinite
 * représente une carte divinité du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Drinded extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Drinded instance;
	
	/**
	 * constructeur privé de la classe 
	 */
	private Drinded(){
		this.nom = "Drinded";
		this.capacite = "Peut empêcher le sacrifice d'un des Guides Spirituels de n'importe quel joueur.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		this.propriete = new Propriete(Dogme.NATURE, Dogme.HUMAIN,Dogme.SYMBOLES, Origine.JOUR); 
	}
	
	/**
	 * méthode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Drinded getInstance(){
		if (instance == null) {
			instance = new Drinded();
		}
		return instance;
	}

}
