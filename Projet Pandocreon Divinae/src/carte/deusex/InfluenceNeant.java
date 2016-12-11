package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class InfluenceNeant extends DeusEx{
	
	public InfluenceNeant(){
		this.nom = "Influence Neant";
		this.capacite = "Annule la capacité spéciale d'une carte d'Action d'Origine Jour ou Nuit.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	public void utiliserCapacite(){
		
	}
}
