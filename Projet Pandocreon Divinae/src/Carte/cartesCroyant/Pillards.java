package Carte.cartesCroyant;

import java.util.ArrayList;
import java.util.Iterator;

import Carte.TypeCarte;
import Joueur.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Pillards h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Pillards extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Pillards (int idPillards){
		super();
		this.nom = "Pillards";
		this.capacite = "R�cup�rez les points d'Action d'une Divinit� n'ayant pas encore jou� durant ce tour. Les points d'Action gardent leur Origine. La Divinit� perd ses points.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.MYSTIQUE, Dogme.NATURE, Dogme.SYMBOLES, Origine.NUIT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idPillards);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void sacrifice(){
		/*R�cup�rez les points d'Action
		d'une Divinit� n'ayant pas
		encore jou� durant ce tour.
		Les points d'Action gardent
		leur Origine. La Divinit�
		perd ses points.
		 * 
		 */
		ArrayList<Joueur> j =Partie.getUniquePartie().getJoueurs();
		Joueur[] n = new Joueur[Partie.getUniquePartie().getJoueurs().size()];
		int i=0;
		for(Iterator<Joueur> k = j.iterator(); k.hasNext();){
			Joueur t = k.next();
			n[i]=t;
			if(t.isEnCoursDeJouer() ==false){
				System.out.println("joueur "+ t.getNom()+" position" +t.getPosJoueur()+ "ne joue encore");
			i++;	
			}

		}
		int s;
		int m=0;
		
		System.out.println("Quel joueur qui ne joue encore choisissez-vous? Tapez sa position!");
		s=Partie.scanner.nextInt();
		while(s != n[m].getPosJoueur() && m<n.length ){
			m++;
		}
		while(s!= n[n.length].getPosJoueur()){
			System.out.println("invalide!Tapez une position propre! ");
			s=Partie.scanner.nextInt();
		}
		Joueur p = Partie.getUniquePartie().getJoueurs().get(s);
		this.getProprietaire().setPointActionJour(this.getProprietaire().getPointActionJour()+p.getPointActionJour());
		this.getProprietaire().setPointActionNuit(this.getProprietaire().getPointActionNuit()+p.getPointActionNuit());
		this.getProprietaire().setPointActionNeant(this.getProprietaire().getPointActionNeant()+p.getPointActionNeant());
		p.setPointActionJour(0);
		p.setPointActionNuit(0);
		p.setPointActionNeant(0);
		
	}
}
