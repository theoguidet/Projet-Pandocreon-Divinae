package Carte.deusex;

import Carte.Aleatoire;
import Carte.Carte;
import Carte.TypeCarte;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;

/**
 * Phoenix h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Phoenix extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Phoenix(int idPhoneix){
		this.nom = "Phoenix";
		this.capacite = "Permet de b�n�ficier de la capacit� sp�ciale de l'un de vos Croyants ou Guides Spirituels sans sacrifier la carte.";
		this.propriete = new Propriete(Origine.JOUR);
		this.setIdCarte(idPhoneix);
		this.typeCarte=TypeCarte.deusEx;
	}

	/**
	 * capacit� de la carte
	 */
	@Override
	public void utiliserCapacite(){
		/**
		 * Permet de b�n�ficier de la capacit� sp�ciale de l'un de vos Croyants ou Guides Spirituels sans sacrifier la carte.
		 */
		Carte carteAChoisir;
		if(this.getProprietaire().isEstVirtuel()==false){
			int indice;
			System.out.println("Choisir type carte � sacrifer: 1: Croyant, 2: Guide Spirituel");
			indice= Partie.scanner.nextInt();
			
			switch (indice) {
			case 1:
				carteAChoisir=this.getProprietaire().choisirCarteVictime(TypeCarte.croyant);
				break;	

			default:
				carteAChoisir=this.getProprietaire().choisirCarteVictime(TypeCarte.guideSpirituel);
				break;
			}
		}else{
			int choix;
			choix=Aleatoire.rand(1, 2);

			switch (choix) {
			case 1:
				carteAChoisir=this.getProprietaire().choisirCarteVictime(TypeCarte.croyant);
				break;	

			default:
				carteAChoisir=this.getProprietaire().choisirCarteVictime(TypeCarte.guideSpirituel);
				break;
			}
		}
		carteAChoisir.utiliserCapacite();
		
	}
}
