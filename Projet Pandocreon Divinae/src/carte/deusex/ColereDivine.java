package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * ColereDivine h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class ColereDivine extends DeusEx{

	/**
	 * constructeur de la classe
	 * @param o
	 * 		Origine de la carte
	 */
	public ColereDivine(Origine o){
		this.nom = "ColereDivine";
		this.capacite = "D�truit une carte Guide Spirituel d'Origine Nuit ou N�ant, dont la capacit� sp�ciale n'a pas effet. Les Croyants attach�s reviennent au centre de la table.";
		this.propriete = new Propriete(o);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
