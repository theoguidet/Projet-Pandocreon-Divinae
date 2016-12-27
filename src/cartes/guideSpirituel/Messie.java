package cartes.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Messie h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
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
		this.capacite = "Le joueur pose le d� de Cosmogonie sur la face qu'il d�sire et commence un nouveau tour de jeu.";
		this.nbCroyants = 3;
		this.setIdCarte(idMessie);
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Le joueur pose le d� de
			Cosmogonie sur la face qu'il
			d�sire et commence un
			nouveau tour de jeu
		 */
		if(this.getProprietaire().isPouvoirRecevoirPointAction()==true){
		Origine resultatDe=this.getProprietaire().choisirFaceDe();
		this.getProprietaire().calculerPointAction(resultatDe);
	}
	}


}
