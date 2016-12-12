package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Shingva hérite de Divinite
 * représente une carte divinité du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Shingva extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Shingva instance;
	
	/**
	 * constructeur privé de la classe 
	 */
	private Shingva(){
		this.nom = "Shingva";
		this.capacite = "Peut imposer le sacrifice d'un Guide Spirituel ayant le Dogme Symboles ou Nature.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.HUMAIN, Dogme.MYSTIQUE, Dogme.CHAOS, Origine.AUBE);
		this.propriete = p; 
	}
	
	/**
	 * méthode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Shingva getInstance(){
		if (instance == null) {
			instance = new Shingva();
		}
		return instance;
	}

}
