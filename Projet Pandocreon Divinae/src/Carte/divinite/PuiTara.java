package Carte.divinite;

import Carte.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * PuiTara h�rite de Divinite
 * repr�sente une carte divinit� du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class PuiTara extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static PuiTara instance;
	
	/**
	 * constructeur priv� de la classe 
	 */
	private PuiTara(){
		this.nom = "Pui-Tara";
		this.capacite = "Peut d�truire toutes les cartes de Croyants au centre de la table d'Origine Jour.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.NATURE,Dogme.SYMBOLES, Dogme.MYSTIQUE,Origine.NUIT);
		this.propriete = p; 
	}
	
	/**
	 * m�thode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static PuiTara getInstance(){
		if (instance == null) {
			instance = new PuiTara();
		}
		return instance;
	}

}
