package Carte.croyant;

import Carte.TypeCarte;
import Carte.guideSpirituel.GuideSpirituel;
import Joueur.Joueur;
import partie.Partie;
import partie.Plateau;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Lycanthropes h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Lycanthropes extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Lycanthropes (int idLycanthropes){
		super();
		this.nom = "Lycanthropes";
		this.capacite = "Retirez tous les Croyants attach�s � l'un des Guides Spirituels d'une autre Divinit�. Les Croyants reviennent au milieu de la table, le Guide Spirituel est d�fauss�";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.HUMAIN,Dogme.NATURE,Dogme.CHAOS, Origine.NUIT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idLycanthropes);
	}
	
	/**
	 * capacit� de la classe
	 */
	public void sacrifice(){
		/*Retirez tous les Croyants
		attach�s � l'un des Guides
		Spirituels d'une autre
		Divinit�. Les Croyants
		reviennent au milieu de la
		table, le Guide Spirituel est defausse

		 * 
		 */
		
		Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
		
		GuideSpirituel t=joueurAAttaquer.choisirGuideRevenir();
		
			Plateau.getInstance().setCroyantLibre(t.getCroyantRattaches());
			t.getCroyantRattaches().clear();
			
			Partie.getUniquePartie().ajouterADefausse(t);
		}
		
	
}
