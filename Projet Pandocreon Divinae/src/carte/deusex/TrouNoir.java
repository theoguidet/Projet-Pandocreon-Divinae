package carte.deusex;

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
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){

	}
}
