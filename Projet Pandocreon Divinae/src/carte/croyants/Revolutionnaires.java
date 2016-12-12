package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Moines h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Revolutionnaires extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Revolutionnaires (){
		super();
		this.nom = "R�volutionnaires";
		this.capacite = "Imposez le sacrifice d'une carte de Croyants � autant de Divinit�s que vous le voulez. Chaque Divinit� choisit la carte � sacrifier. Les capacit�s sp�ciales sont jou�es";
		this.nbCroyants= 2;
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS, Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void sacrifice(){
		
	}
}