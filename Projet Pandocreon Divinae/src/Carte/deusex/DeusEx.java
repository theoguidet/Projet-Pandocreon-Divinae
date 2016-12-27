package Carte.deusex;
import Carte.Carte;
import Carte.TypeCarte;

/**
 * DeusEx hérite de Carte
 * représente un type de carte
 * @author Admin
 *
 */
public class DeusEx extends Carte{
	
	/**
	 * constructeur de la classe
	 */
	public DeusEx(){
		super();
		typeCarte = TypeCarte.deusEx;
	}
}
