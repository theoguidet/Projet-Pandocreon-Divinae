package Joueur;

import java.util.ArrayList;
import java.util.Scanner;

import partie.Partie;
import partie.Plateau;
import propriete.Origine;
import carte.Carte;
import carte.TypeCarte;
import carte.croyants.Croyant;
import carte.divinite.Divinite;
import carte.guideSpirituel.GuideSpirituel;

public class Joueur{
	protected String nom;
	protected int nbPrieres;
	protected int pointActionJour;
	protected int pointActionNuit;
	protected int pointActionNeant;
	protected ArrayList<Carte> main;
	protected ArrayList<Croyant> croyantRattaches;
	protected ArrayList<GuideSpirituel> guideRattaches;
	protected Divinite divinite;

	public Joueur(String nom) {
		this.nom = nom;
		this.nbPrieres = 0;
		this.pointActionJour = 0;
		this.pointActionNuit = 0;
		this.pointActionNeant = 0;
		this.main = new ArrayList<Carte>();
		this.croyantRattaches = new ArrayList<Croyant>();
		this.guideRattaches = new ArrayList<GuideSpirituel>();
	}
	
	public Carte defausserCarte(int i){
		Carte c = main.get(i);
		main.remove(i);
		return c;
	}
	
	public void piocherCarte(ArrayList<Carte> c){
		main.add(c.get(0));
	}
	
	public void completerMain(ArrayList<Carte> c){
		while(main.size()<7){
			piocherCarte(c);
		}
	}
	
	public void afficherMain(){
		for (Carte carte : main) {
			System.out.println(carte.toString());
		}
	}
	
	public ArrayList<Carte> choisirCarte(){
			afficherMain();
			int i=0;
			ArrayList<Carte> c = new ArrayList<Carte>();
			while (i < 7) {
				Scanner clavier = new Scanner(System.in);
				i = clavier.nextInt();
				c.add(main.get(i));
			}
			
		return c;
	}
	
	public void jouerCarte(ArrayList<Carte> c, Partie partie){
		Plateau p = Plateau.getInstance();
		for (Carte carte : c) {
			if (carte.getTypeCarte() == TypeCarte.croyant) {
				p.poserCroyantLibre((Croyant)carte);
			}else if (carte.getTypeCarte() == TypeCarte.guideSpirituel) {
				guideRattaches.add((GuideSpirituel)carte);
			}else if (carte.getTypeCarte() == TypeCarte.apocalyspe) {
				carte.utiliserCapacite();
				partie.ajouterADefausse(carte);
			}else if (carte.getTypeCarte() == TypeCarte.deusEx) {
				carte.utiliserCapacite();
				partie.ajouterADefausse(carte);
			}
			main.remove(c);
		}
	}

	public void ajouterCroyantRattaches(Croyant c) {
		this.croyantRattaches.add(c);
	}

	public void sacrifierCarte(Carte c){
		c.utiliserCapacite();
	}
	
	public void lancerDe(){
		int tirageDe, max=6, min=1;
		ArrayList<Origine> origine = new ArrayList<Origine>();		 

		tirageDe = (int)(Math.random()*(max-min))+min;
		for (int i = 0; i < 2; i++) {
					origine.add(Origine.JOUR);
					origine.add(Origine.NUIT);
					origine.add(Origine.NEANT);
		}
		System.out.println(origine.get(tirageDe));
		calculerPointAction(origine.get(tirageDe));
	}

	public int calculerScore(){
		nbPrieres = 0;
		for (Croyant c : croyantRattaches) {
			if (c.getTypeCarte() == TypeCarte.croyant) {
				nbPrieres = nbPrieres + c.getNbCroyants();
			}
		}
		return nbPrieres;
	}
	
	public void calculerPointAction(Origine resultatDe){
		switch (resultatDe) {
		case JOUR:
			System.out.println("1");
			if (this.divinite.getPropriete().getOrigine() == "JOUR") {
				pointActionJour = pointActionJour +2;
			}else if (this.divinite.getPropriete().getOrigine() == "AUBE") {
				pointActionJour++;
			}
			break;
		case NUIT:
			System.out.println("2");
			if (this.divinite.getPropriete().getOrigine() == "AUBE") {
				pointActionNuit = pointActionNuit +2;
			}else if (this.divinite.getPropriete().getOrigine()== "CREPUSCULE") {
				pointActionNuit++;
			}
			break;
		case NEANT:
			System.out.println("3");
			if (this.divinite.getPropriete().getOrigine() == "AUBE" || this.divinite.getPropriete().getOrigine() == "CREPUSCULE") {
				pointActionNeant++;
			}
			break;

		default:
			break;
		}
	}
	
	public void enleverPointAction(String o){
		switch (o) {
		case "JOUR":
			pointActionJour--;
			break;
		case "NEANT":
			pointActionNeant--;
			break;
		case "NUIT":
			pointActionNuit--;
			break;
		default:
			break;
		}
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

	public void setCroyantGuideRattaches(ArrayList<Croyant> croyantRattaches) {
		this.croyantRattaches = croyantRattaches;
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

	public Divinite getDivinite() {
		return divinite;
	}

	public void setDivinite(Divinite divinite) {
		this.divinite = divinite;
	}	
	
	public ArrayList<Croyant> getCroyantGuideRattaches() {
		return croyantRattaches;
	}

}
