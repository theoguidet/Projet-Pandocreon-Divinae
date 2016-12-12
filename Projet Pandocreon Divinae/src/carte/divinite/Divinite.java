package carte.divinite;

import carte.Carte;

/**
 * Divinite hérite de Carte
 * représente un type de carte
 * @author Admin
 *
 */
public class Divinite extends Carte{

	/**
	 * constructeur de la classe
	 */
	public Divinite(){
		super();
	}
	
	/**
	 * méthode de formatage de l'affichage de la divinité du joueur
	 * avec le nom, l'origine et la capacité
	 */
	public void afficherDivinite(){
		System.out.println("Vous êtes :");
		System.out.println(nom + " d'origine " + this.getPropriete().getOrigine());
		System.out.println("Vous avez la capacité : " + getCapacite());
	}
}
