package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * Exorciste h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
 * @author Admin
 *
 */
public class Exorciste extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Exorciste(){
		super();
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.NATURE, Origine.NEANT);
		this.nom = "Exorciste";
		this.capacite = "Une Divinit� d'Origine Nuit ou ayant les Dogmes Mystique et Chaos reprend dans sa main l'un de ses Guides Spirituels. Les Croyants qui y �taient attach�s sont d�fauss�s.";
		this.nbCroyants = 1;
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
