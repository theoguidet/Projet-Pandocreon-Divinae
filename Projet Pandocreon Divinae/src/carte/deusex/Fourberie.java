package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class Fourberie extends DeusEx{
	
	public Fourberie(){
		this.nom = "Fourberie";
		this.capacite = "Sacrifiez 2 cartes Croyants d'une autre Divinit�. Les capacit�s sp�ciales ne sont pas jou�es.";
		this.propriete = new Propriete(Origine.NUIT);
	}
	
	public void utiliserCapacite(){
		
	}
}
