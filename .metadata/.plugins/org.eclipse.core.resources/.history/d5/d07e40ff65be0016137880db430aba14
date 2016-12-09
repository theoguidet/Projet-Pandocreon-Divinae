package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Gorpa extends Divinite{
public static Gorpa instance;
private Propriete propriete;
	
	private Gorpa(){
		this.nom = "Gorpa";
		this.capacite = "Peut récupérer les points d'Action d'une autre Divinité en plus des siens. L'autre Divinité ne reçoit aucun point d'Action ce tour-ci.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete("HUMAIN", "SYMBOLES", "CHAOS", "CREPUSCULE");
		this.propriete = p; 
	}
	
	public static Gorpa getInstance(){
		if (instance == null) {
			instance = new Gorpa();
		}
		return instance;
	}

}
