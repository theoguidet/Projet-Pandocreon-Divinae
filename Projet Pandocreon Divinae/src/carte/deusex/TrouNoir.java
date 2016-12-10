package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class TrouNoir extends DeusEx{
	
	public TrouNoir(){
		this.nom = "Trou Noir";
		this.capacite = "Aucun autre joueur ne gagne de points d'Action durant ce tour.";
		this.propriete = new Propriete(Origine.NEANT);
	}

	public void utiliserCapacite(){

	}
}
