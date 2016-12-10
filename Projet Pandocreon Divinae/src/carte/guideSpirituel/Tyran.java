package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Tyran extends GuideSpirituel{
	
	public Tyran(){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.CHAOS, Origine.NEANT);
		this.nom = "Tyran";
		this.capacite = "Défausse tous les Croyants ayant le Dogme Mystique actuellement au centre de la table.";
		this.nbCroyants = 3;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
