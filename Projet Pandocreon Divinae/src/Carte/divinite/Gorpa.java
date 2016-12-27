package Carte.divinite;

import Carte.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Gorpa h�rite de Divinite
 * repr�sente une carte divinit� du jeu
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
	 * constructeur priv� de la classe 
	 */
	private Gorpa(){
		this.nom = "Gorpa";
		this.capacite = "Peut r�cup�rer les points d'Action d'une autre Divinit� en plus des siens. L'autre Divinit� ne re�oit aucun point d'Action ce tour-ci.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.HUMAIN, Dogme.SYMBOLES, Dogme.CHAOS, Origine.CREPUSCULE);
		this.propriete = p; 
	}
	
	/**
	 * m�thode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Gorpa getInstance(){
		if (instance == null) {
			instance = new Gorpa();
		}
		return instance;
	}
	@Override
	public void utiliserCapacite(){
		
	}

}
