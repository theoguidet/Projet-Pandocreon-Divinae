package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * PuiTara hérite de Divinite
 * représente une carte divinité du jeu
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
	 * constructeur privé de la classe 
	 */
	private PuiTara(){
		this.nom = "Pui-Tara";
		this.capacite = "Peut détruire toutes les cartes de Croyants au centre de la table d'Origine Jour.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.NATURE,Dogme.SYMBOLES, Dogme.MYSTIQUE,Origine.NUIT);
		this.propriete = p; 
	}
	
	/**
	 * méthode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static PuiTara getInstance(){
		if (instance == null) {
			instance = new PuiTara();
		}
		return instance;
	}

}
