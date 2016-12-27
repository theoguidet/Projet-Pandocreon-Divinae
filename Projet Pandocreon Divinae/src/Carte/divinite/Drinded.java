package Carte.divinite;

import Carte.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Drinded h�rite de Divinite
 * repr�sente une carte divinit� du jeu
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
	 * constructeur priv� de la classe 
	 */
	private Drinded(){
		this.nom = "Drinded";
		this.capacite = "Peut emp�cher le sacrifice d'un des Guides Spirituels de n'importe quel joueur.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		this.propriete = new Propriete(Dogme.NATURE, Dogme.HUMAIN,Dogme.SYMBOLES, Origine.JOUR); 
	}
	
	/**
	 * m�thode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Drinded getInstance(){
		if (instance == null) {
			instance = new Drinded();
		}
		return instance;
	}

}
