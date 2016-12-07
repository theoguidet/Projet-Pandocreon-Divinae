package partie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import propriete.Dogme;
import propriete.Origine;
import carte.Carte;
import carte.TypeCarte;
import carte.apocalypse.Apocalypse;
import carte.croyants.Moines;
import carte.divinite.Brewalen;
import carte.divinite.Divinite;
import carte.divinite.Drinded;
import carte.divinite.Gorpa;
import carte.divinite.Gwenghelen;
import carte.divinite.Killinstred;
import carte.divinite.Llewella;
import carte.divinite.PuiTara;
import carte.divinite.Romtec;
import carte.divinite.Shingva;
import carte.divinite.Yarstur;
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
import Joueur.JoueurVirtuel;

public class Partie {

	private int nbJoueur;
	private Joueur gagnant;
	private ArrayList<Joueur> joueurs;
	private ArrayList<Carte> cartes;
	private ArrayList<Divinite> divinites;
	
	public Partie(int nbJoueur){
		this.nbJoueur = nbJoueur;
		this.joueurs = new ArrayList<Joueur>();
		this.cartes = new ArrayList<Carte>();
		this.divinites = new ArrayList<Divinite>();
		this.gagnant = null;
		joueurs.add(new Joueur("moi"));
		for (int i = 0; i < nbJoueur-1; i++) {
			joueurs.add(new JoueurVirtuel("joueurVirtuel"+ nbJoueur));
		}
	}
	
	public void calculerScore(){
		
	}
	
	public void distribuerDivinites(){
		Collections.shuffle(divinites);
		for (Joueur j : joueurs) {
			j.setDivinite(divinites.get(0));
			divinites.remove(0);
		}
	}
	
	public void distribuerCarte(){
		Collections.shuffle(cartes);
		for (int i = 0; i < 7; i++) {
			for (Joueur joueur : joueurs) {
				joueur.completerMain(cartes.get(0));
			}
		}
	}
	
	public void creationJeuDeCarte(){
		
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
		
		//Declaration des apocalypses
		Apocalypse apocalypse1 = new Apocalypse(Origine.JOUR);
		Apocalypse apocalypse2 = new Apocalypse(Origine.NUIT);
		Apocalypse apocalypse3 = new Apocalypse(Origine.NEANT);
		Apocalypse apocalypse4 = new Apocalypse(null);
		Apocalypse apocalypse5 = new Apocalypse(null);
		
		
		
		cartes.add(apocalypse1);
		cartes.add(apocalypse2);
		cartes.add(apocalypse3);
		cartes.add(apocalypse4);
		cartes.add(apocalypse5);
		cartes.add(martyr1);
		cartes.add(martyr2);
		cartes.add(martyr3);
		cartes.add(clerc1);
		cartes.add(clerc2);
		cartes.add(clerc3);
		cartes.add(clerc4);
		cartes.add(clerc5);
		cartes.add(clerc6);
		cartes.add(clerc7);
		cartes.add(clerc8);
		cartes.add(anarchiste);
		cartes.add(paladin);
		cartes.add(ascete);
		cartes.add(exorciste);
		cartes.add(tyran);
		cartes.add(messie);
		cartes.add(shaman);
		
		
		//creation de la collection des divinités
		divinites.add(Brewalen.getInstance());
		divinites.add(Drinded.getInstance());
		divinites.add(Gorpa.getInstance());
		divinites.add(Gwenghelen.getInstance());
		divinites.add(Killinstred.getInstance());
		divinites.add(Llewella.getInstance());
		divinites.add(PuiTara.getInstance());
		divinites.add(Romtec.getInstance());
		divinites.add(Shingva.getInstance());
		divinites.add(Yarstur.getInstance());
		
	}
	
	public void supprimerJoueur(Joueur j){
		joueurs.remove(j);
	}
	
	public void determinerGagnant(){
		
	}
	
	public void calculerPointAction(Origine resultatDe, Joueur j){
		Origine o = j.getDivinite().getPropriete().getOrigine();
		if (resultatDe == Origine.JOUR) {
			if (o == Origine.JOUR) {
				j.setPointActionJour(j.getPointActionJour() +2);
			}else if (o == Origine.AUBE) {
				j.setPointActionAube(j.getPointActionAube() +1);
			}
		}else if (resultatDe == Origine.NUIT) {
			if (o == Origine.NUIT) {
				j.setPointActionNuit(j.getPointActionNuit() +2);
			}else if (o== Origine.CREPUSCULE) {
				j.setPointActionCrepuscule(j.getPointActionCrepuscule() +1);
			}
		}else if (resultatDe == Origine.NEANT) {
			if (o == Origine.CREPUSCULE) {
				j.setPointActionCrepuscule(j.getPointActionCrepuscule() +1);
			}else if (o == Origine.AUBE) {
				j.setPointActionAube(j.getPointActionAube() +1);
			}
		}
	}
	
	public void finirPartie(){
		
	}
	
	public ArrayList<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(ArrayList<Carte> cartes) {
		this.cartes = cartes;
	}

	public static void main(){
		System.out.println("entrez le nom");
		Scanner clavier = new Scanner(System.in);
		int nb = clavier.nextInt();
		
	}
}
