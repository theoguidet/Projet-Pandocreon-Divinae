package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Miroir h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Miroir extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public Miroir(){
		this.nom = "Miroir";
		this.capacite = "Retourne les effets d'une carte d'Action sur la Divinit� qui l'a pos�e.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
