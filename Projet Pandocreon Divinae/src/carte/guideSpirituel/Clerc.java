package carte.guideSpirituel;

import org.omg.CORBA.ORB;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Clerc h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
 * @author Admin
 *
 */
public class Clerc extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param o
	 * 		Origine
	 */
	public Clerc(Dogme d1, Dogme d2, Origine o){
		super();
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Ascete";
		this.capacite = "Fait gagner un nombre de points d'Action �gal au nombre de cartes de Croyants rattach�es. L'Origine des points d'Action est au choix du joueur.";
		this.nbCroyants= 2;
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
