package dpStrategy;

import java.util.ArrayList;

import Carte.Carte;
import Carte.guideSpirituel.GuideSpirituel;

/**
 * StrategyContext fait le lien entre l'interface Strategy et la classe JoueurVirtuel
 * @author Admin
 *
 */
public class StrategyContext {
	private Strategy strategy;
	
	/**
	 * change de strategie
	 * @param strategy
	 */
	public void setStrategie(Strategy strategy){
		this.strategy = strategy;
	}
	
	/**
	 * r�cup�re la strategie
	 * @return
	 */
	public Strategy getStragtegy(){
		return strategy;
	}
	
	/**
	 * appelle la m�thode choixCarteAJouer
	 * @param main
	 * 		cartes d�tenues par le joueur
	 * @param PAJour
	 * 		points d'actions d'origine Jour du joueur 
	 * @param PANuit
	 * 		points d'actions d'origine Nuit du joueur 
	 * @param PANeant
	 * 		points d'actions d'origine N�ant du joueur 
	 * @return liste des cartes � jouer
	 * 
	 */
	public ArrayList<Carte> choixCarte(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant){
		ArrayList<Carte> c = strategy.choixCarteAJouer(main, PAJour, PANuit, PANeant);
		return c;
	}
	
	/**
	 * appelle la m�thode choixCarteASacrifier
	 * @param guide
	 * 		guides spirituels d�tenus par le joueur
	 * @return liste des cartes � sacrifier
	 */
	public ArrayList<Carte> choixCarteSacrifice(ArrayList<GuideSpirituel> guide){
		ArrayList<Carte> c = strategy.choixCarteASacrifier(guide);
		return c;
	}
	
	/**
	 * appelle la m�thode choixCarteADefausser
	 * @param main
	 * 		cartes d�tenues par le joueur
	 * @param PAJour
	 * 		points d'actions d'origine Jour du joueur 
	 * @param PANuit
	 * 		points d'actions d'origine Nuit du joueur 
	 * @param PANeant
	 * 		points d'actions d'origine N�ant du joueur 
	 * @return liste des cartes � d�fausser
	 */
	public ArrayList<Carte> choixCarteDefausse(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant){
		ArrayList<Carte> c = strategy.choixCarteADefausser(main, PAJour, PANuit, PANeant);
		return c;
	}
}
