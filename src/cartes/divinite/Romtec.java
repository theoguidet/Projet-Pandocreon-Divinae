package cartes.divinite;

import cartes.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Romtec h�rite de Divinite
 * repr�sente une carte divinit� du jeu
 * Cette classe est un singleton
 * @author Admin
 *
 */
public class Romtec extends Divinite{
	
	/**
	 * instance statique de la classe
	 */
	public static Romtec instance;

	/**
	 * constructeur priv� de la classe 
	 */
	private Romtec(){
		this.nom = "Romtec";
		this.capacite = "Peut emp�cher un jour de cr�er un Guide Spirituel. La carte est d�fauss�e.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.NATURE, Dogme.HUMAIN, Dogme.CHAOS, Origine.CREPUSCULE);
		this.propriete = p; 
	}
	
	/**
	 * m�thode statique d'instanciation de la classe
	 * @return l'instance de la classe
	 */
	public static Romtec getInstance(){
		if (instance == null) {
			instance = new Romtec();
		}
		return instance;
	}

}
