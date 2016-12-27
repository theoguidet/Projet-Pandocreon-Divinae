package Carte.deusex;

import java.util.ArrayList;
import java.util.Iterator;

import Carte.Carte;
import Carte.TypeCarte;
import Carte.guideSpirituel.GuideSpirituel;
import Joueur.Joueur;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceNulle hérite de DeusEx
 * représente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceNulle extends DeusEx{

	/**
	 * constructeur de la classe
	 */
	public InfluenceNulle(int idInfluenceNulle){
		this.nom = "Influence Nulle";
		this.capacite = "Annule la capacité spéciale d'une autre carte d'Action.";
		this.propriete = new Propriete(Origine.NULL);
		this.setIdCarte(idInfluenceNulle);
		this.typeCarte=TypeCarte.deusEx;
	}
	
	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Annule la capacité spéciale d'une carte d'Action d'Origine Nuit ou Néant.
		 */
		ArrayList<Joueur> joueurs= Partie.getUniquePartie().getJoueurs();
		Iterator<Joueur> joueur= joueurs.iterator();
		while(joueur.hasNext()){
			Joueur joueurAChoisir= (Joueur) joueur.next();
			ArrayList<Carte> carteDansLaMain= joueurAChoisir.getMain();
			Iterator<Carte> it= carteDansLaMain.iterator();
			while(it.hasNext()){
				Carte cartes= (Carte) it.next();
				if(cartes.getTypeCarte()!= TypeCarte.deusEx){
					cartes.setEstSacrifier(false);
				}
			}
			ArrayList<GuideSpirituel> guideRattaches= joueurAChoisir.getGuideRattaches();
			Iterator<GuideSpirituel> guide= guideRattaches.iterator();
			while(guide.hasNext()){
				GuideSpirituel guides= (GuideSpirituel) guide.next();
				
					guides.setEstSacrifier(false);
				
			}
			
		
	}
	}
}
