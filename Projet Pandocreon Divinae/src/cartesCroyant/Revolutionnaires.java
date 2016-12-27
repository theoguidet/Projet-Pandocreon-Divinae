package cartesCroyant;

import Carte.Carte;
import Carte.TypeCarte;
import Joueur.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Moines hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Revolutionnaires extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Revolutionnaires (int idRevolutionnaires){
		super();
		this.nom = "Révolutionnaires";
		this.capacite = "Imposez le sacrifice d'une carte de Croyants à autant de Divinités que vous le voulez. Chaque Divinité choisit la carte à sacrifier. Les capacités spéciales sont jouées";
		this.nbCroyants= 2;
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS, Origine.NEANT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idRevolutionnaires);
	}
	
	/**
	 * capacité de la carte
	 */
	public void sacrifice(){
		/*
		 * Imposez le sacrifice d'une
		carte de Croyants à autant de
		Divinités que vous le voulez.
		Chaque Divinité choisit la
		carte à sacrifier. Les capacités
		spéciales sont jouées.
		 */
		
		Joueur joueurAImposer= this.getProprietaire().choisirLeJoueurAAttaquer();
		joueurAImposer.setSacrifier(true);
		
		this.getProprietaire().setEnCoursDeJouer(false);
		joueurAImposer.setEnCoursDeJouer(true);
		Carte carteVictime=joueurAImposer.choisirCarteVictime(TypeCarte.croyant);
		carteVictime.utiliserCapacite();
		Partie.getUniquePartie().ajouterADefausse(carteVictime);
		joueurAImposer.getMain().remove(carteVictime);
		this.getProprietaire().setEnCoursDeJouer(true);
		joueurAImposer.setEnCoursDeJouer(false);
		
	}
}