package Carte.cartesCroyant;

import Carte.Carte;
import Carte.TypeCarte;
import Joueur.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Moines h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Revolutionnaires extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Revolutionnaires (int idRevolutionnaires){
		super();
		this.nom = "R�volutionnaires";
		this.capacite = "Imposez le sacrifice d'une carte de Croyants � autant de Divinit�s que vous le voulez. Chaque Divinit� choisit la carte � sacrifier. Les capacit�s sp�ciales sont jou�es";
		this.nbCroyants= 2;
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS, Origine.NEANT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idRevolutionnaires);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void sacrifice(){
		/*
		 * Imposez le sacrifice d'une
		carte de Croyants � autant de
		Divinit�s que vous le voulez.
		Chaque Divinit� choisit la
		carte � sacrifier. Les capacit�s
		sp�ciales sont jou�es.
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