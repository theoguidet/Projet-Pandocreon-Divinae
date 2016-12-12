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

/**
 * Repr�sente un joueur r�el 
 * @author Admin
 *
 */
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
	protected boolean estVirtuel;

	/**
	 * constructeur de la classe
	 * @param nom
	 * 		nom du joueur
	 */
	public Joueur(String nom) {
		this.nom = nom;
		this.nbPrieres = 0;
		this.pointActionJour = 0;
		this.pointActionNuit = 0;
		this.pointActionNeant = 0;
		this.main = new ArrayList<Carte>();
		this.croyantRattaches = new ArrayList<Croyant>();
		this.guideRattaches = new ArrayList<GuideSpirituel>();
		this.estVirtuel = false;
	}
	
	/**
	 * Fait choisir les cartes � d�fausser 
	 * @param p
	 * 		instance de la partie
	 */
	public void choisirCarteADefausser(Partie p){
		String rep = "";
		boolean defausser = false;
		boolean continuer = true;
		System.out.println("Voulez-vous d�fausser une/des carte(s) ? o/n");
		while(continuer == true){
			rep = Partie.scanner.nextLine();
			
			if (rep.equals("o")) {
				defausser = true;
				continuer = false;
			}else if (rep.equals("n")) {
				defausser = false;
				continuer = false;
			}else{
				continuer = true;
			}
		}
		
		int i = 2;
		ArrayList<Integer> indiceCarteADefausser = new ArrayList<Integer>();
		ArrayList<Carte> carteADefausser = new ArrayList<Carte>();
		while (defausser == true) {
			

			System.out.println("Entrez le num�ro de la carte � d�fausser : ");
			i = Partie.scanner.nextInt();
			if ((i <= main.size() && i >= 0)) {
				if(indiceCarteADefausser.contains(i)){
					System.out.println("Ce num�ro ne correspond pas.");
				}else{
					indiceCarteADefausser.add(i);
					carteADefausser.add(main.get(i));
				}
			}else{
				System.out.println("Ce num�ro ne correspond pas.");
			}

			System.out.println("Continuer ? o/n");
			rep = Partie.scanner.next();
			if (rep.equals("n") ) {
				defausser = false;
			}
		}
		
		
		for (Carte carte : carteADefausser) {
			p.ajouterADefausse(carte);
			main.remove(carte);
		}
	}
	
	
	/**
	 * D�fausse une carte de la main du joueur
	 * @param i
	 * 		indice de la carte � d�fausser
	 * @return	la carte d�fauss�e
	 */
	public Carte defausserCarte(int i){
		Carte c = main.get(i);
		main.remove(i);
		return c;
	}
	
	/**
	 * pioche une carte et l'ajoute dans la main du joueur 
	 * @param c
	 * 		pioche du jeu de carte
	 */
	public void piocherCarte(ArrayList<Carte> c){
		main.add(c.get(0));
		c.remove(0);
	}
	
	/**
	 * compl�te la main du joueur
	 * @param c
	 * 		pioche du jeu de carte
	 */
	public void completerMain(ArrayList<Carte> c){
		while(main.size()<7){
			piocherCarte(c);
		}
	}
	
	/**
	 * affiche la main du joueur
	 */
	public void afficherMain(){
		int i = 0;
		System.out.println("Voici votre main : ");
		for (Carte carte : main) {
			System.out.println("[" + i + "] " +carte.toString());
			i++;
		}
	}
	
	/**
	 * affiche les cartes que le joueur peut jouer
	 * @param c
	 * 		liste des cartes que le joueur peut jouer
	 */
	public void afficherCartePossible(ArrayList<Carte> c){
		int i = 0;
		if (c.isEmpty()) {
			System.out.println("Vous ne pouvez jouer aucune cartes !");
		}else{
			for (Carte carte : c) {
				System.out.println("[" + i + "] " +carte.toString());
				i++;
			}
		}
	}
	
	/**
	 * Fait choisir les cartes � jouer 
	 * @param cartePossible
	 * 		liste des cartes pouvant �tre jou�es
	 * @return	liste des cartes � jouer
	 */
	public ArrayList<Carte> choisirCarteAJouer(ArrayList<Carte> cartePossible){
		int i=0;
		boolean fin = false;
		ArrayList<Carte> carteAJOuer = new ArrayList<Carte>();
		ArrayList<Integer> indiceCarte = new ArrayList<Integer>();
		//Scanner clavier = new Scanner(System.in);
		while (fin == false) {
			if (pointActionJour == 0 && pointActionNuit == 0 && pointActionNeant == 0) {
				fin = true;
			}else{
				i = Partie.scanner.nextInt();
				if (i>cartePossible.size()-1 || i <0) {
					fin = true;
				}else{
					if (verifierPointAction(cartePossible.get(i))) {
						if (indiceCarte.contains(i)) {
							System.out.println("Ce numero a deja �t� choisi !");
						}else{
							indiceCarte.add(i);
							carteAJOuer.add(cartePossible.get(i));
							enleverPointAction(cartePossible.get(i).getPropriete().getOrigine());
						}
					}else{
						System.out.println("Vous n'avez pas assez de points d'action !");
					}
				}
			}
		}
		//clavier.close();
		return carteAJOuer;
	}
	
	/**
	 * verifie les points d'actions pour pouvoir jouer une carte
	 * @param c
	 * 		carte dont on va verifier si le joueur peut la jouer
	 * @return vrai ou faux selon les points d'actions
	 */
	public boolean verifierPointAction(Carte c){
		boolean ok = false;
		switch (c.getPropriete().getOrigine()) {
		case JOUR:
			if (pointActionJour > 0) {
				ok = true;
			}
			break;
		case NUIT:
			if (pointActionNuit > 0) {
				ok = true;
			}
			break;
		case NEANT:
			if (pointActionNeant > 0) {
				ok = true;
			}
			break;
		case NULL:
			ok = true;

		default:
			break;
		}
		return ok;
	}

	/**
	 * joue les cartes que le joueur � choisi
	 * @param c
	 * 		liste des cartes que le joueur veut jouer
	 * @param partie
	 * 		instance de la partie
	 */
	public void jouerCarte(ArrayList<Carte> c, Partie partie){
		if (c != null) {
			Plateau p = Plateau.getInstance();
			for (Carte carte : c) {
				switch (carte.getTypeCarte()) {
				case croyant:
					p.poserCroyantLibre((Croyant)carte);
					break;
				case guideSpirituel:
					guideRattaches.add((GuideSpirituel)carte);
					break;
				case deusEx:
					carte.utiliserCapacite();
					partie.ajouterADefausse(carte);
					break;
				case apocalyspe:
					carte.utiliserCapacite();
					partie.ajouterADefausse(carte);
					break;
				default:
					break;
				}
				main.remove(carte);
			}
		}
	}

	/**
	 * ajoute un croyant rattach� � un guide spirituel
	 * @param c
	 * 		croyant devant �tre rattach�
	 */
	public void ajouterCroyantRattaches(Croyant c) {
		this.croyantRattaches.add(c);
	}
	
	/**
	 * lance le d�
	 * @return la liste des cartes pouvant �tre jou�es par le joueur
	 */
	public ArrayList<Carte> lancerDe(){
		int tirageDe, max=6, min=1;
		ArrayList<Origine> origine = new ArrayList<Origine>();		 

		tirageDe = (int)(Math.random()*(max-min))+min;
		for (int i = 0; i < 2; i++) {
					origine.add(Origine.JOUR);
					origine.add(Origine.NUIT);
					origine.add(Origine.NEANT);
		}
		System.out.println("Le r�sultat du d� est : " + origine.get(tirageDe));
		return calculerPointAction(origine.get(tirageDe));
	}

	/**
	 * calcule le nombre de points de pri�res du joueur
	 * @return le nombre de points de pri�res
	 */
	public int calculerScore(){
		nbPrieres = 0;
		for (GuideSpirituel guide : guideRattaches) {
			for (Carte croyant : guide.getCroyantRattaches()) {
				nbPrieres = nbPrieres + ((Croyant) croyant).getNbCroyants();
			}
		}
		return nbPrieres;
	}
	
	/**
	 * calcule les points d'actions du joueur
	 * @param resultatDe
	 * 		r�sultat du d�
	 * @return la liste des cartes pouvant �tre jou�es
	 */
	public ArrayList<Carte> calculerPointAction(Origine resultatDe){
		switch (resultatDe) {
		case JOUR:
			if (this.divinite.getPropriete().getOrigine() == Origine.JOUR) {
				pointActionJour = pointActionJour +2;
			}else if (this.divinite.getPropriete().getOrigine() == Origine.AUBE) {
				pointActionJour++;
			}
			break;
		case NUIT:
			if (this.divinite.getPropriete().getOrigine() == Origine.NUIT) {
				pointActionNuit = pointActionNuit +2;
			}else if (this.divinite.getPropriete().getOrigine()== Origine.CREPUSCULE) {
				pointActionNuit++;
			}
			break;
		case NEANT:
			if (this.divinite.getPropriete().getOrigine() == Origine.AUBE || this.divinite.getPropriete().getOrigine() == Origine.CREPUSCULE) {
				pointActionNeant++;
			}
			break;

		default:
			break;
		}
		ArrayList<Carte> cartePossible = new ArrayList<Carte>();
		if (pointActionJour > 0) {
			for (Carte c : main) {
				if (c.getPropriete().getOrigine() == Origine.JOUR) {
					cartePossible.add(c);
				}
			}
		}
		if (pointActionNuit > 0) {
			for (Carte c : main) {
				if (c.getPropriete().getOrigine() == Origine.NUIT) {
					cartePossible.add(c);
				}
			}
		}
		if (pointActionNeant > 0) {
			for (Carte c : main) {
				if (c.getPropriete().getOrigine() == Origine.NEANT) {
					cartePossible.add(c);
				}
			}
		}
		for (Carte c : main) {
			if (c.getPropriete().getOrigine() == Origine.NULL) {
				cartePossible.add(c);
			}
		}

		System.out.println("Vous avez : ");
		System.out.println(pointActionJour + "point(s) d'action jour");
		System.out.println(pointActionNuit + "point(s) d'action nuit");
		System.out.println(pointActionNeant + "point(s) d'action neant");
		System.out.println("Vous ne pouvez jouer que ces cartes : ");
		if (estVirtuel) {}else{
			afficherCartePossible(cartePossible);
		}
		return cartePossible;
	}
	
	/**
	 * d�cr�mente les points d'actions du joueur
	 * @param o
	 * 		Origine des points d'actions devant �tre d�cr�ment�s
	 */
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
	
	/**
	 * affiche la liste des cartes pouvant �tre sacrifi�es
	 * @param c
	 * 		liste des cartes pouvant �tre sacrifi�es 
	 */
	public void afficherCartes(ArrayList<Carte> c){
		if (c.isEmpty()) {
			System.out.println("Il n'y a pas de carte a sacrifier.");
		}else{
			int i = 0;
			for (Carte carte : c) {
				System.out.println("[" + i + "] " + carte.toString());
				i++;
			}
		}
		
	}
	
	/**
	 * Fait choisir les cartes � sacrifier
	 * @param croyants
	 * 		liste des croyants pouvant �tre sacrifi�s
	 * @param guides
	 * 		liste des guides spirituels pouvant �tre sacrifi�s
	 * @param p
	 * 		instance de la partie
	 */
	public void choisirCarteASacrifier(ArrayList<Croyant> croyants, ArrayList<GuideSpirituel> guides, Partie p){
		String rep = "";
		boolean sacrifier = false;
		boolean continuer = true;
		System.out.println("Voulez-vous sacrifier une/des carte(s) ? o/n");

		while(continuer == true){
			rep = Partie.scanner.nextLine();
			
			if (rep.equals("o")) {
				sacrifier = true;
				continuer = false;
			}else if (rep.equals("n")) {
				sacrifier = false;
				continuer = false;
			}else{
				continuer = true;
			}
		}
		
		int i = 2;
		ArrayList<Integer> indiceCarteASacrifier = new ArrayList<Integer>();
		ArrayList<Carte> carteASacrifier = new ArrayList<Carte>();
		ArrayList<Carte> carteCroyantGuide = new ArrayList<Carte>();
		carteCroyantGuide.addAll(croyants);
		carteCroyantGuide.addAll(guides);
		if (carteCroyantGuide.isEmpty()) {
			sacrifier = false;
			System.out.println("Il n'y a aucune carte a sacrifier.");
		}else{
			afficherCartes(carteCroyantGuide);
		}
		
		while (sacrifier == true) {
			System.out.println("Entrez le num�ro de la carte � sacrifier : ");
			i = Partie.scanner.nextInt();
			if ((i <= main.size()-1 && i >= 0)) {
				if(indiceCarteASacrifier.contains(i)){
					System.out.println("Ce num�ro ne correspond pas.");
				}else{
					indiceCarteASacrifier.add(i);
					carteASacrifier.add(main.get(i));
				}
			}else{
				System.out.println("Ce num�ro ne correspond pas.");
			}

			System.out.println("Continuer ? o/n");
			rep = Partie.scanner.next();
			if (rep.equals("n") ) {
				sacrifier = false;
			}
		}
		for (Carte carte : carteASacrifier) {
			carte.utiliserCapacite();
			if (carte.getTypeCarte()==TypeCarte.guideSpirituel) {
				guideRattaches.remove(carte);
			}else if (carte.getTypeCarte()== TypeCarte.croyant) {
				for (GuideSpirituel guide : guideRattaches) {
					for (Carte croyant : guide.getCroyantRattaches()) {
						if (croyant == carte) {
							guide.getCroyantRattaches().remove(croyant);
						}
					}
				}
			}
			p.ajouterADefausse(carte);
			
		}
	}

	/**
	 * appelle les m�thode pour un tour de jeu du joueur
	 * @param partie
	 * 		instance de la partie
	 */
	public void tourDeJeu(Partie partie){
		getDivinite().afficherDivinite();
		afficherMain();
		choisirCarteADefausser(partie);
		completerMain(partie.getCartes());
		afficherMain();
		ArrayList<Carte> cartePossible = lancerDe();
		ArrayList<Carte> carteAJouer = choisirCarteAJouer(cartePossible);
		jouerCarte(carteAJouer, partie);
		System.out.println("jeu a la fin du tour :");
		afficherMain();
		choisirCarteASacrifier(getCroyantRattaches(), getGuideRattaches(), partie);
		afficherPointPriere();
	}
	
	/**
	 * affiche les points de pri�res du joueur
	 */
	public void afficherPointPriere(){
		System.out.println("Vous avez " + calculerScore() + " point(s) de pri�re(s).");
	}
	
	public String getNom() {
		return nom;
	}

	public int getPointActionJour() {
		return pointActionJour;
	}

	public int getPointActionNuit() {
		return pointActionNuit;
	}

	public int getPointActionNeant() {
		return pointActionNeant;
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

	public ArrayList<Croyant> getCroyantRattaches() {
		return croyantRattaches;
	}

	public ArrayList<GuideSpirituel> getGuideRattaches() {
		return guideRattaches;
	}

}
