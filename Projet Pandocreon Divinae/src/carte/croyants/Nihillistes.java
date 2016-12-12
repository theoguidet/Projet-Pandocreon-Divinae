package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Nihillistes h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Nihillistes extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Nihillistes (){
		super();
		this.nom = "Nihillistes";
		this.capacite = "Jusqu'� la fin du tour, plus aucune Divinit� ne re�oit de points d'Action."; 
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.MYSTIQUE, Dogme.CHAOS,Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void sacrifice(){
		
	}
}