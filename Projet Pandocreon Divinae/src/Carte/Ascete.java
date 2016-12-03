package Carte;

public class Ascete extends Carte{
	
	private int nbCroyants;
	
	public Ascete(String nom, String capacite, boolean estDistribuee, int nbCroyants){
		super(capacite, capacite, estDistribuee);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
