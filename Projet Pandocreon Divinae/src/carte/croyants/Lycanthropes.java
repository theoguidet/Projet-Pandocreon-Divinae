package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Lycanthropes h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Lycanthropes extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Lycanthropes (){
		super();
		this.nom = "Lycanthropes";
		this.capacite = "Retirez tous les Croyants attach�s � l'un des Guides Spirituels d'une autre Divinit�. Les Croyants reviennent au milieu de la table, le Guide Spirituel est d�fauss�";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.HUMAIN,Dogme.NATURE,Dogme.CHAOS, Origine.NUIT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� de la classe
	 */
	public void sacrifice(){
		
	}
}
