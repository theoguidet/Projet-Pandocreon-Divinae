package Joueur;

import java.util.ArrayList;

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
	
	public void poserCarte(int i, Partie partie){
		Carte c = main.get(i);
		Plateau p = Plateau.getInstance();

		if (c.getTypeCarte() == TypeCarte.croyant) {
			p.poserCroyantLibre((Croyant)c);
		}else if (c.getTypeCarte() == TypeCarte.guideSpirituel) {
			guideRattaches.add((GuideSpirituel)c);
		}else if (c.getTypeCarte() == TypeCarte.apocalyspe) {
			c.utiliserCapacite();
			partie.ajouterADefausse(c);
		}else if (c.getTypeCarte() == TypeCarte.deusEx) {
			c.utiliserCapacite();
			partie.ajouterADefausse(c);
		}
		main.remove(c);
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
			if (divinite.getPropriete().getOrigine() == Origine.JOUR) {
				pointActionJour = pointActionJour +2;
			}else if (divinite.getPropriete().getOrigine() == Origine.AUBE) {
				pointActionJour++;
			}
			break;
		case NUIT:
			if (divinite.getPropriete().getOrigine() == Origine.NUIT) {
				pointActionNuit = pointActionNuit +2;
			}else if (divinite.getPropriete().getOrigine() == Origine.CREPUSCULE) {
				pointActionNuit++;
			}
			break;
		case NEANT:
			if (divinite.getPropriete().getOrigine() == Origine.AUBE || divinite.getPropriete().getOrigine() == Origine.CREPUSCULE) {
				pointActionNeant++;
			}
			break;

		default:
			break;
		}
	}
	
	public void enleverPointAction(Origine o){
		switch (o) {
		case JOUR:
			pointActionJour--;
			break;
		case NEANT:
			pointActionNeant--;
			break;
		case NUIT:
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
