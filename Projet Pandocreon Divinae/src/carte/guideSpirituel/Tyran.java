package carte.guideSpirituel;

import carte.Carte;
import carte.TypeCarte;

public class Tyran extends Carte{
	
	private int nbCroyants;
	
	public Tyran(String nom, String capacite, boolean estDistribuee, int nbCroyants, TypeCarte typeCarte){
		super(capacite, capacite, estDistribuee, typeCarte);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}