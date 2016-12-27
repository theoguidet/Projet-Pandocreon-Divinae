package cartesCroyant;

import Carte.Carte;
import Carte.TypeCarte;
import Joueur.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Ermite hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Ermite extends Croyant{
	

	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 */
	public Ermite (int idErmite,Dogme d1, Dogme d2, Dogme d3){
		super();
		this.nom = "Ermite";
		this.capacite = "Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(d1, d2, d3, Origine.JOUR);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idErmite);
	}
	
	/**
	 * capacité effectuée lors du sacrifice de la carte
	 */
	public void sacrifice(){
		/*
		 * Impose le sacrifice d'un
			Croyant d'un autre joueur,
			qui choisit la carte. La
			capacité spéciale du sacrifice
			est jouée.
		 */
	
		Joueur joueurAImposer= this.getProprietaire().choisirLeJoueurAAttaquer();
		this.getProprietaire().setEnCoursDeJouer(false);
		joueurAImposer.setEnCoursDeJouer(true);
		joueurAImposer.setSacrifier(true);
		Carte carteVictime=this.getProprietaire().choisirCarteVictime(TypeCarte.croyant);
		carteVictime.utiliserCapacite();
		Partie.getUniquePartie().ajouterADefausse(carteVictime);
	
	}
}
