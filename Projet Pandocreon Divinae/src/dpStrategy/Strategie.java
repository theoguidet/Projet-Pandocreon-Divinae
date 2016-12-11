package dpStrategy;

import java.util.ArrayList;

import propriete.Origine;
import carte.Carte;
import carte.croyants.Croyant;
import carte.guideSpirituel.GuideSpirituel;

public class Strategie implements Strategy{

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
