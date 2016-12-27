package partie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import cartes.Carte;
import cartes.apocalypse.Apocalypse;
import cartes.croyant.Alchimistes;
import cartes.croyant.Alienes;
import cartes.croyant.Demons;
import cartes.croyant.Diplomates;
import cartes.croyant.Ermite;
import cartes.croyant.Esprits;
import cartes.croyant.GuerriersSaints;
import cartes.croyant.Illusionnistes;
import cartes.croyant.Integristes;
import cartes.croyant.Lycanthropes;
import cartes.croyant.Moines;
import cartes.croyant.Nihillistes;
import cartes.croyant.Pillards;
import cartes.croyant.Revenant;
import cartes.croyant.Revolutionnaires;
import cartes.croyant.Travailleurs;
import cartes.croyant.Vampires;
import cartes.deusex.Bouleversement;
import cartes.deusex.ColereDivine;
import cartes.deusex.Concentration;
import cartes.deusex.Diversion;
import cartes.deusex.Fourberie;
import cartes.deusex.InfluenceJour;
import cartes.deusex.InfluenceNeant;
import cartes.deusex.InfluenceNuit;
import cartes.deusex.InfluenceNulle;
import cartes.deusex.Inquisition;
import cartes.deusex.Miroir;
import cartes.deusex.OrdreCeleste;
import cartes.deusex.Phoenix;
import cartes.deusex.Stase;
import cartes.deusex.Transe;
import cartes.deusex.TrouNoir;
import cartes.divinite.Brewalen;
import cartes.divinite.Divinite;
import cartes.divinite.Drinded;
import cartes.divinite.Gorpa;
import cartes.divinite.Gwenghelen;
import cartes.divinite.Killinstred;
import cartes.divinite.Llewella;
import cartes.divinite.PuiTara;
import cartes.divinite.Romtec;
import cartes.divinite.Shingva;
import cartes.divinite.Yarstur;
import cartes.guideSpirituel.Anarchiste;
import cartes.guideSpirituel.Ascete;
import cartes.guideSpirituel.Clerc;
import cartes.guideSpirituel.Devin;
import cartes.guideSpirituel.Exorciste;
import cartes.guideSpirituel.Martyr;
import cartes.guideSpirituel.Messie;
import cartes.guideSpirituel.Paladin;
import cartes.guideSpirituel.Shaman;
import cartes.guideSpirituel.Sorcier;
import cartes.guideSpirituel.Tyran;
import joueurs.Joueur;
import joueurs.JoueurVirtuel;
import propriete.Dogme;
import propriete.Origine;

/**
 * classe "m�re" de l'application
 * @author Admin
 *
 */
public class Partie implements Runnable{

	private int nbJoueur;
	private Joueur gagnant;
	private ArrayList<Joueur> joueurs;
	private ArrayList<Carte> cartes;
	private ArrayList<Divinite> divinites;
	private ArrayList<Carte> defausse;
	public static Scanner scanner = new Scanner(System.in);
	private static Partie uniquePartie;
	
	private boolean partieEnCours=false;

	public boolean isPartieEnCours() {
		return partieEnCours;
	}

	public void setPartieEnCours(boolean partieEnCours) {
		this.partieEnCours = partieEnCours;
	}

	

	/**
	 * constructeur de la classe
	 * @param nbJoueur
	 * 		nombre de joueur � cr�er pour la partie
	 */
	public Partie(){
		this.joueurs = new ArrayList<Joueur>();
		this.cartes = new ArrayList<Carte>();
		this.divinites = new ArrayList<Divinite>();
		this.defausse = new ArrayList<Carte>();
		this.gagnant = null;

	}


	/**
	 * distribue une divinit� par joueur
	 */
	public void distribuerDivinites(){
		Collections.shuffle(divinites);
		int i = 0;
		for (Joueur j : joueurs) {
			j.setDivinite(divinites.get(i));
			//divinites.remove(0);
			divinites.get(i).setProprietaire(j);
			i++;
		}
	}
	
	/**
	 * distribue 7 cartes par joueur
	 */
	public void distribuerCarte(){
		Collections.shuffle(cartes);
		for (Joueur joueur : joueurs) {
			joueur.completerMain(cartes);
		}
	}

