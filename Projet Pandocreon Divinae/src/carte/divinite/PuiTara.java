package carte.divinite;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class PuiTara extends Divinite{
	
	public static PuiTara instance;
	
	private PuiTara(){
		this.nom = "Pui-Tara";
		this.capacite = "Peut détruire toutes les cartes de Croyants au centre de la table d'Origine Jour.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
		Propriete p = new Propriete(Dogme.NATURE,Dogme.SYMBOLES, Dogme.MYSTIQUE,Origine.NUIT);
		this.propriete = p; 
	}
	
	public static PuiTara getInstance(){
		if (instance == null) {
			instance = new PuiTara();
		}
		return instance;
	}

}
