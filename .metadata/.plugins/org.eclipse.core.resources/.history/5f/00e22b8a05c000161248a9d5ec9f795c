package dpStrategy;

import java.util.ArrayList;

import propriete.Origine;
import carte.Carte;
import carte.guideSpirituel.GuideSpirituel;

public class StrategyContext {
	private Strategy strategy;
	
	public void setStrategie(Strategy strategy){
		this.strategy = strategy;
	}
	
	public Strategy getStragtegy(){
		return strategy;
	}
	
	public ArrayList<Carte> choixCarte(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant){
		ArrayList<Carte> c = strategy.choixCarteAJouer(main, PAJour, PANuit, PANeant);
		return c;
	}
	
	public ArrayList<Carte> choixCarteSacrifice(ArrayList<GuideSpirituel> guide){
		ArrayList<Carte> c = strategy.choixCarteASacrifier(guide);
		return c;
	}
	
	public ArrayList<Carte> choixCarteDefausse(ArrayList<Carte> main, int PAJour, int PANuit, int PANeant){
		ArrayList<Carte> c = strategy.choixCarteADefausser(main, PAJour, PANuit, PANeant);
		return c;
	}
}
