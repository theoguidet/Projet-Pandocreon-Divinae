package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class ColereDivine extends DeusEx{

	public ColereDivine(String o){
		this.nom = "ColereDivine";
		this.capacite = "Détruit une carte Guide Spirituel d'Origine Nuit ou Néant, dont la capacité spéciale n'a pas effet. Les Croyants attachés reviennent au centre de la table.";
		this.propriete = new Propriete(o);
	}
	
	public void utiliserCapacite(){
		
	}
}
