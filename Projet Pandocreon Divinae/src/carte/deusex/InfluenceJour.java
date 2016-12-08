package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class InfluenceJour extends DeusEx{
	
	public InfluenceJour(){
		this.nom = "Influence Jour";
		this.capacite = "Annule la capacité spéciale d'une carte d'Action d'Origine Nuit ou Néant.";
		this.propriete = new Propriete();
	}
	
	public void utiliserCapacite(){
		
	}

}
