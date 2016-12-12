package partie;


import java.util.ArrayList;

import carte.Carte;
import carte.croyants.Croyant;

/**
 * singleton qui représente le plateau de jeu 
 * @author Admin
 *
 */
public class Plateau {
	
	private ArrayList<Croyant> croyantLibre;
	public static Plateau instance;
	
	/**
	 * constructeur privé de la classe
	 */
	private Plateau(){
		this.croyantLibre = new ArrayList<Croyant>();
	}
	
	/**
	 * méthode d'instanciation statique de la classe
	 * @return l'instance de la classe
	 */
	public static Plateau getInstance(){
		if (instance == null) {
			instance = new Plateau();
		}
		return instance;
	}
	
	public ArrayList<Croyant> getCroyantLibre() {
		return croyantLibre;
	}

	/**
	 * ajoute un croyant au milieu de la table, visible par tous les joueurs
	 * @param c
	 * 		croyant posé sur la table
	 */
	public void poserCroyantLibre(Croyant c) {
		this.croyantLibre.add(c);
	}
}
