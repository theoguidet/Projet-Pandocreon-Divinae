package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Ascete hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Ascete extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Ascete(){
		super();
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.SYMBOLES, Origine.NUIT);
		this.nom = "Ascete";
		this.capacite = "Sacrifie 2 cartes Croyants d'une Divinité ayant le Dogme Humain ou Symboles.Les capacités spéciales sont jouées normalement";
		this.nbCroyants= 1;
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
