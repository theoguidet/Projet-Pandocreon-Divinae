package carte.divinite;

import propriete.Dogme; 
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Brewalen hérite de Divinite
 * représente une carte divinité du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Brewalen extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Brewalen instance;
	
	/**
	 * constructeur privé de la classe 
	 */
	private Brewalen(){
		this.nom = "Brewalen";
		this.capacite = "Peut empêcher l'utilisation d'une carte Apocalypse. La carte est défaussée.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		this.propriete = new Propriete(Dogme.NATURE, Dogme.HUMAIN, Dogme.MYSTIQUE, Origine.JOUR);
	}
	
	/**
	 * méthode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Brewalen getInstance(){
		if (instance == null) {
			instance = new Brewalen();
		}
		return instance;
	}
}
