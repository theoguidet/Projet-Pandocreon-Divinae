package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Martyr extends Carte{
	
	private int nbCroyants;
	private Propriete propriete;
	
	public Martyr(Dogme d1, Dogme d2, Origine o){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Martyr";
		this.capacite = "Equivalent à la pose d'une carte Apocalypse.";
		this.nbCroyants= 2;
	}
	
	public void attacherCroyant(){
		
	}
	
	public void utiliserCapacite(){
		
	}

}
