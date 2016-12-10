package partie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import propriete.Dogme;
import propriete.Origine;
import carte.Carte;
import carte.apocalypse.Apocalypse;
import carte.croyants.Alchimistes;
import carte.croyants.Alienes;
import carte.croyants.Demons;
import carte.croyants.Diplomates;
import carte.croyants.Ermite;
import carte.croyants.Esprits;
import carte.croyants.GuerriersSaints;
import carte.croyants.Illusionnistes;
import carte.croyants.Integristes;
import carte.croyants.Lycanthropes;
import carte.croyants.Moines;
import carte.croyants.Nihillistes;
import carte.croyants.Pillards;
import carte.croyants.Revenant;
import carte.croyants.Revolutionnaires;
import carte.croyants.Travailleurs;
import carte.croyants.Vampires;
import carte.deusex.Bouleversement;
import carte.deusex.ColereDivine;
import carte.deusex.Concentration;
import carte.deusex.Diversion;
import carte.deusex.Fourberie;
import carte.deusex.InfluenceJour;
import carte.deusex.InfluenceNeant;
import carte.deusex.InfluenceNuit;
import carte.deusex.InfluenceNulle;
import carte.deusex.Inquisition;
import carte.deusex.Miroir;
import carte.deusex.OrdreCeleste;
import carte.deusex.Phoenix;
import carte.deusex.Stase;
import carte.deusex.Transe;
import carte.deusex.TrouNoir;
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
import carte.guideSpirituel.Devin;
import carte.guideSpirituel.Exorciste;
import carte.guideSpirituel.Martyr;
import carte.guideSpirituel.Messie;
import carte.guideSpirituel.Paladin;
import carte.guideSpirituel.Shaman;
import carte.guideSpirituel.Sorcier;
import carte.guideSpirituel.Tyran;
import Joueur.Joueur;
import Joueur.JoueurVirtuel;

public class Partie {

	private int nbJoueur;
	private Joueur gagnant;
	private ArrayList<Joueur> joueurs;
	private ArrayList<Carte> cartes;
	private ArrayList<Divinite> divinites;
	private ArrayList<Carte> defausse;
	
	public Partie(int nbJoueur){
		this.nbJoueur = nbJoueur;
		this.joueurs = new ArrayList<Joueur>();
		this.cartes = new ArrayList<Carte>();
		this.divinites = new ArrayList<Divinite>();
		this.defausse = new ArrayList<Carte>();
		this.gagnant = null;
		joueurs.add(new Joueur("moi"));
		for (int i = 0; i < nbJoueur-1; i++) {
			joueurs.add(new JoueurVirtuel("joueurVirtuel"+ nbJoueur));
		}
	}
	
	public void distribuerDivinites(){
		Collections.shuffle(divinites);
		int i = 0;
		for (Joueur j : joueurs) {
			j.setDivinite(divinites.get(i));
			//divinites.remove(0);
			i++;
		}
	}
	
	public void distribuerCarte(){
		Collections.shuffle(cartes);
		for (Joueur joueur : joueurs) {
			joueur.completerMain(cartes);
		}
	}

