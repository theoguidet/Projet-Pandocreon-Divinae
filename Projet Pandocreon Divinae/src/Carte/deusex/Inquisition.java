package Carte.deusex;

import Carte.Aleatoire;
import Carte.TypeCarte;
import Carte.guideSpirituel.GuideSpirituel;
import Joueur.Joueur;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;

/**
 * Inquisition hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Inquisition extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Inquisition(int idInquisition){
		this.nom = "Inquisition";
		this.capacite = "Choisissez un des Guides Spirituels d'un autre joueur, et l'un des votres. Lancez le dé de Cosmogonie. Sur Jour, le Guide adverse est sacrifié, sur Nuit le votre est sacrifié, sur Néant rien ne se passe.";
		this.propriete = new Propriete(Origine.NULL);
		this.setIdCarte(idInquisition);
		this.typeCarte=TypeCarte.deusEx;
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
	/**
	 * 	Choisissez un des Guides Spirituels d'un autre joueur, et l'un des votres. Lancez le dé de Cosmogonie. Sur Jour, le Guide adverse est sacrifié, sur Nuit le votre est sacrifié, sur Néant rien ne se passe.
	 */
		int indice;
		Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
		GuideSpirituel guideAChoisir1=(GuideSpirituel) this.getProprietaire().choisirCarteVictime(TypeCarte.guideSpirituel);
		GuideSpirituel guideAChoisir2=(GuideSpirituel) joueurAAttaquer.choisirCarteVictime(TypeCarte.guideSpirituel);
		indice=Aleatoire.rand(1, 3);
		switch (indice) {
		case 1:
			System.out.println("Face Jour");
			guideAChoisir2.utiliserCapacite();
			Partie.getUniquePartie().ajouterADefausse(guideAChoisir2);
			joueurAAttaquer.getMain().remove(guideAChoisir2);
			break;
		case 2:
			System.out.println("Face Nuit");
			guideAChoisir1.utiliserCapacite();
			Partie.getUniquePartie().ajouterADefausse(guideAChoisir1);
			this.getProprietaire().getMain().remove(guideAChoisir1);
			break;
		default:
			
			break;
		}
		
	}
}
