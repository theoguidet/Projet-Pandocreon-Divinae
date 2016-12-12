package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Messie h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
 * @author Admin
 *
 */
public class Messie extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Messie(){
		super();
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.MYSTIQUE, Origine.JOUR);
		this.nom = "Messie";
		this.capacite = "Le joueur pose le d� de Cosmogonie sur la face qu'il d�sire et commence un nouveau tour de jeu.";
		this.nbCroyants = 3;
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
