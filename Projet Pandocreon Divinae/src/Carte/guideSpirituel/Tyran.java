package Carte.guideSpirituel;

import java.util.ArrayList;
import java.util.Iterator;

import cartesCroyant.Croyant;
import partie.Partie;
import partie.Plateau;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Tyran hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Tyran extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Tyran(int idTyran){
		super();
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.CHAOS, Origine.NEANT);
		this.nom = "Tyran";
		this.capacite = "Défausse tous les Croyants ayant le Dogme Mystique actuellement au centre de la table.";
		this.nbCroyants = 3;
		this.setIdCarte(idTyran);
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Défausse tous les Croyants
		ayant le Dogme Mystique
		actuellement au centre de la
		table.

		 */
		ArrayList<Croyant> croyants=Plateau.getInstance().getCroyantLibre();
		Iterator<Croyant> croyantADefausser= croyants.iterator();
		while(croyantADefausser.hasNext()){
			Croyant croyantAChoisir= (Croyant) croyantADefausser.next();
			if(croyantAChoisir.getPropriete().getDogmes().contains("Mystique")){
				Partie.getUniquePartie().ajouterADefausse(croyantAChoisir);
			}

		}
		
	}


}
