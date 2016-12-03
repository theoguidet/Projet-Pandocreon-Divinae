package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Romtec extends Carte{
	public static Romtec instance;
	private Propriete propriete;

	private Romtec(){
		this.nom = "Romtec";
		this.capacite = "Peut empêcher un jour de créer un Guide Spirituel. La carte est défaussée.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.NATURE, Dogme.HUMAIN, Dogme.CHAOS, Origine.CREPUSCULE);
		this.propriete = p; 
	}
	
	public Romtec getInstance(){
		if (instance == null) {
			instance = new Romtec();
		}
		return instance;
	}

}
