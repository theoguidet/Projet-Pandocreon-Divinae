package cartesCroyant;

import Carte.TypeCarte;
import Joueur.Joueur;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Integristes hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Integristes extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Integristes (int idIntegristes){
		super();
		this.nom = "Integristes";
		this.capacite = "Impose le sacrifice d'un Guide Spirituel d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.NATURE, Dogme.CHAOS, Origine.JOUR);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idIntegristes);
	}
	
	/**
	 * capacité de la carte
	 */
	public void sacrifice(){
		/*
		 * Impose le sacrifice d'un Guide
			Spirituel d'un autre joueur,
			qui choisit la carte. La
			capacité spéciale du sacrifice
			est jouée.

		 */
		Joueur joueurAImposer= this.getProprietaire().choisirLeJoueurAAttaquer();
		this.getProprietaire().setEnCoursDeJouer(false);
		joueurAImposer.setEnCoursDeJouer(true);
		joueurAImposer.setSacrifier(true);
		joueurAImposer.sacrifierGuideSpirituelDansLaMain();
		this.getProprietaire().setEnCoursDeJouer(true);
		joueurAImposer.setEnCoursDeJouer(false);

		
	}
}
