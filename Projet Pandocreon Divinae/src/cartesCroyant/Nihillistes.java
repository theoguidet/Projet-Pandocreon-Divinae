package cartesCroyant;

import java.util.ArrayList;
import java.util.Iterator;

import Carte.TypeCarte;
import Joueur.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Nihillistes hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Nihillistes extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Nihillistes (int idNihillistes){
		super();
		this.nom = "Nihillistes";
		this.capacite = "Jusqu'à la fin du tour, plus aucune Divinité ne reçoit de points d'Action."; 
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.MYSTIQUE, Dogme.CHAOS,Origine.NEANT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idNihillistes);
	}
	
	/**
	 * capacité de la carte
	 */
	public void sacrifice(){
		/*
		 * Jusqu'à la fin du tour, plus
		aucune Divinité ne reçoit de
		points d'Action.
		 */
		while(Partie.getUniquePartie().isPartieEnCours()== true){
			ArrayList<Joueur> joueurs= Partie.getUniquePartie().getJoueurs();
			Iterator<Joueur> listJoueurs= joueurs.iterator();
			while(listJoueurs.hasNext()){
				Joueur joueurAChoisir= (Joueur) listJoueurs.next();
				joueurAChoisir.setPouvoirRecevoirPointAction(false);
			}
		}
		
	}
}