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

public class JoueurVirtuel extends Joueur{

	public JoueurVirtuel(String nom){
		super(nom);
		this.estVirtuel = true;
	}

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
	
	
	
	public void tourDeJeu(Partie p){
		lancerDe();
		choisirCarteADefausser(p);
		completerMain(p.getCartes());
		choisirCarteAJouer(p);
		choisirCarteASacrifier(p);
		afficherPointPriere();
		
	}
	
	public void afficherPointPriere(){
		System.out.println(nom +" a " + calculerScore() + " point(s) de pri�re(s).");
	}

}