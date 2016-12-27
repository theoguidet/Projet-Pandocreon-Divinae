package Carte.deusex;

import Carte.TypeCarte;
import Carte.guideSpirituel.GuideSpirituel;
import Joueur.Joueur;
import propriete.Origine;
import propriete.Propriete;

/**
 * OrdreCeleste h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class OrdreCeleste extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public OrdreCeleste(int idOrdreCeleste){
		this.nom = "Ordre Celeste";
		this.capacite = "Vous r�cup�rez un des Guides Spirituels pos�s devant une autre Divinit� et le placez devant vous avec les Croyants qui y sont attach�s.";
		this.propriete = new Propriete(Origine.JOUR);
		this.setIdCarte(idOrdreCeleste);
		this.typeCarte=TypeCarte.deusEx;
	}
	
	/**
	 * capacit� de la carte
	 */
	@Override
	public void utiliserCapacite(){
		/**
		 * Vous r�cup�rez un des Guides Spirituels pos�s devant une autre Divinit� et le placez devant vous avec les Croyants qui y sont attach�s.
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
