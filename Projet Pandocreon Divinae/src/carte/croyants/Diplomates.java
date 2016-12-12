package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Diplomates hérite de Croyant
 * représente une carte du jeu
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
		this.capacite = "Relancez le dé de Cosmogonie. Le tour se finit normalement sous la nouvelle influence.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS,Dogme.CHAOS, Origine.JOUR);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacité effectuée lors du sacrifice de la carte
	 */
	public void sacrifice(){
		
	}
}
