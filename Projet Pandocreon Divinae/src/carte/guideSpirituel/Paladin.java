package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Paladin extends Carte{
	
	private int nbCroyants;
	private Propriete propriete;
	
	public Paladin(){
		super();
		this.nbCroyants= nbCroyants;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.MYSTIQUE, Origine.JOUR);
		this.nom = "Paladin";
		this.capacite = "Tous les Croyants, d'Origine Nuit ou N�ant et ayant le Dogme Nature, actuellement sur la table sont d�fauss�s.Les capacit�s sp�ciales ne sont pas jou�es.";
		this.nbCroyants = 3;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
