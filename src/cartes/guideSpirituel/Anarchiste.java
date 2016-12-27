package cartes.guideSpirituel;

import cartes.TypeCarte;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Anarchiste h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
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
		this.capacite = "Sacrifie un Guide Spirituel, si lui ou a Divinit� ne croit pas au Dogme Chaos. Les capacit�s sp�ciales sont jou�es normalement.";
		this.nbCroyants= 3;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS, Origine.NEANT);
		this.typeCarte = TypeCarte.guideSpirituel;
		this.setIdCarte(idAnarchiste);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Sacrifie un Guide Spirituel, si
		lui ou sa Divinit� ne croit pas
		au Dogme Chaos. Les
		capacit�s sp�ciales sont jou�es
		normalement
		 */
		
		if(this.getProprietaire().getDivinite().getPropriete().getDogmes().contains("Chaos")==true){
			System.out.println("Vous ne pouvez pas realiser le sacrifice car vous avez Dogme Chaos");
		}else{
			this.getProprietaire().sacrifierGuideSpirituelDansLaMain();
			
			
			
		}
		
	}


}
