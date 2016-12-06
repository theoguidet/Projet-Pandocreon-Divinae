package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Devin extends Carte{
	
	private int nbCroyants;
	
	private Propriete propriete;
	public Devin(String nom, String capacite, boolean estDistribuee, int nbCroyants, TypeCarte typeCarte, Dogme d1, Dogme d2, Origine o){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Devin";
		this.capacite = "Oblige une Divinit� ayant le Dogme Nature ou Mystique � sacrifier l'un de ses Guides Spirituels.";
		this.nbCroyants = 1;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
