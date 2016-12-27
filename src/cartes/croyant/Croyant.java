package cartes.croyant;

import cartes.Carte;
import propriete.Propriete;
/**
 * Croyant h�rite de Carte
 * repr�sente un type de carte du jeu
 * @author Admin
 *
 */
public class Croyant extends Carte{
	protected int nbCroyants;
	
	/**
	 * Constructeur de la classe
	 */
	public Croyant(){
		super();
	}

	/**
	 * getter des propri�t�s de la carte
	 * @return les propri�t�s de la carte
	 */
	public Propriete getPropriete() {
		return propriete;
	}

	/**
	 * getter du nombre de croyants de la carte
	 * @return le nombre de croyants de la carte
	 */
	public int getNbCroyants() {
		return nbCroyants;
	}
	
}
