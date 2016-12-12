package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

/**
 * Fourberie h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Fourberie extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public Fourberie(){
		this.nom = "Fourberie";
		this.capacite = "Sacrifiez 2 cartes Croyants d'une autre Divinit�. Les capacit�s sp�ciales ne sont pas jou�es.";
		this.propriete = new Propriete(Origine.NUIT);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}
}
