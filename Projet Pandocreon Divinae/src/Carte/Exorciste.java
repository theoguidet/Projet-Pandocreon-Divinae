package Carte;

public class Exorciste extends Carte{
	
	private int nbCroyants;
	
	public Exorciste(String nom, String capacite, boolean estDistribuee, int nbCroyants){
		super(capacite, capacite, estDistribuee);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
