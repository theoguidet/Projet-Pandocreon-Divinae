package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Lycanthropes extends Croyant{
	

	
	public Lycanthropes (){
		super();
		this.nom = "Lycanthropes";
		this.capacite = "Retirez tous les Croyants attach�s � l'un des Guides Spirituels d'une autre Divinit�. Les Croyants reviennent au milieu de la table, le Guide Spirituel est d�fauss�";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.HUMAIN,Dogme.NATURE,Dogme.CHAOS, Origine.NUIT);
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}
