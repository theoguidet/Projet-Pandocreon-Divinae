package dpStrategy;

import java.util.ArrayList;

import carte.Carte;

public class StrategyContext {
	private Strategy strategy;
	
	public void setStrategie(Strategy strategy){
		this.strategy = strategy;
	}
	
	public Strategy getStragtegy(){
		return strategy;
	}
	
	public void choixCarte(ArrayList<Carte> main){
		strategy.choixCarteAJouer(main);
	}
}
