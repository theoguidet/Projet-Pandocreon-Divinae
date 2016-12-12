package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Esprits hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Esprits extends Croyant{
	

	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 */
	public Esprits (Dogme d1, Dogme d2, Dogme d3){
		super();
		this.nom = "Esprits";
		this.capacite = "Donne un point d'Action d'Origine Néant.";
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	/**
	 * capacité effectuée lors du sacrifice de la carte
	 */
	public void sacrifice(){
		
	}
}
