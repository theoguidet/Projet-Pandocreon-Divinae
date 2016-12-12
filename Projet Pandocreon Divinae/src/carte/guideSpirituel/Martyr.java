package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Martyr hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Martyr extends GuideSpirituel{
	
	/**
	 * 
	 * constructeur de la classe 
	 *
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param o
	 * 		Origine
	 */
	public Martyr(Dogme d1, Dogme d2, Origine o){
		super();
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Martyr";
		this.capacite = "Equivalent à la pose d'une carte Apocalypse.";
		this.nbCroyants= 2;
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}

}
