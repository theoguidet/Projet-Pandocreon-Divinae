package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Inquisition h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Inquisition extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Inquisition(){
		this.nom = "Inquisition";
		this.capacite = "Choisissez un des Guides Spirituels d'un autre joueur, et l'un des votres. Lancez le d� de Cosmogonie. Sur Jour, le Guide adverse est sacrifi�, sur Nuit le votre est sacrifi�, sur N�ant rien ne se passe.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
