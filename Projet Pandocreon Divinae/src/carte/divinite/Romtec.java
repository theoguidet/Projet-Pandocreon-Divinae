package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Romtec extends Divinite{
	public static Romtec instance;
	private Propriete propriete;

	private Romtec(){
		this.nom = "Romtec";
		this.capacite = "Peut emp�cher un jour de cr�er un Guide Spirituel. La carte est d�fauss�e.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete("NATURE", "HUMAIN", "CHAOS", "CREPUSCULE");
		this.propriete = p; 
	}
	
	public static Romtec getInstance(){
		if (instance == null) {
			instance = new Romtec();
		}
		return instance;
	}

}
