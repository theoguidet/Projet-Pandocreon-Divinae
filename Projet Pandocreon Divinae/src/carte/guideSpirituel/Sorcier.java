package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Sorcier extends GuideSpirituel{
	
	public Sorcier(Dogme d1, Dogme d2, Origine o){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Sorcier";
		this.capacite = "Echangez l'un de vos Guides Spirituels avec un d'une autre Divinit�. Vous choisissez les deux guides Spirituels en question. Les Croyants restent attach�s aux m�mes cartes.";
		this.nbCroyants = 3;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
