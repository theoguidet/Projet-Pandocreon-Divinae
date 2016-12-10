package dpStrategy;

import java.util.ArrayList;

import propriete.Origine;
import carte.Carte;

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
}