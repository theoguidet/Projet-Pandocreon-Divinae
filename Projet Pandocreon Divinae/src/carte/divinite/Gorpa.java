package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Gorpa hérite de Divinite
 * représente une carte divinité du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Gorpa extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Gorpa instance;
	
	/**
	 * constructeur privé de la classe 
	 */
	private Gorpa(){
		this.nom = "Gorpa";
		this.capacite = "Peut récupérer les points d'Action d'une autre Divinité en plus des siens. L'autre Divinité ne reçoit aucun point d'Action ce tour-ci.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.HUMAIN, Dogme.SYMBOLES, Dogme.CHAOS, Origine.CREPUSCULE);
		this.propriete = p; 
	}
	
	/**
	 * méthode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Gorpa getInstance(){
		if (instance == null) {
			instance = new Gorpa();
		}
		return instance;
	}

}
