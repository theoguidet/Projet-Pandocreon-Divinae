package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class Miroir extends DeusEx{
	
	public Miroir(){
		this.nom = "Miroir";
		this.capacite = "Retourne les effets d'une carte d'Action sur la Divinit� qui l'a pos�e.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	public void utiliserCapacite(){
		
	}
}
