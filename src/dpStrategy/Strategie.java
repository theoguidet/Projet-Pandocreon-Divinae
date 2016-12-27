package dpStrategy;

import java.util.ArrayList;

import cartes.Carte;
import cartes.guideSpirituel.GuideSpirituel;
import propriete.Origine;

/**
 * Strategie implemente l'interface Strategy 
 * repr�sente une strat�gie pour les joueurs virtuels
 * @author Admin
 *
 */
public class Strategie implements Strategy{

	/**
	 * m�thode qui choisi quelles cartes jouer 
	 * @param main
	 * 		cartes d�tenues par le joueur
	 * @param PAJour
	 * 		points d'actions d'origine Jour du joueur 
	 * @param PANuit
	 * 		points d'actions d'origine Nuit du joueur 
	 * @param PANeant
	 * 		points d'actions d'origine N�ant du joueur 
	 */
	@Override
	public ArrayList<Carte> choixCarteAJouer(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant) {
		ArrayList<Carte> carteAJouer = new ArrayList<Carte>();
		for (Carte carte : main) {
			if (PAJour > 0 && carte.getPropriete().getOrigine() == Origine.JOUR) {
				carteAJouer.add(carte);
				PAJour--;
			}
			if (PANuit > 0 && carte.getPropriete().getOrigine() == Origine.NUIT) {
				carteAJouer.add(carte);
				PANuit--;
			}
			if (PANeant > 0 && carte.getPropriete().getOrigine() == Origine.NEANT) {
				carteAJouer.add(carte);
				PANeant--;
			}
			if (carte.getPropriete().getOrigine() == null) {
				carteAJouer.add(carte);
			}
		}
		return carteAJouer;
	}

	/**
	 * m�thode qui choisi quelles cartes d�fausser
	 * @param main
	 * 		cartes d�tenues par le joueur
	 * @param PAJour
	 * 		points d'actions d'origine Jour du joueur 
	 * @param PANuit
	 * 		points d'actions d'origine Nuit du joueur 
	 * @param PANeant
	 * 		points d'actions d'origine N�ant du joueur 
	 */
	public ArrayList<Carte> choixCarteADefausser(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant){
		ArrayList<Carte> carteADefausser = new ArrayList<Carte>();
		for (Carte carte : main) {
			if (PAJour == 0 && carte.getPropriete().getOrigine() == Origine.JOUR) {
				carteADefausser.add(carte);
			}
			if (PANuit == 0 && carte.getPropriete().getOrigine() == Origine.NUIT) {
				carteADefausser.add(carte);
			}
			if (PANeant == 0 && carte.getPropriete().getOrigine() == Origine.NEANT) {
				carteADefausser.add(carte);
			}
		}
		return carteADefausser;
	}

	/**
	 * m�thode qui choisi quelles cartes sacrifier
	 * ne sacrifie que des guides spirituels
	 * @param guide
	 * 		guides spirituels pos�s sur la table par le joueur
	 */
	public ArrayList<Carte> choixCarteASacrifier(ArrayList<GuideSpirituel> guide){
		ArrayList<Carte> carteASacrifier = new ArrayList<Carte>();
		for (GuideSpirituel g : guide) {
			if(g.getNbCarteCroyantRattaches() == 0){
				carteASacrifier.add(g);
			}
		}
		return carteASacrifier;
	}
}
