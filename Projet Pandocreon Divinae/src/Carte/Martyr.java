package carte;

public class Martyr extends Carte{
	
	private int nbCroyants;
	
	public Martyr(String nom, String capacite, boolean estDistribuee, int nbCroyants, TypeCarte typeCarte){
		super(capacite, capacite, estDistribuee, typeCarte);
		this.nbCroyants= nbCroyants;
	}
	
	public void attacherCroyant(){
		
	}
	
	public void utiliserCapacite(){
		
	}

}