	/**
	 * instanciation des cartes et cr�ation de la pioche pour les cartes d'actions et pour les divinit�s
	 * @return
	 */
	public ArrayList<Carte> creationJeuDeCarte(){
		
		//d�claration des guides spirituels
		Martyr martyr1 = new Martyr(37,Dogme.NATURE, Dogme.HUMAIN, Origine.JOUR);
		Martyr martyr2 = new Martyr(38,Dogme.SYMBOLES, Dogme.HUMAIN, Origine.NUIT);
		Martyr martyr3 = new Martyr(39,Dogme.NATURE, Dogme.CHAOS, Origine.NEANT);
		Clerc clerc1 = new Clerc(40,Dogme.HUMAIN, Dogme.CHAOS, Origine.JOUR);
		Clerc clerc2 = new Clerc(41,Dogme.NATURE, Dogme.SYMBOLES, Origine.NUIT);
		Clerc clerc3 = new Clerc(42,Dogme.NATURE, Dogme.MYSTIQUE, Origine.NEANT);
		Clerc clerc4 = new Clerc(43,Dogme.NATURE, Dogme.CHAOS, Origine.JOUR);
		Clerc clerc5 = new Clerc(44,Dogme.MYSTIQUE, Dogme.SYMBOLES, Origine.NUIT);
		Clerc clerc6 = new Clerc(45,Dogme.SYMBOLES, Dogme.CHAOS, Origine.NEANT);
		Clerc clerc7 = new Clerc(46,Dogme.MYSTIQUE, Dogme.CHAOS, Origine.JOUR);
		Clerc clerc8 = new Clerc(47,Dogme.HUMAIN, Dogme.NATURE, Origine.NUIT);
		Devin devin = new Devin(52,Dogme.NATURE, Dogme.MYSTIQUE, Origine.NEANT);
		Sorcier sorcier = new Sorcier(54,Dogme.MYSTIQUE, Dogme.SYMBOLES, Origine.NUIT);
		Anarchiste anarchiste = new Anarchiste(49);
		Paladin paladin = new Paladin(50);
		Ascete ascete = new Ascete(51);
		Exorciste exorciste = new Exorciste(53);
		Tyran tyran = new Tyran(55);
		Messie messie = new Messie(56);
		Shaman shaman = new Shaman(48);
		
		//Declaration des Croyants
		Moines moines1 = new Moines(1,Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUE);
		Moines moines2 = new Moines(2,Dogme.HUMAIN, Dogme.CHAOS, Dogme.MYSTIQUE);
		Moines moines3 = new Moines(3,Dogme.CHAOS, Dogme.SYMBOLES, Dogme.MYSTIQUE);
		Moines moines4 = new Moines(4,Dogme.HUMAIN, Dogme.SYMBOLES, Dogme.MYSTIQUE);
		Moines moines5 = new Moines(5,Dogme.CHAOS, Dogme.NATURE, Dogme.MYSTIQUE);
		Travailleurs travailleurs1 = new Travailleurs(6,Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour");
		Travailleurs travailleurs2 = new Travailleurs(7,Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Chaos ou Mystique de sacrifier un de ses Guides Spirituels durant ce tour.");
		Travailleurs travailleurs3 = new Travailleurs(8,Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.CHAOS, "Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.");
		Ermite ermite1 = new Ermite(9,Dogme.MYSTIQUE, Dogme.NATURE, Dogme.CHAOS);
		Ermite ermite2 = new Ermite(10,Dogme.MYSTIQUE, Dogme.NATURE, Dogme.SYMBOLES);
		Integristes integristes = new Integristes(11);
		GuerriersSaints guerriersSaints = new GuerriersSaints(12);
		Diplomates diplomates = new Diplomates(13);
		Demons demon1 = new Demons(14,Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUE);
		Demons demon2 = new Demons(15,Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.CHAOS);
		Demons demon3 = new Demons(16,Dogme.MYSTIQUE, Dogme.SYMBOLES, Dogme.CHAOS);
		Demons demon4 = new Demons(17,Dogme.MYSTIQUE, Dogme.NATURE, Dogme.CHAOS);
		Alchimistes alchimistes1 = new Alchimistes(18,Dogme.SYMBOLES, Dogme.NATURE, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Humain ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.");
		Alchimistes alchimistes2 = new Alchimistes(19,Dogme.MYSTIQUE, Dogme.NATURE, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Humain ou Symboles de sacrifier un de ses Guides Spirituels durant ce tour de jeu.");
		Alchimistes alchimistes3 = new Alchimistes(20,Dogme.SYMBOLES, Dogme.NATURE, Dogme.CHAOS, "Vous piochez deux cartes au hasard dans la main d'une autre Divinit�."); 		
		Vampires vampires1 = new Vampires(21,Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES);
		Vampires vampires2 = new Vampires(22,Dogme.HUMAIN, Dogme.MYSTIQUE, Dogme.CHAOS);
		Lycanthropes lycanthropes = new Lycanthropes(23);
		Pillards pillards = new Pillards(24);
		Illusionnistes illusionnistes = new Illusionnistes(25);
		Esprits esprits1 = new Esprits(26,Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUE);
		Esprits esprits2 = new Esprits(27,Dogme.MYSTIQUE, Dogme.HUMAIN, Dogme.CHAOS);
		Esprits esprits3 = new Esprits(28,Dogme.SYMBOLES, Dogme.CHAOS, Dogme.MYSTIQUE);
		Esprits esprits4 = new Esprits(29,Dogme.SYMBOLES, Dogme.NATURE, Dogme.MYSTIQUE);
		Esprits esprits5 = new Esprits(30,Dogme.NATURE, Dogme.CHAOS, Dogme.MYSTIQUE);
		Alienes alienes1 = new Alienes(31,Dogme.HUMAIN, Dogme.SYMBOLES, Dogme.CHAOS, "Emp�che une Divinit� poss�dant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.");
		Alienes alienes2 = new Alienes(32,Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES, "Emp�che une Divinit� poss�dant le Dogme Mystique ou Chaos de sacrifier un de ses Guides Spirituels durant ce tour de jeu.");
		Alienes alienes3 = new Alienes(33,Dogme.HUMAIN, Dogme.MYSTIQUE, Dogme.CHAOS, "Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.");
		Revenant revenant = new Revenant(34);
		Revolutionnaires revolutionnaires = new Revolutionnaires(35);
		Nihillistes nihillistes = new Nihillistes(36);
		
		
		//Declaration des apocalypses
		Apocalypse apocalypse1 = new Apocalypse(Origine.JOUR);
		Apocalypse apocalypse2 = new Apocalypse(Origine.NUIT);
		Apocalypse apocalypse3 = new Apocalypse(Origine.NEANT);
		Apocalypse apocalypse4 = new Apocalypse(Origine.NULL);
		Apocalypse apocalypse5 = new Apocalypse(Origine.NULL);
		
		//Declaration des DeusEx
		Bouleversement bouleversement = new Bouleversement(57);
		ColereDivine colereDivine1 = new ColereDivine(58,Origine.JOUR);
		ColereDivine colereDivine2 = new ColereDivine(59,Origine.NUIT);
		Concentration concentration = new Concentration(60);
		Diversion diversion = new Diversion(61);
		Fourberie fourberie = new Fourberie(62);
		InfluenceJour influenceJour = new InfluenceJour(63);
		InfluenceNuit influenceNuit = new InfluenceNuit(64);
		InfluenceNeant influenceNeant = new InfluenceNeant(65);
		InfluenceNulle influenceNulle1 = new InfluenceNulle(66);
		InfluenceNulle influenceNulle2 = new InfluenceNulle(67);
		Inquisition inquisition = new Inquisition(68);
		Miroir miroir = new Miroir(69);
		OrdreCeleste ordreCeleste = new OrdreCeleste(70);
		Phoenix phoenix = new Phoenix(71);
		Stase stase = new Stase(72);
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
		
	public Joueur getGagnant() {
		return gagnant;
	}

	public void setGagnant(Joueur gagnant) {
		this.gagnant = gagnant;
	}

	public ArrayList<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(ArrayList<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	public ArrayList<Divinite> getDivinites() {
		return divinites;
	}

	public void setDivinites(ArrayList<Divinite> divinites) {
		this.divinites = divinites;
	}

	public ArrayList<Carte> getDefausse() {
		return defausse;
	}

	public void setDefausse(ArrayList<Carte> defausse) {
		this.defausse = defausse;
	}

	public static Scanner getScanner() {
		return scanner;
	}

	public static void setScanner(Scanner scanner) {
		Partie.scanner = scanner;
	}

	public void setNbJoueur(int nbJoueur) {
		this.nbJoueur = nbJoueur;
	}

	public void setCartes(ArrayList<Carte> cartes) {
		this.cartes = cartes;
	}

	public static Partie getUniquePartie() {
		if (uniquePartie == null) {
			uniquePartie = new Partie();
		}
		return uniquePartie;
	}

	public static void setUniquePartie(Partie uniquePartie) {
		Partie.uniquePartie = uniquePartie;
	}
	/**
	 * �tabli le classement des joueurs
	 * @return la liste class�e des joueurs
	 */
	public ArrayList<Joueur> classementJoueurs(){
		ArrayList<Joueur> joueursTries = new ArrayList<Joueur>();
		int i;
		
		joueursTries.add(0, joueurs.get(0));
		for (Joueur j : joueurs) {
			i=0;
			while (j.calculerScore() > joueursTries.get(i).calculerScore()) {
				i++;
				joueursTries.add(i, j);
			}
			
		}
		
		System.out.println("Le classement des joueurs est actuellement :");
		i=nbJoueur;
		for (Joueur joueur : joueursTries) {
			System.out.println("[" + i + "] " + joueur.getNom());
			i--;
		}
		
		return joueursTries;
	}
	
	/**
	 * supprime un joueur de la partie
	 */
	public void supprimerJoueur(){
		ArrayList<Joueur> classement = classementJoueurs();
		System.out.println("Le joueur " + classement.get(0).getNom() + " est �limin�.");
		joueurs.remove(classement.get(0));
		nbJoueur--;
	}
	
	/**
	 * determine le gagnant et termine la partie
	 */
	public void determinerGagnant(){
		ArrayList<Joueur> classement = classementJoueurs();
		gagnant = classement.get(classement.size()-1);
		finirPartie();
	}
	
	public int getNbJoueur() {
		return nbJoueur;
	}

	/**
	 * fini la partie
	 */
	public void finirPartie(){
		
	}
	
	public ArrayList<Carte> getCartes() {
		return cartes;
	}

	/**
	 * ajoute une carte � la d�fausse
	 * @param c
	 * 		carte � d�fausser
	 */
	public void ajouterADefausse(Carte c) {
		this.defausse.add(c);
	}
	
	public void initialiserJoueurs(){
		System.out.println("Combien de joueurs voulez-vous dans la partie ?");
		//Scanner clavier = new Scanner(System.in);
		int nbJoueur = scanner.nextInt();
		String nom = scanner.nextLine();
		System.out.println("Entrez votre nom :");
		nom = scanner.nextLine();
		joueurs.add(new Joueur(nom));
		/**
		 * ajouter la position de chaque joueur
		 */
		for (int i = 1; i < nbJoueur; i++) {
			System.out.println("Entrez le nom du joueur virtuel " + i);
			nom = scanner.nextLine();
			joueurs.add(new JoueurVirtuel(nom));
		}
	
	}

	public static void main(String[] args){
		uniquePartie = getUniquePartie();
		Partie partie = uniquePartie;
//		partie.initialiserJoueurs();
//		partie.creationJeuDeCarte();
//		partie.distribuerDivinites();
//		partie.distribuerCarte();
//		
//		while (partie.gagnant == null) {
//			for(Joueur j: partie.joueurs){
//			j.tourDeJeu(partie);
//			
//			}	
//		}
		partie.run();
		//clavier.close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		initialiserJoueurs();
		creationJeuDeCarte();
		distribuerDivinites();
		distribuerCarte();
		
		while (gagnant == null) {
//			for(Joueur j: joueurs){
//			
//			}	
			for (int i = 0; i < joueurs.size(); i++) {
				Joueur joueurActuel = joueurs.get(i);
				joueurActuel.run();
			}
		}
	}
}