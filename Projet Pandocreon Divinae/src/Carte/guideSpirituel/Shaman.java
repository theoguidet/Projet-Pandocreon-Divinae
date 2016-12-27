package Carte.guideSpirituel;

import java.util.ArrayList;
import java.util.Iterator;

import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Carte.Carte;
import Carte.TypeCarte;
import Joueur.Joueur;

/**
 * Shaman hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Shaman extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Shaman(int idShaman){
		super();
		this.propriete = new Propriete(Dogme.NATURE,Dogme.SYMBOLES,Origine.NUIT);
		this.nom = "Shaman";
		this.capacite = "Sacrifie tous les Croyants d'Origine Néant d'une Divinité ayant le Dogme Humain. Les capacités spéciales sont jouées normalement.";
		this.nbCroyants = 3;
		this.setIdCarte(idShaman);
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Sacrifie tous les Croyants
		d'Origine Néant d'une
		Divinité ayant le Dogme
		Humain. Les capacités
		spécials sont jouées
		normalement.
		 */
		ArrayList<Joueur> joueurs=	Partie.getUniquePartie().getJoueurs();
		Iterator<Joueur> joueurAAttaquer = joueurs.iterator(); 
		ArrayList<Carte> carteASacrifier= new ArrayList<>();
		int indice;
		while(joueurAAttaquer.hasNext()&&joueurAAttaquer.next().getDivinite().getPropriete().getDogmes().contains("Humain")==false){
			
		}
		if(joueurAAttaquer.hasNext()==false){
			System.out.println("Il n'y a aucune divinité ayant dogme humain");
		}else if(joueurAAttaquer.next().getDivinite().getPropriete().getDogmes().contains("Humain")==true){
			carteASacrifier=joueurAAttaquer.next().getMain();
			for(indice=0;indice<carteASacrifier.size();indice++){
				if(carteASacrifier.get(indice).getTypeCarte()==TypeCarte.croyant&&carteASacrifier.get(indice).getPropriete().getOrigine().equals("Neant")){
					carteASacrifier.get(indice).setEstSacrifier(true);
					carteASacrifier.get(indice).utiliserCapacite();
					Partie.getUniquePartie().ajouterADefausse(carteASacrifier.get(indice));
					carteASacrifier.remove(indice);
				}
				
			}
			
		}
	}


}
