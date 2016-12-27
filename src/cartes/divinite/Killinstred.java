package cartes.divinite;

import cartes.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Killinstred h�rite de Divinite
 * repr�sente une carte divinit� du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Killinstred extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Killinstred instance;
	
	/**
	 * constructeur priv� de la classe 
	 */
	private Killinstred(){
		this.nom = "Killinstred";
		this.capacite = "Peut obliger un joueur � poser une carte Apocalypse s'il en poss�de une.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.NATURE,Dogme.MYSTIQUE, Dogme.CHAOS, Origine.NUIT);
		this.propriete = p; 
	}
	
	/**
	 * m�thode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Killinstred getInstance(){
		if (instance == null) {
			instance = new Killinstred();
		}
		return instance;
	}

}
