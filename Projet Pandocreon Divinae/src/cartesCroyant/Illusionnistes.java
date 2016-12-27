package cartesCroyant;

import Carte.TypeCarte;
import Joueur.Joueur;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Illusionnistes hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Illusionnistes extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Illusionnistes (int idIllusionnistes){
		super();
		this.nom = "Illusionnistes";
		this.capacite = "Vous bénéficiez de la capacité spéciale de sacrifice d'une carte de Croyants appartenant à une autre Divinité. La carte en question reste en jeu.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS, Dogme.SYMBOLES, Origine.NUIT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idIllusionnistes);
	}
	
	/**
	 * capacité de la carte
	 */
	public void sacrifice(){
		/*
		 * Vous bénéficiez de la capacité
		spéciale de sacrifice d'une
		carte de Croyants
		appartenant à une autre
		Divinité. La carte en question
		reste en jeu.
		 */
		
		int t=0;
		
		
		Joueur joueurAAttaquer = this.getProprietaire().choisirLeJoueurAAttaquer();
		this.getProprietaire().setEnCoursDeJouer(false);
		joueurAAttaquer.setEnCoursDeJouer(true);
		joueurAAttaquer.getMain();
		while(t<joueurAAttaquer.getMain().size()&&joueurAAttaquer.getMain().get(t).getTypeCarte()!=TypeCarte.croyant){
			t++;
		}
		if(joueurAAttaquer.getMain().get(t).getTypeCarte()!=TypeCarte.croyant){
			System.out.println("Le joueur à attaquer n'a pas carte croyant!");
		}else{
			joueurAAttaquer.getMain().get(t).setProprietaire(this.getProprietaire());
			joueurAAttaquer.getMain().get(t).utiliserCapacite();
			joueurAAttaquer.getMain().add(joueurAAttaquer.getMain().get(t));
		}
		
	}
}
