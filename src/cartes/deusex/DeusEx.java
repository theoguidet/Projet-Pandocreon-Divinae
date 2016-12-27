package cartes.deusex;
import cartes.Carte;
import cartes.TypeCarte;

/**
 * DeusEx h�rite de Carte
 * repr�sente un type de carte
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
