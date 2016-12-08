package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class Stase extends DeusEx{

	public Stase(){
		this.nom = "Stase";
		this.capacite = "Protège un Guide Spirituel et ses Croyants jusqu'à ce que cette carte soit annulée ou jusqu'à la prochaine tentative d'Apocalypse.";
		this.propriete = new Propriete(Origine.JOUR);
	}

	public void utiliserCapacite(){

	}
}
