package partie;


import java.util.ArrayList;

import carte.Carte;
import carte.croyants.Croyant;

public class Plateau {
	
	private ArrayList<Croyant> croyantLibre;
	public static Plateau instance;
	
	private Plateau(){
		this.croyantLibre = new ArrayList<Croyant>();
	}
	
	public static Plateau getInstance(){
		if (instance == null) {
			instance = new Plateau();
		}
		return instance;
	}
	
	public ArrayList<Croyant> getCroyantLibre() {
		return croyantLibre;
	}

	public void poserCroyantLibre(Croyant c) {
		this.croyantLibre.add(c);
	}
}
