package joueurs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

import cartes.Aleatoire;
import cartes.Carte;
import cartes.TypeCarte;
import cartes.guideSpirituel.GuideSpirituel;
import dpStrategy.Strategie;
import dpStrategy.StrategyContext;
import partie.Partie;
import propriete.Origine;

/**
 * JoueurVirtuel h�rite de Joueur
 * impl�mente les m�me actions que Joueur
 * @author Admin
 *
 */
public class JoueurVirtuel extends Joueur{

	/**
	 * constructeur de la classe
	 * @param nom
	 * 		nom du joueur virtuel
	 */
	public JoueurVirtuel(String nom){
		super(nom);
		this.estVirtuel = true;
		
	}

	/**
	 * choisi les cartes � jouer 
	 * @param p
	 * 		instance de la partie
	 */
	public void choisirCarteAJouer(Partie p){
		StrategyContext context = new StrategyContext();
		context.setStrategie(new Strategie());
		ArrayList<Carte> cartesAJouer = context.choixCarte(getMain(), getPointActionJour(), getPointActionNuit(), getPointActionNeant());
		jouerCarte(cartesAJouer, p);
		
		afficherCarteJouer(cartesAJouer);
		for (Carte carte : cartesAJouer) {
			getMain().remove(carte);
		}
		
	}

