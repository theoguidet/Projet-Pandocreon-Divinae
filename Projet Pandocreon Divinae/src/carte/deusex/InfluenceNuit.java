package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class InfluenceNuit extends DeusEx{

	public InfluenceNuit(){
		this.nom = "Influence Nuit";
		this.capacite = "Annule la capacit� sp�ciale d'une carte d'Action d'Origine Jour ou N�ant.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	public void utiliserCapacite(){
		
	}
}
