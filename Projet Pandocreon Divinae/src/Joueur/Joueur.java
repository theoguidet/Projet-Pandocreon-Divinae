package Joueur;

import java.util.ArrayList;
import carte.Carte;

public class Joueur {
	private String nom;
	private int nbPrieres;
	private int pointActionJour;
	private int pointActionNuit;
	private int pointActionNeant;
	private ArrayList<Carte> main;
	
	public Joueur(String nom) {
		this.nom = nom;
		this.nbPrieres = 0;
		this.pointActionJour = 0;
		this.pointActionNuit = 0;
		this.pointActionNeant = 0;
		this.main = new ArrayList<Carte>();
	}
	
	public void defausserCarte(){
		
	}
	
	public void completerMain(){
		
	}
	
	public void utiliserCarte(){
		
	}
	
	public void sacrifierCarte(){
		
	}
	
	public String lancerDe(){
		int tirageDe;
		ArrayList<String> origine = new ArrayList();
		tirageDe = (int) Math.random();
		for (int i = 0; i < 2; i++) {
					origine.add("Jour");
					origine.add("Nuit");
					origine.add("Neant");
		}
		return origine.get(tirageDe);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbPrieres() {
		return nbPrieres;
	}

	public void setNbPrieres(int nbPrieres) {
		this.nbPrieres = nbPrieres;
	}

	public int getPointActionJour() {
		return pointActionJour;
	}

	public void setPointActionJour(int pointActionJour) {
		this.pointActionJour = pointActionJour;
	}

	public int getPointActionNuit() {
		return pointActionNuit;
	}

	public void setPointActionNuit(int pointActionNuit) {
		this.pointActionNuit = pointActionNuit;
	}

	public int getPointActionNeant() {
		return pointActionNeant;
	}

	public void setPointActionNeant(int pointActionNeant) {
		this.pointActionNeant = pointActionNeant;
	}

	public ArrayList<Carte> getMain() {
		return main;
	}

	public void setMain(ArrayList<Carte> main) {
		this.main = main;
	}

	public void enleverPointAction(){
		
	}
	
}
