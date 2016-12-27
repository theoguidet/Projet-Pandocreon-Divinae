package Carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Carte.TypeCarte;

/**
 * Anarchiste hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Anarchiste extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Anarchiste(int idAnarchiste){
		super();
		this.nom = "Anarchiste";
		this.capacite = "Sacrifie un Guide Spirituel, si lui ou a Divinité ne croit pas au Dogme Chaos. Les capacités spéciales sont jouées normalement.";
		this.nbCroyants= 3;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS, Origine.NEANT);
		this.typeCarte = TypeCarte.guideSpirituel;
		this.setIdCarte(idAnarchiste);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Sacrifie un Guide Spirituel, si
		lui ou sa Divinité ne croit pas
		au Dogme Chaos. Les
		capacités spéciales sont jouées
		normalement
		 */
		
		if(this.getProprietaire().getDivinite().getPropriete().getDogmes().contains("Chaos")==true){
			System.out.println("Vous ne pouvez pas realiser le sacrifice car vous avez Dogme Chaos");
		}else{
			this.getProprietaire().sacrifierGuideSpirituelDansLaMain();
			
			
			
		}
		
	}


}
