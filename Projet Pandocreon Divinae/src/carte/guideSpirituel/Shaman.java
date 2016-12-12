package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Shaman hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Shaman extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Shaman(){
		super();
		this.propriete = new Propriete(Dogme.NATURE,Dogme.SYMBOLES,Origine.NUIT);
		this.nom = "Shaman";
		this.capacite = "Sacrifie tous les Croyants d'Origine Néant d'une Divinité ayant le Dogme Humain. Les capacités spéciales sont jouées normalement.";
		this.nbCroyants = 3;
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
