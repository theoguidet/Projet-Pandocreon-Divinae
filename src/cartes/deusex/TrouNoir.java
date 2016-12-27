package cartes.deusex;

import java.util.ArrayList;
import java.util.Iterator;

import cartes.TypeCarte;
import joueurs.Joueur;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;

/**
 * TrouNoir h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class TrouNoir extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public TrouNoir(){
		this.nom = "Trou Noir";
		this.capacite = "Aucun autre joueur ne gagne de points d'Action durant ce tour.";
		this.propriete = new Propriete(Origine.NEANT);
		this.typeCarte=TypeCarte.deusEx;
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		ArrayList<Joueur> joueurs= Partie.getUniquePartie().getJoueurs();
		Iterator<Joueur> listJoueurs= joueurs.iterator();
		while(listJoueurs.hasNext()){
			Joueur joueurAChoisir= (Joueur) listJoueurs.next();
			joueurAChoisir.setPouvoirRecevoirPointAction(false);
		}

	}
}
