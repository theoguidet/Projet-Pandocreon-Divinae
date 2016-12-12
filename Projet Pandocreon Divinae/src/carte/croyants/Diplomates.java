package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Diplomates h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Diplomates extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Diplomates (){
		super();
		this.nom = "Diplomates";
		this.capacite = "Relancez le d� de Cosmogonie. Le tour se finit normalement sous la nouvelle influence.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS,Dogme.CHAOS, Origine.JOUR);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� effectu�e lors du sacrifice de la carte
	 */
	public void sacrifice(){
		
	}
}
