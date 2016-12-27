package cartes.divinite;

import cartes.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Yarstur h�rite de Divinite
 * repr�sente une carte divinit� du jeu
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
	 * constructeur priv� de la classe 
	 */
	private Yarstur(){
		this.nom = "Yarstur";
		this.capacite = "Peut d�truire toutes les cartes de Croyants au centre de la table d'Origine N�ant.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.CHAOS, Dogme.SYMBOLES, Dogme.MYSTIQUE, Origine.JOUR);
		this.propriete = p; 
	}
	
	/**
	 * m�thode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Yarstur getInstance(){
		if (instance == null) {
			instance = new Yarstur();
		}
		return instance;
	}

}
