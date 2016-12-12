package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Pillards h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Pillards extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Pillards (){
		super();
		this.nom = "Pillards";
		this.capacite = "R�cup�rez les points d'Action d'une Divinit� n'ayant pas encore jou� durant ce tour. Les points d'Action gardent leur Origine. La Divinit� perd ses points.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.NATURE, Dogme.SYMBOLES, Origine.NUIT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void sacrifice(){
		
	}
}
