package Carte.deusex;

import java.util.ArrayList;
import java.util.Iterator;

import Carte.Carte;
import Carte.guideSpirituel.GuideSpirituel;
import Joueur.Joueur;
import partie.Partie;
import propriete.Origine;
import propriete.Propriete;

/**
 * InfluenceJour h�rite de DeusEx
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class InfluenceJour extends DeusEx{
	
	/**
	 * constructeur de la classe
	 */
	public InfluenceJour(int idInfluenceJour){
		this.nom = "Influence Jour";
		this.capacite = "Annule la capacit� sp�ciale d'une carte d'Action d'Origine Nuit ou N�ant.";
		this.propriete = new Propriete(Origine.NULL);
		this.setIdCarte(idInfluenceJour);
	}
	
	/**
	 * capacit� de la carte
	 */
	@Override
	public void utiliserCapacite(){
		/**
		 * Annule la capacit� sp�ciale d'une carte d'Action d'Origine Nuit ou N�ant.
		 */
		ArrayList<Joueur> joueurs= Partie.getUniquePartie().getJoueurs();
		Iterator<Joueur> joueur= joueurs.iterator();
		while(joueur.hasNext()){
			Joueur joueurAChoisir= joueur.next();
			ArrayList<Carte> carteDansLaMain= joueurAChoisir.getMain();
			Iterator<Carte> it= carteDansLaMain.iterator();
			while(it.hasNext()){
				Carte cartes= it.next();
				if(cartes.getPropriete().getOrigine().equals("Nuit")||cartes.getPropriete().getOrigine().equals("Neant")){
					cartes.setEstSacrifier(false);
				}
			}
			ArrayList<GuideSpirituel> guideRattaches= joueurAChoisir.getGuideRattaches();
			Iterator<GuideSpirituel> guide= guideRattaches.iterator();
			while(guide.hasNext()){
				GuideSpirituel guides= guide.next();
				if(guides.getPropriete().getOrigine().equals("Nuit")||guides.getPropriete().getOrigine().equals("Neant")){
					guides.setEstSacrifier(false);
				}
			}
			
		}
	}

}
