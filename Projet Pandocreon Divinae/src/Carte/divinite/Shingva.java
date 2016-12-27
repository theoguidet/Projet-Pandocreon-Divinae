package Carte.divinite;

import Carte.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Shingva h�rite de Divinite
 * repr�sente une carte divinit� du jeu
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
	 * constructeur priv� de la classe 
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
	 * m�thode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Shingva getInstance(){
		if (instance == null) {
			instance = new Shingva();
		}
		return instance;
	}

}
