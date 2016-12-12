package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

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
	public Anarchiste(){
		super();
		this.nom = "Anarchiste";
		this.capacite = "Sacrifie un Guide Spirituel, si lui ou a Divinit� ne croit pas au Dogme Chaos. Les capacit�s sp�ciales sont jou�es normalement.";
		this.nbCroyants= 3;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS, Origine.NEANT);
		this.typeCarte = typeCarte.guideSpirituel;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
