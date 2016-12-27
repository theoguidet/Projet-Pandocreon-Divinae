package cartes.deusex;

import cartes.Carte;
import cartes.TypeCarte;
import joueurs.Joueur;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;

/**
 * Fourberie h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Fourberie extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public Fourberie(int idFourberie){
		this.nom = "Fourberie";
		this.capacite = "Sacrifiez 2 cartes Croyants d'une autre Divinit�. Les capacit�s sp�ciales ne sont pas jou�es.";
		this.propriete = new Propriete(Origine.NUIT);
		this.typeCarte= TypeCarte.deusEx;
		this.setIdCarte(idFourberie);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Sacrifiez 2 cartes Croyants
		d'une autre Divinit�. Les
		capacit�s sp�ciales ne sont pas
		jou�es.

		 */
		int indice;
		Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
		for(indice=0;indice<2;indice++){
			Carte carteVictime=joueurAAttaquer.choisirCarteVictime(TypeCarte.croyant);
			Partie.getUniquePartie().ajouterADefausse(carteVictime);
			joueurAAttaquer.getMain().remove(carteVictime);
			indice++;
		}
	}
}
