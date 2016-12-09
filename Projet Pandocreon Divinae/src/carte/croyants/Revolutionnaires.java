package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Revolutionnaires extends Croyant{
	

	
	public Revolutionnaires (){
		super();
		this.nom = "R�volutionnaires";
		this.capacite = "Imposez le sacrifice d'une carte de Croyants � autant de Divinit�s que vous le voulez. Chaque Divinit� choisit la carte � sacrifier. Les capacit�s sp�ciales sont jou�es";
		this.nbCroyants= 2;
		this.propriete = new Propriete("SYMBOLES", "HUMAIN", "CHAOS", "NEANT");
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}