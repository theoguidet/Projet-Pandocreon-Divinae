package carte.divinite;

import carte.Carte;
import carte.TypeCarte;

public class Gorpa extends Carte{
public static Gorpa instance;
	
	private Gorpa(){
		this.nom = "Gorpa";
		this.capacite = "Peut r�cup�rer les points d'Action d'une autre Divinit� en plus des siens. L'autre Divinit� ne re�oit aucun point d'Action ce tour-ci.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public Gorpa getInstance(){
		if (instance == null) {
			instance = new Gorpa();
		}
		return instance;
	}

}