package carte.croyants;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

public class Nihillistes extends Croyant{
	

	
	public Nihillistes (){
		super();
		this.nom = "Nihillistes";
		this.capacite = "Jusqu'� la fin du tour, plus aucune Divinit� ne re�oit de points d'Action."; 
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.SYMBOLES, Dogme.MYSTIQUE, Dogme.CHAOS,Origine.NEANT);
		this.typeCarte = typeCarte.croyant;
	}
	
	public void sacrifice(){
		
	}
}