	public ArrayList<Carte> creationJeuDeCarte(){
		
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
		Devin devin = new Devin(Dogme.NATURE, Dogme.MYSTIQUE, Origine.NEANT);
		Sorcier sorcier = new Sorcier(Dogme.MYSTIQUE, Dogme.SYMBOLES, Origine.NUIT);
		Anarchiste anarchiste = new Anarchiste();
		Paladin paladin = new Paladin();
		Ascete ascete = new Ascete();
		Exorciste exorciste = new Exorciste();
		Tyran tyran = new Tyran();
		Messie messie = new Messie();
		Shaman shaman = new Shaman();
		
		//Declaration des Croyants
		Moines moines1 = new Moines(Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUE);
		Moines moines2 = new Moines(Dogme.HUMAIN, Dogme.CHAOS, Dogme.MYSTIQUE);
		Moines moines3 = new Moines(Dogme.CHAOS, Dogme.SYMBOLES, Dogme.MYSTIQUE);
		Moines moines4 = new Moines(Dogme.HUMAIN, Dogme.SYMBOLES, Dogme.MYSTIQUE);
		Moines moines5 = new Moines(Dogme.CHAOS, Dogme.NATURE, Dogme.MYSTIQUE);
		Travailleurs travailleurs1 = new Travailleurs(Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour");
		Travailleurs travailleurs2 = new Travailleurs(Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Chaos ou Mystique de sacrifier un de ses Guides Spirituels durant ce tour.");
		Travailleurs travailleurs3 = new Travailleurs(Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.CHAOS, "Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.");
		Ermite ermite1 = new Ermite(Dogme.MYSTIQUE, Dogme.NATURE, Dogme.CHAOS);
		Ermite ermite2 = new Ermite(Dogme.MYSTIQUE, Dogme.NATURE, Dogme.SYMBOLES);
		Integristes integristes = new Integristes();
		GuerriersSaints guerriersSaints = new GuerriersSaints();
		Diplomates diplomates = new Diplomates();
		Demons demon1 = new Demons(Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUE);
		Demons demon2 = new Demons(Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.CHAOS);
		Demons demon3 = new Demons(Dogme.MYSTIQUE, Dogme.SYMBOLES, Dogme.CHAOS);
		Demons demon4 = new Demons(Dogme.MYSTIQUE, Dogme.NATURE, Dogme.CHAOS);
		Alchimistes alchimistes1 = new Alchimistes(Dogme.SYMBOLES, Dogme.NATURE, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Humain ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.");
		Alchimistes alchimistes2 = new Alchimistes(Dogme.MYSTIQUE, Dogme.NATURE, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Humain ou Symboles de sacrifier un de ses Guides Spirituels durant ce tour de jeu.");
		Alchimistes alchimistes3 = new Alchimistes(Dogme.SYMBOLES, Dogme.NATURE, Dogme.CHAOS, "Vous piochez deux cartes au hasard dans la main d'une autre Divinit�."); 		
		Vampires vampires1 = new Vampires(Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES);
		Vampires vampires2 = new Vampires(Dogme.HUMAIN, Dogme.MYSTIQUE, Dogme.CHAOS);
		Lycanthropes lycanthropes = new Lycanthropes();
		Pillards pillards = new Pillards();
		Illusionnistes illusionnistes = new Illusionnistes();
		Esprits esprits1 = new Esprits(Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUE);
		Esprits esprits2 = new Esprits(Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.CHAOS);
		Esprits esprits3 = new Esprits(Dogme.SYMBOLES, Dogme.CHAOS, Dogme.MYSTIQUE);
		Esprits esprits4 = new Esprits(Dogme.SYMBOLES, Dogme.NATURE, Dogme.MYSTIQUE);
		Esprits esprits5 = new Esprits(Dogme.NATURE, Dogme.CHAOS, Dogme.MYSTIQUE);
		Alienes alienes1 = new Alienes(Dogme.HUMAIN, Dogme.SYMBOLES, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.");
		Alienes alienes2 = new Alienes(Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES, "Emp�che une Divinit� poss�dant le Dogme Mystique ou Chaos de sacrifier un de ses Guides Spirituels durant ce tour de jeu.");
		Alienes alienes3 = new Alienes(Dogme.HUMAIN, Dogme.MYSTIQUE, Dogme.CHAOS, "Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.");
		Revenant revenant = new Revenant();
		Revolutionnaires revolutionnaires = new Revolutionnaires();
		Nihillistes nihillistes = new Nihillistes();
		
		
		//Declaration des apocalypses
		Apocalypse apocalypse1 = new Apocalypse(Origine.JOUR);
		Apocalypse apocalypse2 = new Apocalypse(Origine.NUIT);
		Apocalypse apocalypse3 = new Apocalypse(Origine.NEANT);
		Apocalypse apocalypse4 = new Apocalypse(null);
		Apocalypse apocalypse5 = new Apocalypse(null);
		
		//Declaration des DeusEx
		Bouleversement bouleversement = new Bouleversement();
		ColereDivine colereDivine1 = new ColereDivine(Origine.JOUR);
		ColereDivine colereDivine2 = new ColereDivine(Origine.NUIT);
		Concentration concentration = new Concentration();
		Diversion diversion = new Diversion();
		Fourberie fourberie = new Fourberie();
		InfluenceJour influenceJour = new InfluenceJour();
		InfluenceNuit influenceNuit = new InfluenceNuit();
		InfluenceNeant influenceNeant = new InfluenceNeant();
		InfluenceNulle influenceNulle1 = new InfluenceNulle();
		InfluenceNulle influenceNulle2 = new InfluenceNulle();
		Inquisition inquisition = new Inquisition();
		Miroir miroir = new Miroir();
		OrdreCeleste ordreCeleste = new OrdreCeleste();
		Phoenix phoenix = new Phoenix();
		Stase stase = new Stase();
		Transe transe = new Transe();
		TrouNoir trouNoir = new TrouNoir();
		
		//creation de la pioche 
		cartes.add(bouleversement);
		cartes.add(colereDivine1);
		cartes.add(colereDivine2);
		cartes.add(concentration);
		cartes.add(diversion);
		cartes.add(fourberie);
		cartes.add(influenceJour);
		cartes.add(influenceNuit);
		cartes.add(influenceNeant);
		cartes.add(influenceNulle1);
		cartes.add(influenceNulle2);
		cartes.add(inquisition);
		cartes.add(miroir);
		cartes.add(ordreCeleste);
		cartes.add(phoenix);
		cartes.add(stase);
		cartes.add(transe);
		cartes.add(trouNoir);
		
		cartes.add(moines1);
		cartes.add(moines2);
		cartes.add(moines3);
		cartes.add(moines4);
		cartes.add(moines5);
		cartes.add(travailleurs1);
		cartes.add(travailleurs2);
		cartes.add(travailleurs3);
		cartes.add(ermite1);
		cartes.add(ermite2);
		cartes.add(integristes);
		cartes.add(guerriersSaints);
		cartes.add(diplomates);
		cartes.add(demon1);
		cartes.add(demon2);
		cartes.add(demon3);
		cartes.add(demon4);
		cartes.add(alchimistes1);
		cartes.add(alchimistes2);
		cartes.add(alchimistes3);
		cartes.add(vampires1);
		cartes.add(vampires2);
		cartes.add(lycanthropes);
		cartes.add(pillards);
		cartes.add(illusionnistes);
		cartes.add(esprits1);
		cartes.add(esprits2);
		cartes.add(esprits3);
		cartes.add(esprits4);
		cartes.add(esprits5);
		cartes.add(alienes1);
		cartes.add(alienes2);
		cartes.add(alienes3);
		cartes.add(revenant);
		cartes.add(revolutionnaires);
		cartes.add(nihillistes);
		cartes.add(devin);
		cartes.add(sorcier);
		
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
		
		
		//creation de la collection des divinit�s
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
		
		return cartes;
	}
		
	public ArrayList<Joueur> classementJoueurs(){
		ArrayList<Joueur> joueursTries = new ArrayList<Joueur>();
		int i;
		
		joueursTries.add(0, joueurs.get(0));
		for (Joueur j : joueurs) {
			i=0;
			while (j.calculerScore() > joueursTries.get(i).calculerScore()) {
				i++;
			}
			joueursTries.add(i, j);
		}
		
		System.out.println("Le classement des joueurs est actuellement :");
		i=nbJoueur;
		for (Joueur joueur : joueursTries) {
			System.out.println("[" + i + "] " + joueur.getNom());
			i--;
		}
		
		return joueursTries;
	}
	
	public void supprimerJoueur(){
		ArrayList<Joueur> classement = classementJoueurs();
		System.out.println("Le joueur " + classement.get(0).getNom() + " est �limin�.");
		joueurs.remove(classement.get(0));
		nbJoueur--;
	}
	
	public void determinerGagnant(){
		ArrayList<Joueur> classement = classementJoueurs();
		gagnant = classement.get(classement.size()-1);
		finirPartie();
	}
	
	public int getNbJoueur() {
		return nbJoueur;
	}

	public void finirPartie(){
		
	}
	
	public ArrayList<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(ArrayList<Carte> cartes) {
		this.cartes = cartes;
	}
	
	public ArrayList<Carte> getDefausse() {
		return defausse;
	}

	public void ajouterADefausse(Carte c) {
		this.defausse.add(c);
	}

	public static void main(String[] args){
		System.out.println("Combien de joueurs voulez-vous dans la partie ?");
		Scanner clavier = new Scanner(System.in);
		int nbJoueur = clavier.nextInt();
		Partie partie = new Partie(nbJoueur);
		ArrayList<Carte> jeuDeCartes = partie.creationJeuDeCarte();
		partie.distribuerDivinites();
		partie.distribuerCarte();
		
		partie.joueurs.get(0).afficherMain();
		partie.joueurs.get(0).choisirCarteADefausser(partie);
		partie.joueurs.get(0).afficherMain();
		
//		while (partie.gagnant == null) {
//			for (Joueur j : partie.joueurs) {
//				j.getDivinite().afficherDivinite();
//				j.afficherMain();
//				j.choisirCarteADefausser(partie);
//				j.completerMain(jeuDeCartes);
//				j.afficherMain();
//				j.lancerDe();
//				j.completerMain(partie.cartes);
//				ArrayList<Carte> c = j.choisirCarte();
//				j.jouerCarte(c, partie);
//			}	
//		}
		
		clavier.close();
	}
}