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
	
	public void lancerDe(){
		
	}
	
	public void enleverPointAction(){
		
	}
	
}
