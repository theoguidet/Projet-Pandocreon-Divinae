package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Ascete extends GuideSpirituel{
	
	public Ascete(){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.SYMBOLES, Origine.NUIT);
		this.nom = "Ascete";
		this.capacite = "Sacrifie 2 cartes Croyants d'une Divinité ayant le Dogme Humain ou Symboles.Les capacités spéciales sont jouées normalement";
		this.nbCroyants= 1;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
