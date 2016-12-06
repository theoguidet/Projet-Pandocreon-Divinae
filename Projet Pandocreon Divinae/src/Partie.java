import java.util.ArrayList;

import propriete.Dogme;
import propriete.Origine;
import carte.Carte;
import carte.TypeCarte;
import carte.apocalypse.Apocalypse;
import carte.croyants.Moines;
import carte.divinite.Brewalen;
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
		
		//d�claration des guides spirituels
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

		//D�claration des divnit�s
		Brewalen brewalen = null;
		brewalen.getInstance();
		Drinded drinded = null;
		drinded.getInstance();
		Gorpa gorpa = null;
		gorpa.getInstance();
		Gwenghelen gwenghelen = null;
		gwenghelen.getInstance();
		Killinstred killinstred = null;
		killinstred.getInstance();
		Llewella llewella = null;
		llewella.getInstance();
		PuiTara puiTara = null;
		puiTara.getInstance();
		Romtec romtec = null;
		romtec.getInstance();
		Shingva shingva = null;
		shingva.getInstance();
		Yarstur yarstur = null;
		yarstur.getInstance();
		
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
