package cartes.guideSpirituel;

import java.util.ArrayList;
import java.util.Iterator;

import cartes.croyant.Croyant;
import partie.Partie;
import partie.Plateau;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

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
	public Tyran(int idTyran){
		super();
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.CHAOS, Origine.NEANT);
		this.nom = "Tyran";
		this.capacite = "D�fausse tous les Croyants ayant le Dogme Mystique actuellement au centre de la table.";
		this.nbCroyants = 3;
		this.setIdCarte(idTyran);
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * D�fausse tous les Croyants
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
