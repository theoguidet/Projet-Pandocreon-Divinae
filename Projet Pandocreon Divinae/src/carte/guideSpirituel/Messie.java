package carte.guideSpirituel;

import carte.Carte;
import carte.TypeCarte;

public class Messie extends Carte{
	
	private int nbCroyants;
	
	public Messie(String nom, String capacite, boolean estDistribuee, int nbCroyants, TypeCarte typeCarte){
		super(capacite, capacite, estDistribuee, typeCarte);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}