package cartesCroyant;

import java.util.ArrayList;

import Carte.TypeCarte;
import Carte.guideSpirituel.GuideSpirituel;
import partie.Plateau;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * GuerriersSaints hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class GuerriersSaints extends Croyant{
	

	/**
	 * contructeur de la classe
	 */
	public GuerriersSaints (int idGuerriersSaints){
		super();
		this.nom = "Guerriers Saints";
		this.capacite = "Un Guide Spirituel revient dans la main de sa Divinité. Ses Croyants reviennent au centre de la table.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.SYMBOLES, Origine.JOUR);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idGuerriersSaints);
	}
	
	/**
	 * capacité effectuée lors du sacrifice de la carte
	 */
	public void sacrifice(){
		/*
		 * Un Guide Spirituel revient
			dans la main de sa Divinité.
			Ses Croyants reviennent au
			centre de la table.
		 */
		GuideSpirituel t= (GuideSpirituel) this.getProprietaire().choisirGuideRevenir();
		this.getProprietaire().getMain().add(t);
		ArrayList<Croyant> c= new ArrayList<Croyant>();
		c.addAll(t.getCroyantRattaches());
		Plateau.getInstance().setCroyantLibre(c);
		t.getCroyantRattaches().clear();
		
	}
}
