package Carte;

public class Sorcier extends Carte{
	
	private int nbCroyants;
	
	public Sorcier(String nom, String capacite, boolean estDistribuee, int nbCroyants){
		super(capacite, capacite, estDistribuee);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}