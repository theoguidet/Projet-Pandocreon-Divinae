package carte.guideSpirituel;

import carte.Carte;
import carte.TypeCarte;

public class Sorcier extends Carte{
	
	private int nbCroyants;
	
	public Sorcier(String nom, String capacite, boolean estDistribuee, int nbCroyants, TypeCarte typeCarte){
		super(capacite, capacite, estDistribuee, typeCarte);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
