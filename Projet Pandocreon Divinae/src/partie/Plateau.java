package partie;


import java.util.ArrayList;

import carte.Carte;

public class Plateau {
	
	private ArrayList<Carte> croyantLibre;
	public static Plateau instance;
	
	private Plateau(){
		this.croyantLibre = new ArrayList<Carte>();
	}
	
	public static Plateau getInstance(){
		if (instance == null) {
			instance = new Plateau();
		}
		return instance;
	}
	
	public ArrayList<Carte> getCroyantLibre() {
		return croyantLibre;
	}

	public void poserCroyantLibre(Carte c) {
		this.croyantLibre.add(c);
	}
}
