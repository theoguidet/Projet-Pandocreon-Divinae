package Carte.guideSpirituel;

import java.util.ArrayList;
import java.util.Iterator;

import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import Joueur.Joueur;

/**
 * Martyr hérite de GuideSpirituel
 * représente une carte du jeu 
 * @author Admin
 *
 */
public class Martyr extends GuideSpirituel{
	
	/**
	 * 
	 * constructeur de la classe 
	 *
	 * @param d1
	 * 		premier dogme
	 * @param d2
	 * 		deuxieme dogme
	 * @param o
	 * 		Origine
	 */
	public Martyr(int idMartyr,Dogme d1, Dogme d2, Origine o){
		super();
		this.propriete = new Propriete(d1, d2, o);
		this.nom = "Martyr";
		this.capacite = "Equivalent à la pose d'une carte Apocalypse.";
		this.nbCroyants= 2;
		this.setIdCarte(idMartyr);
	}

	/**
	 * capacité de la carte
	 */
	public void utiliserCapacite(){
		/**
		 * Equivalent à la pose d'une
			carte Apocalypse.
		 */
	int nb=	Partie.getUniquePartie().getNbJoueur();
	ArrayList<Joueur> j=Partie.getUniquePartie().getJoueurs();
	int min=j.get(0).getNbPrieres();
	int i=0;
	int k=0;
	if(nb>=4){
		for(Iterator<Joueur> it=j.iterator();it.hasNext();){
			Joueur itj= (Joueur) it.next();
			if(min>itj.getNbPrieres()){
				min=itj.getNbPrieres();
				k=itj.getPosJoueur();
			}else if(min==itj.getNbPrieres()){
				i++;
			}
		}
		if(i==0){
			Partie.getUniquePartie().getJoueurs().remove(k);
		}else{
			Partie.getUniquePartie().ajouterADefausse(this);
		}
	}else{
		ArrayList<Joueur> n=Partie.getUniquePartie().classementJoueurs();
		if(n.get(1)==n.get(2)){
			Partie.getUniquePartie().ajouterADefausse(this);
		}else {
			Partie.getUniquePartie().determinerGagnant();
		}
	}
		
	}

}
