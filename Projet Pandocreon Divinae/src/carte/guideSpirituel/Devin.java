package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Devin hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Devin extends GuideSpirituel{
	
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
	public Devin(Dogme d1, Dogme d2, Origine o){
		super();
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Devin";
		this.capacite = "Oblige une Divinité ayant le Dogme Nature ou Mystique à sacrifier l'un de ses Guides Spirituels.";
		this.nbCroyants = 1;
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
