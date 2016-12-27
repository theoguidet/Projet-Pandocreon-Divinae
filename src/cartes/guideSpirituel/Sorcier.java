package cartes.guideSpirituel;

import cartes.TypeCarte;
import joueurs.Joueur;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Sorcier h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
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
		this.capacite = "Echangez l'un de vos Guides Spirituels avec un d'une autre Divinit�. Vous choisissez les deux guides Spirituels en question. Les Croyants restent attach�s aux m�mes cartes.";
		this.nbCroyants = 3;
		this.setIdCarte(idSorcier);
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Echangez l'un de vos Guides
		Spirituels avec un d'une autre
		Divinit�. Vous choisissez les
		deux guides Spirituels en
		question. Les Croyants
		restent attach�s aux m�mes
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
