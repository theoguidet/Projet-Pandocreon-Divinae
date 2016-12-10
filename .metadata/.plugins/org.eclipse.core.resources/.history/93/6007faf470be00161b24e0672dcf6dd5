package propriete;

import java.util.ArrayList;

public class Dogme {

	public static Dogme instance;
	private ArrayList<String> dogmes;
	private String nature = "Nature";
	private String humain = "Humain";
	private String symboles = "Symboles";
	private String mystique = "Mystique";
	private String chaos = "Chaos";	
	private String nom;
	
	private Dogme (){
		this.dogmes = new ArrayList<String>();
		dogmes.add("Nature");
		dogmes.add("Humain");
		dogmes.add("Symboles");
		dogmes.add("Mystique");
		dogmes.add("Chaos");
	}
	
	public static Dogme getInstance(){
		if (instance == null) {
			instance = new Dogme();
		}
		return instance;
	}
	
	public String toString(){
		return nom;
	}
}
