package Carte;

public class Carte {
	private String nom;
	private enum typeCarte {
		apocalyspe ("Apocaplyspe"),
		croyant ("Croyant"),
		guideSpirituel("Guide Spirituel"),
		deusEx ("Deus Ex"),
		divinite ("Divinite");
		
		typeCarte(String type){
		};
	}
	private String capacite;
	private boolean estDistribuee;
	
	public Carte(String nom, String capacite, boolean estDistribuee) {
		this.nom = nom;
		this.capacite = capacite;
		this.estDistribuee = estDistribuee;
	}
	
	public void utiliserCapacite(){
		
	}
}