	/**
	 * choisi les cartes � d�fausser 
	 * @param p
	 * 		instance de la partie
	 */
	public void choisirCarteADefausser(Partie p){
		StrategyContext context = new StrategyContext();
		context.setStrategie(new Strategie());
		ArrayList<Carte> cartesADefausser = context.choixCarteDefausse(getMain(), getPointActionJour(), getPointActionNuit(), getPointActionNeant());
		afficherCarteDefausser(cartesADefausser);
		for (Carte carte : cartesADefausser) {
			p.ajouterADefausse(carte);
			getMain().remove(carte);
		}
	}
	/**
	 *  sacrifier GuideSpirituel Dans LaMain
	 */
	public void sacrifierGuideSpirituelDansLaMain(){
		ArrayList<Carte> cartes= this.getMain();
		int indice=0;
		while(cartes.get(indice).getTypeCarte()!=TypeCarte.guideSpirituel){
			indice++;
		}
		if(indice<this.getMain().size()){
			this.getMain().get(indice).utiliserCapacite();
			Partie.getUniquePartie().ajouterADefausse(cartes.get(indice));
			this.getMain().remove(indice);
		}
			
		
	}
	/**
	 * sacrifier Croyant
	 */
	public void sacrifierCroyant(){
		ArrayList<Carte> cartes= this.getMain();
		int indice=0;
		while(cartes.get(indice).getTypeCarte()!=TypeCarte.croyant){
			indice++;
		}
		if(indice<this.getMain().size()){
			this.getMain().get(indice).utiliserCapacite();
			Partie.getUniquePartie().ajouterADefausse(cartes.get(indice));
			this.getMain().remove(indice);
		}
	}
	/**
	 * Choisir carte Guide Spirituel � revenir dans la main
	 */
	public GuideSpirituel choisirGuideRevenir(){
		ArrayList<GuideSpirituel> guides= this.getGuideRattaches();
		
		Collections.shuffle(guides);
		
		return this.getGuideRattaches().get(0);
	}
	/**
	 * sacrifier GuideSpirituel Rattaches
	 */
	public void sacrifierGuideSpirituelRattaches(){
		ArrayList<GuideSpirituel> carteRattaches= this.getGuideRattaches();
			carteRattaches.get(0).utiliserCapacite();
			Partie.getUniquePartie().ajouterADefausse(carteRattaches.get(0));
			this.getMain().remove(0);
		}
	/**
	 * choisir le joueur � attaquer
	 */
	public Joueur choisirLeJoueurAAttaquer(){
		int indice;
		double k;
		k=Math.random();
		if(k<=0.25){
			indice=0;
		}else{
			indice=1;
		}
			return Partie.getUniquePartie().getJoueurs().get(indice);
	}	
	/**
	 * choisir carte victime
	 */
	public Carte choisirCarteVictime(TypeCarte type){
		
		try{
		int indice;	
		for(indice=0;indice<this.getMain().size(); indice++){
			if(this.getMain().get(indice).getTypeCarte()== type){
				break;
			}
			
		}
		return this.getMain().get(indice);
		}catch(NoSuchElementException e){
			e.printStackTrace();
			return null;
		}
	
		
		
		
	}
	/**
	 * choisir l'Origine de point d'Action � recevoir
	 */
	public int choisirOriginePointARecevoir(){
		return Aleatoire.rand(1, 3);
		
	}
	/**
	 * piocher Carte
	 * @param nbCartes
	 */
	public void piocherCarte(int nbCartes, Joueur joueurAAttaquer){
		
		int indice=0;
		int i=0;
		while(indice<=nbCartes){
			
			Carte carteVictime=joueurAAttaquer.getMain().get(i);
			this.getMain().add(carteVictime);
			joueurAAttaquer.getMain().remove(i);
			setChanged();
			notifyObservers(new EvenementJoueur(EvenementJoueurType.PIOCHER_CARTE, this, new Object[]{carteVictime, joueurAAttaquer}));
			indice++;
			i++;
		}
		
		
	}
	/**
	 * choisir face de d�
	 */
	public Origine choisirFaceDe(){
		int indice;
		Origine resultatDe;
		indice=Aleatoire.rand(1, 3);
		switch (indice) {
		case 1:
			resultatDe= Origine.JOUR;
			break;
		case 2:	
			resultatDe=Origine.NUIT;
			break;
		default:
			resultatDe=Origine.NEANT;
			break;
		}
		return resultatDe;
	}
	/**
	 * choisir carte
	 */
	public int choisirCarteAutreJoueur(){
		
		return 0;
		
	}
	/**
	 * choisi les cartes � sacrifier 
	 * @param p
	 * 		instance de la partie
	 */
	public void choisirCarteASacrifier(Partie p){
		StrategyContext context = new StrategyContext();
		context.setStrategie(new Strategie());
		ArrayList<Carte> cartesASacrifier = context.choixCarteDefausse(getMain(), getPointActionJour(), getPointActionNuit(), getPointActionNeant());
		afficherCarteSacrifier(cartesASacrifier);
		for (Carte carte : cartesASacrifier) {
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
	 * affiche les cartes jou�es par le joueur virtuel
	 * @param c
	 * 		liste des cartes jou�es
	 */
	public void afficherCarteJouer(ArrayList<Carte> c){
		if (c == null) {
			System.out.println(getNom() + " n'a pas jou� de cartes : ");
		}else{
			int i = 0;
			System.out.println(getNom() + " a jou� ces cartes : ");
			for (Carte carte : c) {
				System.out.println("[" + i + "] " + carte.toString());
				i++;
			}
		}
	}
	
	
	/**
	 * affiche les cartes sacrifi�es par le joueur virtuel
	 * @param c
	 * 		liste des cartes sacrifi�es
	 */
	public void afficherCarteSacrifier(ArrayList<Carte> c){
		if (c == null) {
			System.out.println(getNom() + " n'a pas sacrifi� de cartes : ");
		}else{
			int i = 0;
			System.out.println(getNom() + " a sacrifi� ces cartes : ");
			for (Carte carte : c) {
				System.out.println("[" + i + "] " + carte.toString());
				i++;
			}
		}
	}
	
	/**
	 * affiche les cartes d�fauss�es par le joueur virtuel
	 * @param c
	 * 		liste des cartes d�fauss�es
	 */
	public void afficherCarteDefausser(ArrayList<Carte> c){
		if (c == null) {
			System.out.println(this.getNom() + " n'a pas d�fauss� de cartes : ");
		}else{
			int i = 0;
			System.out.println(this.getNom() + " a d�fauss� ces cartes : ");
			for (Carte carte : c) {
				System.out.println("[" + i + "] " + carte.toString());
				i++;
			}
		}
	}
	
	/**
	 * appelle les m�thodes pour un tour de jeu du joueur virtuel
	 */
	public void tourDeJeu(Partie p){
		lancerDe();
		choisirCarteADefausser(p);
		completerMain(p.getCartes());
		choisirCarteAJouer(p);
		choisirCarteASacrifier(p);
		afficherPointPriere();
		
	}
	
	/**
	 * affiche les points de pri�res du joueur virtuel
	 */
	public void afficherPointPriere(){
		System.out.println(this.getNom() +" a " + calculerScore() + " point(s) de pri�re(s).");
	}

}