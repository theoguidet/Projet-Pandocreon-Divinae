package cartes.deusex;

import java.util.ArrayList;

import cartes.TypeCarte;
import cartes.guideSpirituel.GuideSpirituel;
import partie.Partie;
import partie.Plateau;
import propriete.Origine;
import propriete.Propriete;

/**
 * ColereDivine h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class ColereDivine extends DeusEx{

	/**
	 * constructeur de la classe
	 * @param o
	 * 		Origine de la carte
	 */
	public ColereDivine(int idColereDivine,Origine o){
		this.nom = "ColereDivine";
		this.capacite = "D�truit une carte Guide Spirituel d'Origine Nuit ou N�ant, dont la capacit� sp�ciale n'a pas effet. Les Croyants attach�s reviennent au centre de la table.";
		this.propriete = new Propriete(o);
		this.typeCarte=TypeCarte.deusEx;
		this.setIdCarte(idColereDivine);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * D�truit une carte Guide
		Spirituel d'Origine Nuit ou
		N�ant, dont la capacit�
		sp�ciale n'a pas effet. Les
		Croyants attach�s reviennent
		au centre de la table
		 */
		ArrayList<GuideSpirituel> guides=this.getProprietaire().getGuideRattaches();
		int indice=0;
		while(guides.get(indice).getPropriete().getOrigine().toString().equals("Nuit")== false&&guides.get(indice).getPropriete().getOrigine().toString().equals("Neant")== false&&indice<guides.size()){
			indice++;
		}
		Plateau.getInstance().setCroyantLibre(guides.get(indice).getCroyantRattaches());
		Partie.getUniquePartie().ajouterADefausse(guides.get(indice));
		guides.remove(indice);
		
		
	}
}
