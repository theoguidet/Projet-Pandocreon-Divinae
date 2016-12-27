package Carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Carte.Carte;
import Carte.TypeCarte;

/**
 * Gwenghelen hérite de Divinite
 * représente une carte divinité du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Gwenghelen extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Gwenghelen instance;
	
	/**
	 * constructeur privé de la classe 
	 */
	private Gwenghelen(){
		this.nom = "Gwenghelen";
		this.capacite = "Récupère autant de points d'Action supplémentaires d'Origine Néant que le nombre de Guides Spirituels que la Divinité possède.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.HUMAIN, Dogme.SYMBOLES,Dogme.MYSTIQUE,Origine.AUBE);
		this.propriete = p; 
	}
	
	/**
	 * méthode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Gwenghelen getInstance(){
		if (instance == null) {
			instance = new Gwenghelen();
		}
		return instance;
	}

}
