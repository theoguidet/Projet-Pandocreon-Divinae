package carte;

import propriete.Propriete;

public class Carte {
	protected String nom;
	protected TypeCarte typeCarte;
	protected String capacite;
	protected boolean estDistribuee;
	protected Propriete propriete;

	public Carte(){
		this.estDistribuee = false;
	}
	
	public void utiliserCapacite(){
		
	}
	
	public String toString(){
		String def = "Nom : " + nom + "\nCapacité : " + capacite;
		return def;
	}
	
	public Propriete getPropriete() {
		return propriete;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeCarte getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(TypeCarte typeCarte) {
		this.typeCarte = typeCarte;
	}

	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}

	public boolean isEstDistribuee() {
		return estDistribuee;
	}

	public void setEstDistribuee(boolean estDistribuee) {
		this.estDistribuee = estDistribuee;
	}
	
	
	
}
