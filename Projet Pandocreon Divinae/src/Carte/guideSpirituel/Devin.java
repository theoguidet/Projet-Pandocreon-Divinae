package Carte.guideSpirituel;

import java.util.ArrayList;

import Joueur.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Devin h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
 * @author Admin
 *
 */
public class Devin extends GuideSpirituel{
	
	/**
	 * 
	 * constructeur de la classe 
	 *
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param o
	 * 		Origine
	 */
	public Devin(int idDevin,Dogme d1, Dogme d2, Origine o){
		super();
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Devin";
		this.capacite = "Oblige une Divinit� ayant le Dogme Nature ou Mystique � sacrifier l'un de ses Guides Spirituels.";
		this.nbCroyants = 1;
		this.setIdCarte(idDevin);
	}

	/**
	 * capacit� de la carte
	 */
	@Override
	public void utiliserCapacite(){
		/**
		 * Oblige une Divinit� ayant le
		Dogme Nature ou Mystique
		� sacrifier l'un de ses Guides
		Spirituels.
		 */
		ArrayList<Joueur>joueurAAttaquer=Partie.getUniquePartie().getJoueurs();
		int i=0;
		while(joueurAAttaquer.get(i).getDivinite().getPropriete().getDogmes().contains("Nature")==false&&joueurAAttaquer.get(i).getDivinite().getPropriete().getDogmes().contains("Mystique")==false&&i<=joueurAAttaquer.size()){
			i++;
		}
		if(joueurAAttaquer.get(i).getDivinite().getPropriete().getDogmes().contains("Nature")==true||joueurAAttaquer.get(i).getDivinite().getPropriete().getDogmes().contains("Mystique")==true){
			joueurAAttaquer.get(i).sacrifierGuideSpirituelDansLaMain();
		}
	}
	}



