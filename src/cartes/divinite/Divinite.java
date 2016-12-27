package cartes.divinite;

import cartes.Carte;

/**
 * Divinite h�rite de Carte
 * repr�sente un type de carte
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
	 * m�thode de formatage de l'affichage de la divinit� du joueur
	 * avec le nom, l'origine et la capacit�
	 */
	public void afficherDivinite(){
		System.out.println("Vous �tes :");
		System.out.println(nom + " d'origine " + this.getPropriete().getOrigine());
		System.out.println("Vous avez la capacit� : " + getCapacite());
	}
}
