package Carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Carte.Carte;
import Carte.TypeCarte;

/**
 * Yarstur hérite de Divinite
 * représente une carte divinité du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Yarstur extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Yarstur instance;
	
	/**
	 * constructeur privé de la classe 
	 */
	private Yarstur(){
		this.nom = "Yarstur";
		this.capacite = "Peut détruire toutes les cartes de Croyants au centre de la table d'Origine Néant.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.CHAOS, Dogme.SYMBOLES, Dogme.MYSTIQUE, Origine.JOUR);
		this.propriete = p; 
	}
	
	/**
	 * méthode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Yarstur getInstance(){
		if (instance == null) {
			instance = new Yarstur();
		}
		return instance;
	}

}
