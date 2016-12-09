package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Clerc extends GuideSpirituel{
	
	public Clerc(String d1, String d2, String o){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Ascete";
		this.capacite = "Fait gagner un nombre de points d'Action égal au nombre de cartes de Croyants rattachées. L'Origine des points d'Action est au choix du joueur.";
		this.nbCroyants= 2;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
