package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Messie extends GuideSpirituel{
	
	public Messie(){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete("HUMAIN", "MYSTIQUE", "JOUR");
		this.nom = "Messie";
		this.capacite = "Le joueur pose le d� de Cosmogonie sur la face qu'il d�sire et commence un nouveau tour de jeu.";
		this.nbCroyants = 3;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
