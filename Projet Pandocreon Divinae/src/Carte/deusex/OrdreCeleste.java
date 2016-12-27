package Carte.deusex;

import Carte.TypeCarte;
import Carte.guideSpirituel.GuideSpirituel;
import Joueur.Joueur;
import propriete.Origine;
import propriete.Propriete;

/**
 * OrdreCeleste hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class OrdreCeleste extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public OrdreCeleste(int idOrdreCeleste){
		this.nom = "Ordre Celeste";
		this.capacite = "Vous récupérez un des Guides Spirituels posés devant une autre Divinité et le placez devant vous avec les Croyants qui y sont attachés.";
		this.propriete = new Propriete(Origine.JOUR);
		this.setIdCarte(idOrdreCeleste);
		this.typeCarte=TypeCarte.deusEx;
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Vous récupérez un des Guides Spirituels posés devant une autre Divinité et le placez devant vous avec les Croyants qui y sont attachés.
		 */
		Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
		
		int numero=this.getProprietaire().choisirCarteAutreJoueur();
		if(joueurAAttaquer.getGuideRattaches()!=null){
			GuideSpirituel guide=joueurAAttaquer.getGuideRattaches().get(numero);
			guide.setProprietaire(this.getProprietaire());
			this.getProprietaire().getGuideRattaches().add(guide);
			joueurAAttaquer.getGuideRattaches().remove(guide);
		}else{
			System.out.println("Ce divinite n'a pas Guide Spirituel devant lui!");
		}
		
		
	}
}
