package Carte;

public class Clerc extends Carte{
	
	private int nbCroyants;
	
	public Clerc(String nom, String capacite, boolean estDistribuee, int nbCroyants){
		super(capacite, capacite, estDistribuee);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}