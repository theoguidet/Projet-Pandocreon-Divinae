package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class OrdreCeleste extends DeusEx{

	public OrdreCeleste(){
		this.nom = "Ordre Celeste";
		this.capacite = "Vous récupérez un des Guides Spirituels posés devant une autre Divinité et le placez devant vous avec les Croyants qui y sont attachés.";
		this.propriete = new Propriete("JOUR");
	}
	
	public void utiliserCapacite(){
		
	}
}
