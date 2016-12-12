package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Inquisition hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Inquisition extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Inquisition(){
		this.nom = "Inquisition";
		this.capacite = "Choisissez un des Guides Spirituels d'un autre joueur, et l'un des votres. Lancez le dé de Cosmogonie. Sur Jour, le Guide adverse est sacrifié, sur Nuit le votre est sacrifié, sur Néant rien ne se passe.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
