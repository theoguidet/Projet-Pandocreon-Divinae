package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class OrdreCeleste extends DeusEx{

	public OrdreCeleste(){
		this.nom = "Ordre Celeste";
		this.capacite = "Vous r�cup�rez un des Guides Spirituels pos�s devant une autre Divinit� et le placez devant vous avec les Croyants qui y sont attach�s.";
		this.propriete = new Propriete("JOUR");
	}
	
	public void utiliserCapacite(){
		
	}
}
