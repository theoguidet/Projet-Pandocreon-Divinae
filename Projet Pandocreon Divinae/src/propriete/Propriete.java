package propriete;

import java.util.ArrayList;

public class Propriete {
	private ArrayList<String> dogmes;
	private String origine;
	
	public Propriete(String d1, String d2, String d3, String o) {
		origine = o;
		this.dogmes = new ArrayList<String>();
		dogmes.add(d1);
		dogmes.add(d2);
		dogmes.add(d3);
	}
	
	public Propriete(String d1, String d2, String o) {
		origine = o;
		this.dogmes = new ArrayList<String>();
		dogmes.add(d1);
		dogmes.add(d2);
		
	}
	
	public Propriete(String o) {
		origine = o;
		dogmes = null;
	}

	public Propriete() {
		origine = "";
		dogmes = null;
	}
	
	public ArrayList<String> getDogmes() {
		return dogmes;
	}

	public void setDogmes(ArrayList<String> dogmes) {
		this.dogmes = dogmes;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}	
	
	public String getOrigine(){
		return this.origine;
	}	
}