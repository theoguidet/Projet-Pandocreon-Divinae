import java.util.ArrayList;

import propriete.Dogme;
import propriete.Origine;
import carte.Carte;
import carte.TypeCarte;
import carte.croyants.Moines;
import carte.guideSpirituel.Anarchiste;
import carte.guideSpirituel.Ascete;
import carte.guideSpirituel.Clerc;
import carte.guideSpirituel.Exorciste;
import carte.guideSpirituel.Martyr;
import carte.guideSpirituel.Messie;
import carte.guideSpirituel.Paladin;
import carte.guideSpirituel.Shaman;
import carte.guideSpirituel.Tyran;
import Joueur.Joueur;

public class Partie {

	private int nbJoueur;
	private Joueur gagnant;
	private ArrayList<Joueur> joueurs;
	private ArrayList<Carte> cartes;
	
	public Partie(int nbJoueur){
		this.nbJoueur = nbJoueur;
		this.joueurs = new ArrayList<Joueur>();
		this.cartes = new ArrayList<Carte>();
	}
	
	public void calculerScore(){
		
	}
	
	public void distribuerCarte(){
		
	}
	
	public void commencerPartie(){
		
		//déclaration des guides spirituels
		Martyr martyr1 = new Martyr(Dogme.NATURE, Dogme.HUMAIN, Origine.JOUR);
		Martyr martyr2 = new Martyr(Dogme.SYMBOLES, Dogme.HUMAIN, Origine.NUIT);
		Martyr martyr3 = new Martyr(Dogme.NATURE, Dogme.CHAOS, Origine.NEANT);
		Clerc clerc1 = new Clerc(Dogme.HUMAIN, Dogme.CHAOS, Origine.JOUR);
		Clerc clerc2 = new Clerc(Dogme.NATURE, Dogme.SYMBOLES, Origine.NUIT);
		Clerc clerc3 = new Clerc(Dogme.NATURE, Dogme.MYSTIQUE, Origine.NEANT);
		Clerc clerc4 = new Clerc(Dogme.NATURE, Dogme.CHAOS, Origine.JOUR);
		Clerc clerc5 = new Clerc(Dogme.MYSTIQUE, Dogme.SYMBOLES, Origine.NUIT);
		Clerc clerc6 = new Clerc(Dogme.SYMBOLES, Dogme.CHAOS, Origine.NEANT);
		Clerc clerc7 = new Clerc(Dogme.MYSTIQUE, Dogme.CHAOS, Origine.JOUR);
		Clerc clerc8 = new Clerc(Dogme.HUMAIN, Dogme.NATURE, Origine.NUIT);
		Anarchiste anarchiste = new Anarchiste();
		Paladin paladin = new Paladin();
		Ascete ascete = new Ascete();
		Exorciste exorciste = new Exorciste();
		Tyran tyran = new Tyran();
		Messie messie = new Messie();
		Shaman shaman = new Shaman();






	}
	
	public void supprimerJoueur(){
		
	}
	
	public void determinerGagnant(){
		
	}
	
	public void calculerPointAction(){
		
	}
	
	public void finirPartie(){
		
	}
}
