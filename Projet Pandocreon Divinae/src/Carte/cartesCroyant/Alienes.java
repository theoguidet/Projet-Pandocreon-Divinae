package Carte.cartesCroyant;

import java.util.ArrayList;
import java.util.Iterator;

import Carte.Carte;
import Carte.TypeCarte;
import Carte.guideSpirituel.GuideSpirituel;
import Joueur.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Alienes h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Alienes extends Croyant{
	

	/**
	 * constructeur de la classe
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param d3
	 * 		troisieme dogme
	 * @param capacite
	 * 		description de la capacit� de la carte
	 */
	public Alienes (int idAlienes,Dogme d1, Dogme d2, Dogme d3, String capacite){
		super();
		this.nom = "Ali�n�s";
		this.capacite = capacite;
		this.nbCroyants= 2;
		this.propriete = new Propriete(d1, d2, d3, Origine.NEANT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idAlienes);
	}
	
	/**
	 * capacit� effectu�e lors du sacrifice de la carte
	 */
	public void sacrifice(){
		switch (this.getIdCarte()) {
		case 31:
			/*
			 * Emp�che une Divinit�
			poss�dant le Dogme Nature
			ou Mystique de sacrifier une
			de ses cartes de Croyants
			durant ce tour de jeu.
			 */
			ArrayList<Joueur> j1=	Partie.getUniquePartie().getJoueurs();
			Iterator<Joueur> it1 = j1.iterator(); 
			while(it1.hasNext() && it1.next().getDivinite().getPropriete().getDogmes().contains("Nature")== false && it1.next().getDivinite().getPropriete().getDogmes().contains("Mystique")== false){	
			
			}
			Joueur joueur1 =  it1.next();
			while(Partie.getUniquePartie().isPartieEnCours()== true){
				for(Iterator<Carte> croyantAControle= joueur1.getMain().iterator(); croyantAControle.hasNext();){
					Carte c= croyantAControle.next();
					if(c.getTypeCarte()==TypeCarte.croyant){
						c.setEstSacrifier(false);
					}
				}
			}
			
			break;
		case 32:
			/*
			 * Emp�che une Divinit�
			poss�dant le Dogme Chaos
			ou Mystique de sacrifier une
			de ses cartes de Guide Spirituel
			durant ce tour de jeu.
			 */
			ArrayList<Joueur> j2=	Partie.getUniquePartie().getJoueurs();
			Iterator<Joueur> it2 = j2.iterator(); 
			while(it2.hasNext() && it2.next().getDivinite().getPropriete().getDogmes().contains("Chaos")== false && it2.next().getDivinite().getPropriete().getDogmes().contains("Mystique")== false){	
			
			}
			Joueur joueur2 =  it2.next();
			while(Partie.getUniquePartie().isPartieEnCours()== true){
				for(Iterator<Carte> guideAControle1= joueur2.getMain().iterator(); guideAControle1.hasNext();){
					Carte c= guideAControle1.next();
					if(c.getTypeCarte()==TypeCarte.guideSpirituel){
						c.setEstSacrifier(false);
					}
				}
				for(Iterator<GuideSpirituel> guideAControle2= joueur2.getGuideRattaches().iterator(); guideAControle2.hasNext();){
					Carte d= guideAControle2.next();
					d.setEstSacrifier(false);
				}
			}

		default:
			/**
			 * Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.
			 */
			Joueur joueurAAttaquer=this.getProprietaire().choisirLeJoueurAAttaquer();
			this.getProprietaire().piocherCarte(2, joueurAAttaquer);
			break;
			
		}
		
	}
}
