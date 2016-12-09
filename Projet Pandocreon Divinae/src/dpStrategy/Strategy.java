package dpStrategy;

import java.util.ArrayList;

import propriete.Origine;
import carte.Carte;

public interface Strategy {
	public ArrayList<Carte> choixCarteAJouer(ArrayList<Carte> main, int PAJour,int PANuit, int PANeant);
}
