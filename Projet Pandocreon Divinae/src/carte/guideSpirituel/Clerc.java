package carte.guideSpirituel;

import carte.Carte;
import carte.TypeCarte;

public class Clerc extends Carte{
	
	private int nbCroyants;
	
	public Clerc(String nom, String capacite, boolean estDistribuee, int nbCroyants, TypeCarte typeCarte){
		super(capacite, capacite, estDistribuee, typeCarte);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
