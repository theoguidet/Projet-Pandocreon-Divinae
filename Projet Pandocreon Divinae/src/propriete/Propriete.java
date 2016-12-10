package propriete;

import java.util.ArrayList;

public class Propriete {
	private ArrayList<Dogme> dogmes;
	private Origine origine;
	
	public Propriete(Dogme d1, Dogme d2, Dogme d3, Origine o) {
		origine = o;
		this.dogmes = new ArrayList<Dogme>();
		dogmes.add(d1);
		dogmes.add(d2);
		dogmes.add(d3);
	}
	
	public Propriete(Dogme d1, Dogme d2, Origine o) {
		origine = o;
		this.dogmes = new ArrayList<Dogme>();
		dogmes.add(d1);
		dogmes.add(d2);
		
	}
	
	public Propriete(Origine o) {
		origine = o;
		dogmes = null;
	}

	public Propriete() {
		origine = null;
		dogmes = null;
	}
	
	public ArrayList<Dogme> getDogmes() {
		return dogmes;
	}

	public void setDogmes(ArrayList<Dogme> dogmes) {
		this.dogmes = dogmes;
	}

	public void setOrigine(Origine origine) {
		this.origine = origine;
	}	
	
	public Origine getOrigine(){
		return this.origine;
	}	
}