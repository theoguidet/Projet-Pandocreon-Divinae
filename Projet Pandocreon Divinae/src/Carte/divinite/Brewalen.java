package Carte.divinite;

import Carte.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Brewalen h�rite de Divinite
 * repr�sente une carte divinit� du jeu
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
	 * constructeur priv� de la classe 
	 */
	private Brewalen(){
		this.nom = "Brewalen";
		this.capacite = "Peut emp�cher l'utilisation d'une carte Apocalypse. La carte est d�fauss�e.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		this.propriete = new Propriete(Dogme.NATURE, Dogme.HUMAIN, Dogme.MYSTIQUE, Origine.JOUR);
	}
	
	/**
	 * m�thode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Brewalen getInstance(){
		if (instance == null) {
			instance = new Brewalen();
		}
		return instance;
	}
	@Override
	public void utiliserCapacite(){
		
	}
}
