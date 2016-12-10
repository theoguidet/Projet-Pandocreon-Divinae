package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class Fourberie extends DeusEx{
	
	public Fourberie(){
		this.nom = "Fourberie";
		this.capacite = "Sacrifiez 2 cartes Croyants d'une autre Divinité. Les capacités spéciales ne sont pas jouées.";
		this.propriete = new Propriete(Origine.NUIT);
	}
	
	public void utiliserCapacite(){
		
	}
}
