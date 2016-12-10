package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class Concentration extends DeusEx{

	public Concentration(){
		this.nom = "Concentration";
		this.capacite = "Vous récupérez un des Guides Spirituels posés devant une autre Divinité et le placez devant vous avec les Croyants qui y sont attachés.";
		this.propriete = new Propriete(Origine.NEANT);
	}
	
	public void utiliserCapacite(){
		
	}
}
