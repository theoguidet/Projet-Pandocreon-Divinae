package cartes.deusex;

import java.util.ArrayList;
import java.util.Iterator;

import cartes.Carte;
import cartes.TypeCarte;
import cartes.guideSpirituel.GuideSpirituel;
import joueurs.Joueur;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceNeant h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceNeant extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public InfluenceNeant(int idInfluenceNeant){
		this.nom = "Influence Neant";
		this.capacite = "Annule la capacit� sp�ciale d'une carte d'Action d'Origine Jour ou Nuit.";
		this.propriete = new Propriete(Origine.NULL);
		this.setIdCarte(idInfluenceNeant);
		this.typeCarte=TypeCarte.deusEx;
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Annule la capacit� sp�ciale d'une carte d'Action d'Origine Nuit ou Jour.
		 */
		ArrayList<Joueur> joueurs= Partie.getUniquePartie().getJoueurs();
		Iterator<Joueur> joueur= joueurs.iterator();
		while(joueur.hasNext()){
			Joueur joueurAChoisir= (Joueur) joueur.next();
			ArrayList<Carte> carteDansLaMain= joueurAChoisir.getMain();
			Iterator<Carte> it= carteDansLaMain.iterator();
			while(it.hasNext()){
				Carte cartes= (Carte) it.next();
				if(cartes.getPropriete().getOrigine().equals("Jour")||cartes.getPropriete().getOrigine().equals("Nuit")){
					cartes.setEstSacrifier(false);
				}
			}
			ArrayList<GuideSpirituel> guideRattaches= joueurAChoisir.getGuideRattaches();
			Iterator<GuideSpirituel> guide= guideRattaches.iterator();
			while(guide.hasNext()){
				GuideSpirituel guides= (GuideSpirituel) guide.next();
				if(guides.getPropriete().getOrigine().equals("Jour")||guides.getPropriete().getOrigine().equals("Nuit")){
					guides.setEstSacrifier(false);
				}
			}
			
		}
	
		
	}
}
