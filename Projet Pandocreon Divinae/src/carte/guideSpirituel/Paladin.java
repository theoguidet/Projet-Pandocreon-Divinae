package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Paladin extends GuideSpirituel{
	
	public Paladin(){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete("HUMAIN", "MYSTIQUE", "JOUR");
		this.nom = "Paladin";
		this.capacite = "Tous les Croyants, d'Origine Nuit ou Néant et ayant le Dogme Nature, actuellement sur la table sont défaussés.Les capacités spéciales ne sont pas jouées.";
		this.nbCroyants = 3;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
