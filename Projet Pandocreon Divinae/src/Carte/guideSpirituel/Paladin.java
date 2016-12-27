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
	 * Paladin hérite de GuideSpirituel
	 * représente une carte du jeu 
	 * @author Admin
	 *
	 */
public class Paladin extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Paladin (int idPaladin){
		super();
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.MYSTIQUE, Origine.JOUR);
		this.nom = "Paladin";
		this.capacite = "Tous les Croyants, d'Origine Nuit ou Néant et ayant le Dogme Nature, actuellement sur la table sont défaussés.Les capacités spéciales ne sont pas jouées.";
		this.nbCroyants = 3;
		this.setIdCarte(idPaladin);
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Tous les Croyants, d'Origine
		Nuit ou Néant et ayant le
		Dogme Nature, actuellement
		sur la table sont défaussés.
		Les capacités spéciales ne sont
		pas jouées.

		 */
		ArrayList<Croyant> croyantLibre= Plateau.getInstance().getCroyantLibre();
		for(Iterator<Croyant> it= croyantLibre.iterator(); it.hasNext();){
			Croyant croyantADefausser= (Croyant) it.next();
			if((croyantADefausser.getPropriete().getOrigine().equals("Nuit")||croyantADefausser.getPropriete().equals("Neant"))&& croyantADefausser.getPropriete().getDogmes().contains("Nature")){
				Partie.getUniquePartie().ajouterADefausse(croyantADefausser);
			}
		}
		
		
	}


}
