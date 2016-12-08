package Joueur;

import java.util.ArrayList;

import partie.Plateau;
import carte.Carte;
import carte.croyants.Croyant;
import carte.divinite.Divinite;

public class Joueur {
	private String nom;
	private int nbPrieres;
	private int pointActionJour;
	private int pointActionCrepuscule;
	private int pointActionAube;
	private int pointActionNuit;
	private int pointActionNeant;
	private ArrayList<Carte> main;
	private ArrayList<Carte> croyantGuideRattaches;
	private Divinite divinite;
	
	public int getPointActionCrepuscule() {
		return pointActionCrepuscule;
	}

	public void setPointActionCrepuscule(int pointActionCrepuscule) {
		this.pointActionCrepuscule = pointActionCrepuscule;
	}

	public int getPointActionAube() {
		return pointActionAube;
	}

	public void setPointActionAube(int pointActionAube) {
		this.pointActionAube = pointActionAube;
	}

	public Divinite getDivinite() {
		return divinite;
	}

	public void setDivinite(Divinite divinite) {
		this.divinite = divinite;
	}

	public Joueur(String nom) {
		this.nom = nom;
		this.nbPrieres = 0;
		this.pointActionJour = 0;
		this.pointActionNuit = 0;
		this.pointActionNeant = 0;
		this.main = new ArrayList<Carte>();
		this.croyantGuideRattaches = new ArrayList<Carte>();
	}
	
	public Carte defausserCarte(int i){
		Carte c = main.get(i);
		main.remove(i);
		return c;
	}
	
	public void piocherCarte(ArrayList<Carte> c){
		main.add(c.get(1));
	}
	
	public void completerMain(Carte c){
		main.add(c);
	}
	
	public void poserCarte(int i){
		Croyant c = (Croyant) main.get(i);
		Plateau p = Plateau.getInstance();
		p.poserCroyantLibre(c);
		main.remove(c);
	}
	
	public ArrayList<Carte> getCroyantGuideRattaches() {
		return croyantGuideRattaches;
	}

	public void ajouterCroyantGuideRattaches(Carte c) {
		this.croyantGuideRattaches.add(c);
	}

	public void sacrifierCarte(Carte c){
		c.utiliserCapacite();
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

	public void setCroyantGuideRattaches(ArrayList<Carte> croyantGuideRattaches) {
		this.croyantGuideRattaches = croyantGuideRattaches;
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
