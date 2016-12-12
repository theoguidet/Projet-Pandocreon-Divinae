package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Tyran h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
 * @author Admin
 *
 */
public class Tyran extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Tyran(){
		super();
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.CHAOS, Origine.NEANT);
		this.nom = "Tyran";
		this.capacite = "D�fausse tous les Croyants ayant le Dogme Mystique actuellement au centre de la table.";
		this.nbCroyants = 3;
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
