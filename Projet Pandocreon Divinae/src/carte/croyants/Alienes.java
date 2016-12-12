package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Alienes h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Alienes extends Croyant{
	

	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 * @param capacite
	 * 		description de la capacit� de la carte
	 */
	public Alienes (Dogme d1, Dogme d2, Dogme d3, String capacite){
		super();
		this.nom = "Ali�n�s";
		this.capacite = capacite;
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacit� effectu�e lors du sacrifice de la carte
	 */
	public void sacrifice(){
		
	}
}
