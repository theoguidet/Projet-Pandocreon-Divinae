package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Shaman extends Carte{
	
	private int nbCroyants;
	private Propriete propriete;
	
	public Shaman(String nom, String capacite, boolean estDistribuee, int nbCroyants, TypeCarte typeCarte, Dogme d1, Dogme d2, Dogme d3, Origine o){
		super(capacite, capacite, estDistribuee, typeCarte);
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(d1, d2, d3, o);

	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
