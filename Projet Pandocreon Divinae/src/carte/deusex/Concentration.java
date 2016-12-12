package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Concentration h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Concentration extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Concentration(){
		this.nom = "Concentration";
		this.capacite = "Vous r�cup�rez un des Guides Spirituels pos�s devant une autre Divinit� et le placez devant vous avec les Croyants qui y sont attach�s.";
		this.propriete = new Propriete(Origine.NEANT);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
