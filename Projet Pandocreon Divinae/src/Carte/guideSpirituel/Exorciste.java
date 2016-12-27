package Carte.guideSpirituel;

import java.util.ArrayList;
import java.util.Iterator;

import cartesCroyant.Croyant;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Carte.Carte;
import Joueur.Joueur;

/**
 * Exorciste hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Exorciste extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Exorciste(int idExorciste){
		super();
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.NATURE, Origine.NEANT);
		this.nom = "Exorciste";
		this.capacite = "Une Divinité d'Origine Nuit ou ayant les Dogmes Mystique et Chaos reprend dans sa main l'un de ses Guides Spirituels. Les Croyants qui y étaient attachés sont défaussés.";
		this.nbCroyants = 1;
		this.setIdCarte(idExorciste);
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Une Divinité d'Origine Nuit
		ou ayant les Dogmes
		Mystique et Chaos reprend
		dans sa main l'un de ses
		Guides Spirituels. Les
		Croyants qui y étaient
		attachés sont défaussés.
		 */
		ArrayList<Joueur>joueurs=Partie.getUniquePartie().getJoueurs();
		int i=0;
		for(Joueur joueurABeneficier: joueurs){
		if((joueurABeneficier.getDivinite().getPropriete().getDogmes().contains("Mystique")==true&&joueurABeneficier.getDivinite().getPropriete().getDogmes().contains("Chaos")==true)||joueurs.get(i).getDivinite().getPropriete().getOrigine().equals("Nuit")){
			ArrayList<Croyant> croyantDefausser= joueurABeneficier.choisirGuideRevenir().getCroyantRattaches();
			Iterator<Croyant> it= croyantDefausser.iterator();
			while(it.hasNext()){
				Partie.getUniquePartie().ajouterADefausse((Carte) it.next());
				
			}
			joueurABeneficier.getCroyantRattaches().removeAll(croyantDefausser);
			croyantDefausser.clear();
			
		}
		}
		
	}


}
