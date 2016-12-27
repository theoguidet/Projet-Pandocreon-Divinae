package Carte.deusex;

import Carte.TypeCarte;
import Carte.guideSpirituel.GuideSpirituel;
import Joueur.Joueur;
import propriete.Origine;
import propriete.Propriete;

/**
 * Concentration hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Concentration extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Concentration(int idConcentration){
		this.nom = "Concentration";
		this.capacite = "Vous récupérez un des Guides Spirituels posés devant une autre Divinité et le placez devant vous avec les Croyants qui y sont attachés.";
		this.propriete = new Propriete(Origine.NEANT);
		this.typeCarte=TypeCarte.deusEx;
		this.setIdCarte(idConcentration);
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Vous récupérez un des
		Guides Spirituels posés
		devant une autre Divinité et
		le placez devant vous avec
		les Croyants qui y sont
		attachés.
		 */
		Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
	
		int numero=this.getProprietaire().choisirCarteAutreJoueur();
		GuideSpirituel guide=joueurAAttaquer.getGuideRattaches().get(numero);
		guide.setProprietaire(this.getProprietaire());
		this.getProprietaire().getGuideRattaches().add(guide);
		joueurAAttaquer.getGuideRattaches().remove(guide);
	}
}
