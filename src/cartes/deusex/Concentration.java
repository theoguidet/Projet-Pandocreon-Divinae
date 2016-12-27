package cartes.deusex;

import cartes.TypeCarte;
import cartes.guideSpirituel.GuideSpirituel;
import joueurs.Joueur;
import propriete.Origine;
import propriete.Propriete;

/**
 * Concentration h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Concentration extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public Concentration(int idConcentration){
		this.nom = "Concentration";
		this.capacite = "Vous r�cup�rez un des Guides Spirituels pos�s devant une autre Divinit� et le placez devant vous avec les Croyants qui y sont attach�s.";
		this.propriete = new Propriete(Origine.NEANT);
		this.typeCarte=TypeCarte.deusEx;
		this.setIdCarte(idConcentration);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Vous r�cup�rez un des
		Guides Spirituels pos�s
		devant une autre Divinit� et
		le placez devant vous avec
		les Croyants qui y sont
		attach�s.
		 */
		Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
	
		int numero=this.getProprietaire().choisirCarteAutreJoueur();
		GuideSpirituel guide=joueurAAttaquer.getGuideRattaches().get(numero);
		guide.setProprietaire(this.getProprietaire());
		this.getProprietaire().getGuideRattaches().add(guide);
		joueurAAttaquer.getGuideRattaches().remove(guide);
	}
}
