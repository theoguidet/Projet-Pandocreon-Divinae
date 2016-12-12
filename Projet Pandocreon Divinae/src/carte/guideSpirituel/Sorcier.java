package carte.guideSpirituel;

import org.omg.CORBA.ORB;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

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
	public Sorcier(Dogme d1, Dogme d2, Origine o){
		super();
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Sorcier";
		this.capacite = "Echangez l'un de vos Guides Spirituels avec un d'une autre Divinit�. Vous choisissez les deux guides Spirituels en question. Les Croyants restent attach�s aux m�mes cartes.";
		this.nbCroyants = 3;
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
