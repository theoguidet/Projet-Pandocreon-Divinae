package Joueur;

import java.util.ArrayList;
import java.util.Scanner;

import carte.Carte;
import carte.TypeCarte;
import carte.croyants.Croyant;
import carte.guideSpirituel.GuideSpirituel;
import partie.Partie;
import partie.Plateau;
import propriete.Origine;
import dpStrategy.Strategie;
import dpStrategy.StrategyContext;

public class JoueurVirtuel extends Joueur{
	
	public JoueurVirtuel(String nom){
		super(nom);
	}
	
	public void jouerUneCarte(Carte c, Partie partie){
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
	
	public ArrayList<Carte> choisirCarte(){
		StrategyContext context = new StrategyContext();
		context.setStrategie(new Strategie());
		ArrayList<Carte> cartesAJouer = context.choixCarte(main, pointActionJour, pointActionNuit, pointActionNeant);
		return cartesAJouer;
	}

	public void jouerCarte(Partie partie){
		StrategyContext context = new StrategyContext();
		context.setStrategie(new Strategie());
		ArrayList<Carte> cartesAJouer = context.choixCarte(main, pointActionJour, pointActionNuit, pointActionNeant);
		for (Carte carte : cartesAJouer) {
			jouerUneCarte(carte, partie);
		}
	}
}
