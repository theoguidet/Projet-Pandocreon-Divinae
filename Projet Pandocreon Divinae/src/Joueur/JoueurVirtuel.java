package Joueur;

import dpStrategy.Strategie;
import dpStrategy.StrategyContext;

public class JoueurVirtuel extends Joueur{
	
	public JoueurVirtuel(String nom){
		super(nom);
	}
	
	public void jouerUneCarte(){
		StrategyContext context = new StrategyContext();
		context.setStrategie(new Strategie());
		context.choixCarte(main);
	}
}
