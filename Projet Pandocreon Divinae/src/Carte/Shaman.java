package Carte;

public class Shaman extends Carte{
	
	private int nbCroyants;
	
	public Shaman(String nom, String capacite, boolean estDistribuee, int nbCroyants){
		super(capacite, capacite, estDistribuee);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}