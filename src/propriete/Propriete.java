package propriete;

import java.util.ArrayList;

/**
 * représente la réunion de dogmes et d'uneorigine
 * @author Admin
 *
 */
public class Propriete {
	private ArrayList<Dogme> dogmes;
	private Origine origine;
	
	/**
	 * premier constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 * @param o
	 * 		origine
	 */
	public Propriete(Dogme d1, Dogme d2, Dogme d3, Origine o) {
		origine = o;
		this.dogmes = new ArrayList<Dogme>();
		dogmes.add(d1);
		dogmes.add(d2);
		dogmes.add(d3);
	}
	
	/**
	 * deuxieme constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param o
	 * 		origine
	 */
	public Propriete(Dogme d1, Dogme d2, Origine o) {
		origine = o;
		this.dogmes = new ArrayList<Dogme>();
		dogmes.add(d1);
		dogmes.add(d2);
		
	}
	
	/**
	 * troisieme constructeur de la classe
	 * @param o
	 * 		origine
	 */
	public Propriete(Origine o) {
		origine = o;
		dogmes = null;
	}

	/**
	 * quatrieme constructeur de la classe
	 */
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