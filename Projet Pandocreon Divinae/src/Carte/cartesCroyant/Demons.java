package Carte.cartesCroyant;

import Carte.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Demons h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Demons extends Croyant{
	

	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 */
	public Demons (int idDemons,Dogme d1, Dogme d2, Dogme d3){
		super();
		this.nom = "Demons";
		this.capacite = "Donne un point d'Action d'Origine Nuit.";
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, Origine.NUIT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idDemons);
	}
	
	/**
	 * capacit� effectu�e lors du sacrifice de la carte
	 */
	public void sacrifice(){
		/**Donne un point d'Action d'Origine Nuit pour le proprietaire
		 * 
		 */
		if(this.getProprietaire().isPouvoirRecevoirPointAction()==true){
			this.getProprietaire().setPointActionNuit(this.getProprietaire().getPointActionNuit()+1);
			System.out.println("Point action Nuit:"+ this.getProprietaire().getPointActionNuit());
		}
	}
}
