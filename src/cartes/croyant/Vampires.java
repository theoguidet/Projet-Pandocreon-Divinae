package cartes.croyant;

import cartes.Carte;
import cartes.TypeCarte;
import joueurs.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Vampires h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Vampires extends Croyant{
	
	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 */
	public Vampires (int idVampires,Dogme d1, Dogme d2, Dogme d3){
		super();
		this.nom = "Vampires";
		this.capacite = "Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifi�. La capacit� sp�ciale du sacrifice est jou�e.";
		this.nbCroyants= 1;
		this.propriete = new Propriete(d1, d2, d3, Origine.NUIT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idVampires);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/*Imposer un autre joueur � sacrifier une carte croyant
		 * 	Celui-ci choisi le sacrifi�
		 */
		Joueur joueurAImposer= this.getProprietaire().choisirLeJoueurAAttaquer();
		this.getProprietaire().setEnCoursDeJouer(false);
		joueurAImposer.setEnCoursDeJouer(true);
		joueurAImposer.setSacrifier(true);
		Carte carteVictime=joueurAImposer.choisirCarteVictime(TypeCarte.croyant);
		carteVictime.utiliserCapacite();
		Partie.getUniquePartie().ajouterADefausse(carteVictime);
		joueurAImposer.getMain().remove(carteVictime);
	}
}
