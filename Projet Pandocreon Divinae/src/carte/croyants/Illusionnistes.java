package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Illusionnistes h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Illusionnistes extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Illusionnistes (){
		super();
		this.nom = "Illusionnistes";
		this.capacite = "Vous b�n�ficiez de la capacit� sp�ciale de sacrifice d'une carte de Croyants appartenant � une autre Divinit�. La carte en question reste en jeu.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS, Dogme.SYMBOLES, Origine.NUIT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void sacrifice(){
		
	}
}
