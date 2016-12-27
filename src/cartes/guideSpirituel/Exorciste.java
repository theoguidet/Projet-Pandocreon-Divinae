package cartes.guideSpirituel;

import java.util.ArrayList;
import java.util.Iterator;

import cartes.Carte;
import cartes.croyant.Croyant;
import joueurs.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Exorciste h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
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
		this.capacite = "Une Divinit� d'Origine Nuit ou ayant les Dogmes Mystique et Chaos reprend dans sa main l'un de ses Guides Spirituels. Les Croyants qui y �taient attach�s sont d�fauss�s.";
		this.nbCroyants = 1;
		this.setIdCarte(idExorciste);
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Une Divinit� d'Origine Nuit
		ou ayant les Dogmes
		Mystique et Chaos reprend
		dans sa main l'un de ses
		Guides Spirituels. Les
		Croyants qui y �taient
		attach�s sont d�fauss�s.
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
