package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Shaman extends GuideSpirituel{
	
	public Shaman(){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(Dogme.NATURE, Dogme.SYMBOLES, Origine.NUIT);
		this.nom = "Shaman";
		this.capacite = "Sacrifie tous les Croyants d'Origine Néant d'une Divinité ayant le Dogme Humain. Les capacités spéciales sont jouées normalement.";
		this.nbCroyants = 3;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
