package dpStrategy;

import java.util.ArrayList;

import propriete.Origine;
import Carte.Carte;
import Carte.guideSpirituel.GuideSpirituel;

/**
 * interface Strategy implémentée pour le design pattern Strategy
 * @author Admin
 *
 */
public interface Strategy {
	public ArrayList<Carte> choixCarteAJouer(ArrayList<Carte> main, int PAJour,int PANuit, int PANeant);
	public ArrayList<Carte> choixCarteADefausser(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant);
	public ArrayList<Carte> choixCarteASacrifier(ArrayList<GuideSpirituel> guide);
}
