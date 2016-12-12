package dpStrategy;

import java.util.ArrayList;

import propriete.Origine;
import carte.Carte;
import carte.guideSpirituel.GuideSpirituel;

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
	 * récupère la strategie
	 * @return
	 */
	public Strategy getStragtegy(){
		return strategy;
	}
	
	/**
	 * appelle la méthode choixCarteAJouer
	 * @param main
	 * 		cartes détenues par le joueur
	 * @param PAJour
	 * 		points d'actions d'origine Jour du joueur 
	 * @param PANuit
	 * 		points d'actions d'origine Nuit du joueur 
	 * @param PANeant
	 * 		points d'actions d'origine Néant du joueur 
	 * @return liste des cartes à jouer
	 * 
	 */
	public ArrayList<Carte> choixCarte(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant){
		ArrayList<Carte> c = strategy.choixCarteAJouer(main, PAJour, PANuit, PANeant);
		return c;
	}
	
	/**
	 * appelle la méthode choixCarteASacrifier
	 * @param guide
	 * 		guides spirituels détenus par le joueur
	 * @return liste des cartes à sacrifier
	 */
	public ArrayList<Carte> choixCarteSacrifice(ArrayList<GuideSpirituel> guide){
		ArrayList<Carte> c = strategy.choixCarteASacrifier(guide);
		return c;
	}
	
	/**
	 * appelle la méthode choixCarteADefausser
	 * @param main
	 * 		cartes détenues par le joueur
	 * @param PAJour
	 * 		points d'actions d'origine Jour du joueur 
	 * @param PANuit
	 * 		points d'actions d'origine Nuit du joueur 
	 * @param PANeant
	 * 		points d'actions d'origine Néant du joueur 
	 * @return liste des cartes à défausser
	 */
	public ArrayList<Carte> choixCarteDefausse(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant){
		ArrayList<Carte> c = strategy.choixCarteADefausser(main, PAJour, PANuit, PANeant);
		return c;
	}
}
