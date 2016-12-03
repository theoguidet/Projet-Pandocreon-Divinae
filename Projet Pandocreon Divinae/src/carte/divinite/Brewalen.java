package carte.divinite;

import carte.Carte;
import carte.TypeCarte;

public class Brewalen extends Carte{
	
	public static Brewalen instance;
	
	private Brewalen(){
		this.nom = "Brewalen";
		this.capacite = "Peut emp�cher l'utilisation d'une carte Apocalypse. La carte est d�fauss�e.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public Brewalen getInstance(){
		if (instance == null) {
			instance = new Brewalen();
		}
		return instance;
	}

}
