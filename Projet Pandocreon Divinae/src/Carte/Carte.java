package carte;

public class Carte {
	protected String nom;
	protected TypeCarte typeCarte;
	protected String capacite;
	protected boolean estDistribuee;
	
	public Carte(String nom, String capacite, boolean estDistribuee, TypeCarte typeCarte) {
		this.nom = nom;
		this.capacite = capacite;
		this.estDistribuee = estDistribuee;
		this.typeCarte = typeCarte;
	}
	
	public Carte(){}
	
	public void utiliserCapacite(){
		
	}
	
	public static void main(){
		Carte c = new Carte("Clerc", "capac", false, TypeCarte.croyant);
		
		
	}
}
