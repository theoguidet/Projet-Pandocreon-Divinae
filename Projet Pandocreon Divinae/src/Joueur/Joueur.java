package Joueur;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

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
	
	public void enleverPointAction(){
		
	}
	
}
