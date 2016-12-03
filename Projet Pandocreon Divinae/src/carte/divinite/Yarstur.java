package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Yarstur extends Carte{
	
	public static Yarstur instance;
	private Propriete propriete;
	
	private Yarstur(){
		this.nom = "Yarstur";
		this.capacite = "Peut d�truire toutes les cartes de Croyants au centre de la table d'Origine N�ant.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.CHAOS, Dogme.SYMBOLES, Dogme.MYSTIQUE, Origine.JOUR);
		this.propriete = p; 
	}
	
	public Yarstur getInstance(){
		if (instance == null) {
			instance = new Yarstur();
		}
		return instance;
	}

}
