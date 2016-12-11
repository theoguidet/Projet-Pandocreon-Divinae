package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class InfluenceNulle extends DeusEx{

	public InfluenceNulle(){
		this.nom = "Influence Nulle";
		this.capacite = "Annule la capacité spéciale d'une autre carte d'Action.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	public void utiliserCapacite(){
		
	}
}
