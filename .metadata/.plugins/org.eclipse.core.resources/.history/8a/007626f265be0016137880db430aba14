package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Yarstur extends Divinite{
	
	public static Yarstur instance;
	private Propriete propriete;
	
	private Yarstur(){
		this.nom = "Yarstur";
		this.capacite = "Peut détruire toutes les cartes de Croyants au centre de la table d'Origine Néant.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete("CHAOS", "SYMBOLES", "MYSTIQUE", "JOUR");
		this.propriete = p; 
	}
	
	public static Yarstur getInstance(){
		if (instance == null) {
			instance = new Yarstur();
		}
		return instance;
	}

}
