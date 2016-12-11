package dpStrategy;

import java.util.ArrayList;

import propriete.Origine;
import carte.Carte;

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
}
