package cartes.croyant;

import java.util.ArrayList;

import cartes.TypeCarte;
import cartes.guideSpirituel.GuideSpirituel;
import partie.Plateau;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * GuerriersSaints h�rite de Croyant
 * repr�sente une carte du jeu
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
		this.capacite = "Un Guide Spirituel revient dans la main de sa Divinit�. Ses Croyants reviennent au centre de la table.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.SYMBOLES, Origine.JOUR);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idGuerriersSaints);
	}
	
	/**
	 * capacit� effectu�e lors du sacrifice de la carte
	 */
	public void utiliserCapacite(){
		/*
		 * Un Guide Spirituel revient
			dans la main de sa Divinit�.
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
