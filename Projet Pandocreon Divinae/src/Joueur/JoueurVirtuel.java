package Joueur;

import java.util.ArrayList;

import carte.Carte;
import carte.TypeCarte;
import carte.croyants.Croyant;
import carte.guideSpirituel.GuideSpirituel;
import partie.Partie;
import partie.Plateau;
import dpStrategy.Strategie;
import dpStrategy.StrategyContext;

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
		ArrayList<Carte> cartesAJouer = context.choixCarte(main, pointActionJour, pointActionNuit, pointActionNeant);
		jouerCarte(cartesAJouer, p);
		
		afficherCarteJouer(cartesAJouer);
		for (Carte carte : cartesAJouer) {
			main.remove(carte);
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
		ArrayList<Carte> cartesADefausser = context.choixCarteDefausse(main, pointActionJour, pointActionNuit, pointActionNeant);
		afficherCarteDefausser(cartesADefausser);
		for (Carte carte : cartesADefausser) {
			p.ajouterADefausse(carte);
			main.remove(carte);
		}
	}

	/**
	 * choisi les cartes � sacrifier 
	 * @param p
	 * 		instance de la partie
	 */
	public void choisirCarteASacrifier(Partie p){
		StrategyContext context = new StrategyContext();
		context.setStrategie(new Strategie());
		ArrayList<Carte> cartesASacrifier = context.choixCarteDefausse(main, pointActionJour, pointActionNuit, pointActionNeant);
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
			System.out.println(nom + " n'a pas jou� de cartes : ");
		}else{
			int i = 0;
			System.out.println(nom + " a jou� ces cartes : ");
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
			System.out.println(nom + " n'a pas sacrifi� de cartes : ");
		}else{
			int i = 0;
			System.out.println(nom + " a sacrifi� ces cartes : ");
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
			System.out.println(nom + " n'a pas d�fauss� de cartes : ");
		}else{
			int i = 0;
			System.out.println(nom + " a d�fauss� ces cartes : ");
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
		System.out.println(nom +" a " + calculerScore() + " point(s) de pri�re(s).");
	}

}