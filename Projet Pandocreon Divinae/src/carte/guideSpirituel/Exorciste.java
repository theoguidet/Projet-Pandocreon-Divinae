package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Exorciste extends GuideSpirituel{
	
	public Exorciste(){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.NATURE, Origine.NEANT);
		this.nom = "Exorciste";
		this.capacite = "Une Divinité d'Origine Nuit ou ayant les Dogmes Mystique et Chaos reprend dans sa main l'un de ses Guides Spirituels. Les Croyants qui y étaient attachés sont défaussés.";
		this.nbCroyants = 1;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
