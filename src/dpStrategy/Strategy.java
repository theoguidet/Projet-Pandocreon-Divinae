package dpStrategy;

import java.util.ArrayList;

import cartes.Carte;
import cartes.guideSpirituel.GuideSpirituel;

/**
 * interface Strategy impl�ment�e pour le design pattern Strategy
 * @author Admin
 *
 */
public interface Strategy {
	public ArrayList<Carte> choixCarteAJouer(ArrayList<Carte> main, int PAJour,int PANuit, int PANeant);
	public ArrayList<Carte> choixCarteADefausser(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant);
	public ArrayList<Carte> choixCarteASacrifier(ArrayList<GuideSpirituel> guide);
}
