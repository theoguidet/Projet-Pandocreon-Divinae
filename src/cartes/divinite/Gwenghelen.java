package cartes.divinite;

import cartes.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Gwenghelen h�rite de Divinite
 * repr�sente une carte divinit� du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Gwenghelen extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Gwenghelen instance;
	
	/**
	 * constructeur priv� de la classe 
	 */
	private Gwenghelen(){
		this.nom = "Gwenghelen";
		this.capacite = "R�cup�re autant de points d'Action suppl�mentaires d'Origine N�ant que le nombre de Guides Spirituels que la Divinit� poss�de.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.HUMAIN, Dogme.SYMBOLES,Dogme.MYSTIQUE,Origine.AUBE);
		this.propriete = p; 
	}
	
	/**
	 * m�thode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Gwenghelen getInstance(){
		if (instance == null) {
			instance = new Gwenghelen();
		}
		return instance;
	}

}
