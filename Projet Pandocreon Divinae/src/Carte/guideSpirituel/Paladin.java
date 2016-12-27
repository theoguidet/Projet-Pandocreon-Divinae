package Carte.guideSpirituel;

import java.util.ArrayList;
import java.util.Iterator;

import Carte.cartesCroyant.Croyant;
import partie.Partie;
import partie.Plateau;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
	 * Paladin h�rite de GuideSpirituel
	 * repr�sente une carte du jeu 
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
		this.capacite = "Tous les Croyants, d'Origine Nuit ou N�ant et ayant le Dogme Nature, actuellement sur la table sont d�fauss�s.Les capacit�s sp�ciales ne sont pas jou�es.";
		this.nbCroyants = 3;
		this.setIdCarte(idPaladin);
	}

	/**
	 * capacit� de la carte
	 */
	@Override
	public void utiliserCapacite(){
		/**
		 * Tous les Croyants, d'Origine
		Nuit ou N�ant et ayant le
		Dogme Nature, actuellement
		sur la table sont d�fauss�s.
		Les capacit�s sp�ciales ne sont
		pas jou�es.

		 */
		ArrayList<Croyant> croyantLibre= Plateau.getInstance().getCroyantLibre();
		for(Iterator<Croyant> it= croyantLibre.iterator(); it.hasNext();){
			Croyant croyantADefausser= it.next();
			if((croyantADefausser.getPropriete().getOrigine().equals("Nuit")||croyantADefausser.getPropriete().equals("Neant"))&& croyantADefausser.getPropriete().getDogmes().contains("Nature")){
				Partie.getUniquePartie().ajouterADefausse(croyantADefausser);
			}
		}
		
		
	}


}
