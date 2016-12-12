package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
	 * Paladin h�rite de GuideSpirituel
	 * repr�sente une carte du jeu 
	 * @author Admin
	 *
	 */
public class Paladin extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Paladin (){
		super();
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.MYSTIQUE, Origine.JOUR);
		this.nom = "Paladin";
		this.capacite = "Tous les Croyants, d'Origine Nuit ou N�ant et ayant le Dogme Nature, actuellement sur la table sont d�fauss�s.Les capacit�s sp�ciales ne sont pas jou�es.";
		this.nbCroyants = 3;
	}

	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		
	}


}
