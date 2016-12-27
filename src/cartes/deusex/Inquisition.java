package cartes.deusex;

import cartes.Aleatoire;
import cartes.TypeCarte;
import cartes.guideSpirituel.GuideSpirituel;
import joueurs.Joueur;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;

/**
 * Inquisition h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Inquisition extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Inquisition(int idInquisition){
		this.nom = "Inquisition";
		this.capacite = "Choisissez un des Guides Spirituels d'un autre joueur, et l'un des votres. Lancez le d� de Cosmogonie. Sur Jour, le Guide adverse est sacrifi�, sur Nuit le votre est sacrifi�, sur N�ant rien ne se passe.";
		this.propriete = new Propriete(Origine.NULL);
		this.setIdCarte(idInquisition);
		this.typeCarte=TypeCarte.deusEx;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
	/**
	 * 	Choisissez un des Guides Spirituels d'un autre joueur, et l'un des votres. Lancez le d� de Cosmogonie. Sur Jour, le Guide adverse est sacrifi�, sur Nuit le votre est sacrifi�, sur N�ant rien ne se passe.
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
