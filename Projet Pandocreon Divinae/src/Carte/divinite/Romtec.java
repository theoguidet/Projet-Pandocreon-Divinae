package Carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Carte.Carte;
import Carte.TypeCarte;

/**
 * Romtec hérite de Divinite
 * représente une carte divinité du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Romtec extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Romtec instance;

	/**
	 * constructeur privé de la classe 
	 */
	private Romtec(){
		this.nom = "Romtec";
		this.capacite = "Peut empêcher un jour de créer un Guide Spirituel. La carte est défaussée.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.NATURE, Dogme.HUMAIN, Dogme.CHAOS, Origine.CREPUSCULE);
		this.propriete = p; 
	}
	
	/**
	 * méthode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Romtec getInstance(){
		if (instance == null) {
			instance = new Romtec();
		}
		return instance;
	}

}
