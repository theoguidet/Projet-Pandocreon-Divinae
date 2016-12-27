package Carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Clerc hérite de GuideSpirituel
 * représente une carte du jeu 
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
	public Clerc(int idClerc,Dogme d1, Dogme d2, Origine o){
		super();
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Ascete";
		this.capacite = "Fait gagner un nombre de points d'Action égal au nombre de cartes de Croyants rattachées. L'Origine des points d'Action est au choix du joueur.";
		this.nbCroyants= 2;
		this.setIdCarte(idClerc);
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Fait gagner un nombre de
		points d'Action égal au
		nombre de cartes de Croyants
		rattachées. L'Origine des
		points d'Action est au choix
		du joueur.

		 */
		int n=this.getProprietaire().getCroyantRattaches().size();
		int k;
		k=this.getProprietaire().choisirOriginePointARecevoir();
		if(this.getProprietaire().isPouvoirRecevoirPointAction()==true){
		switch (k) {
		case 1:
			this.getProprietaire().setPointActionJour(this.getProprietaire().getPointActionJour()+n);
			break;
		case 2:	
			this.getProprietaire().setPointActionNuit(this.getProprietaire().getPointActionNuit()+n);
		default:
			this.getProprietaire().setPointActionNeant(this.getProprietaire().getPointActionNeant()+n);
			break;
		}
		}
	}


}
