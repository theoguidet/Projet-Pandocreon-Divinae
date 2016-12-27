package Carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Carte.TypeCarte;
import Joueur.Joueur;

/**
 * Sorcier hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Sorcier extends GuideSpirituel{
	
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
	public Sorcier(int idSorcier,Dogme d1, Dogme d2, Origine o){
		super();
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Sorcier";
		this.capacite = "Echangez l'un de vos Guides Spirituels avec un d'une autre Divinité. Vous choisissez les deux guides Spirituels en question. Les Croyants restent attachés aux mêmes cartes.";
		this.nbCroyants = 3;
		this.setIdCarte(idSorcier);
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Echangez l'un de vos Guides
		Spirituels avec un d'une autre
		Divinité. Vous choisissez les
		deux guides Spirituels en
		question. Les Croyants
		restent attachés aux mêmes
		cartes.
		 */
		Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
		GuideSpirituel guideAEchanger1=(GuideSpirituel) this.getProprietaire().choisirCarteVictime(TypeCarte.guideSpirituel);
		guideAEchanger1.setProprietaire(joueurAAttaquer);
		joueurAAttaquer.getGuideRattaches().add(guideAEchanger1);
		GuideSpirituel guideAEchanger2=(GuideSpirituel) joueurAAttaquer.choisirCarteVictime(TypeCarte.guideSpirituel);
		guideAEchanger2.setProprietaire(this.getProprietaire());
		this.getProprietaire().getGuideRattaches().add(guideAEchanger2);
		
	}


}
