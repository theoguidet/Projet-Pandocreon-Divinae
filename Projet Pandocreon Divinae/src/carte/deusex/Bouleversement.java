package carte.deusex;

import propriete.Origine;
import propriete.Propriete;

public class Bouleversement extends DeusEx{

	public Bouleversement(){
		this.nom = "Bouleversement";
		this.capacite = "Relancez le dé de Cosmogonie. Le tour de jeu se terminera normalement, mais sous la nouvelle influence.";
		this.propriete = new Propriete(Origine.NULL);
	}
	
	public void utiliserCapacite(){
		
	}
}
