package Carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Messie hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Messie extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Messie(int idMessie){
		super();
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.MYSTIQUE, Origine.JOUR);
		this.nom = "Messie";
		this.capacite = "Le joueur pose le dé de Cosmogonie sur la face qu'il désire et commence un nouveau tour de jeu.";
		this.nbCroyants = 3;
		this.setIdCarte(idMessie);
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Le joueur pose le dé de
			Cosmogonie sur la face qu'il
			désire et commence un
			nouveau tour de jeu
		 */
		if(this.getProprietaire().isPouvoirRecevoirPointAction()==true){
		Origine resultatDe=this.getProprietaire().choisirFaceDe();
		this.getProprietaire().calculerPointAction(resultatDe);
	}
	}


}
