package cartesCroyant;

import java.util.ArrayList;
import java.util.Iterator;

import Carte.Carte;
import Carte.TypeCarte;
import Joueur.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Travailleurs hérite de Croyant
 * représente une carte du jeu
 * @author Admin
 *
 */
public class Travailleurs extends Croyant{
	

	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 */
	public Travailleurs (int idTravailleurs,Dogme d1, Dogme d2, Dogme d3, String capacite){
		super();
		this.nom = "Travaileurs";
		this.capacite = capacite;
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, Origine.JOUR);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idTravailleurs);
	}
	
	/**
	 * capacité de la carte
	 */
	public void sacrifice(){
		switch (this.getIdCarte()) {
		case 6:
			/*
			 * Empêche une Divinité
				possédant le Dogme Nature
				ou Mystique de sacrifier une
				de ses cartes de Croyants
				durant ce tour.

			 */
			ArrayList<Joueur> j1=	Partie.getUniquePartie().getJoueurs();
			Iterator<Joueur> it1 = j1.iterator(); 
			while(it1.hasNext() && it1.next().getDivinite().getPropriete().getDogmes().contains("Nature")== false && it1.next().getDivinite().getPropriete().getDogmes().contains("Mystique")== false){	
			
			}
			Joueur joueur1 =  it1.next();
			while(Partie.getUniquePartie().isPartieEnCours()== true){
				for(Iterator<Carte> croyantAControle= joueur1.getMain().iterator(); croyantAControle.hasNext();){
					Carte c= (Carte) croyantAControle.next();
					if(c.getTypeCarte()==TypeCarte.croyant){
						c.setEstSacrifier(false);
					}
				}
			}
			break;
		case 7:
			/*
			 * Empêche une Divinité
				possédant le Dogme Chaos ou
				Mystique de sacrifier un de
				ses Guides Spirituels durant
				ce tour.

			 */
			ArrayList<Joueur> j2=	Partie.getUniquePartie().getJoueurs();
			Iterator<Joueur> it2 = j2.iterator(); 
			while(it2.hasNext() && it2.next().getDivinite().getPropriete().getDogmes().contains("Chaos")== false && it2.next().getDivinite().getPropriete().getDogmes().contains("Mystique")== false){	
			
			}
			Joueur joueur2 =  it2.next();
			while(Partie.getUniquePartie().isPartieEnCours()== true){
				for(Iterator<Carte> croyantAControle= joueur2.getMain().iterator(); croyantAControle.hasNext();){
					Carte c= (Carte) croyantAControle.next();
					if(c.getTypeCarte()==TypeCarte.croyant){
						c.setEstSacrifier(false);
					}
				}
			}
			break;
		

		default:
			/*
			 * Vous piochez deux cartes au
				hasard dans la main d'une
				autre Divinité.

			 */
			Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
			this.getProprietaire().piocherCarte(2, joueurAAttaquer);
			break;
		}
		
	}
}
