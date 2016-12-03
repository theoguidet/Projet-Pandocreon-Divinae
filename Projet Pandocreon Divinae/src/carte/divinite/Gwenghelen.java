package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Gwenghelen extends Carte{
	
	public static Gwenghelen instance;
	private Propriete propriete;
	
	private Gwenghelen(){
		this.nom = "Gwenghelen";
		this.capacite = "R�cup�re autant de points d'Action suppl�mentaires d'Origine N�ant que le nombre de Guides Spirituels que la Divinit� poss�de.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.HUMAIN, Dogme.SYMBOLES, Dogme.MYSTIQUE, Origine.AUBE);
		this.propriete = p; 
	}
	
	public Gwenghelen getInstance(){
		if (instance == null) {
			instance = new Gwenghelen();
		}
		return instance;
	}

}
