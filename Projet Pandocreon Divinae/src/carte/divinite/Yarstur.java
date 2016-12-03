package carte.divinite;

import carte.Carte;
import carte.TypeCarte;

public class Yarstur extends Carte{
	
	public static Yarstur instance;
	
	private Yarstur(){
		this.nom = "Yarstur";
		this.capacite = "Peut d�truire toutes les cartes de Croyants au centre de la table d'Origine N�ant.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public Yarstur getInstance(){
		if (instance == null) {
			instance = new Yarstur();
		}
		return instance;
	}

}
