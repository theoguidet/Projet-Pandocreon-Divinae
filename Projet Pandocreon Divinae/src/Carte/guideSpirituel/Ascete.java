package Carte.guideSpirituel;

import java.util.ArrayList;

import Carte.Carte;
import Carte.TypeCarte;
import Joueur.Joueur;
import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;

/**
 * Ascete h�rite de GuideSpirituel
 * repr�sente une carte du jeu 
 * @author Admin
 *
 */
public class Ascete extends GuideSpirituel{
	
	/**
	 * constructeur de la classe 
	 */
	public Ascete(int idAscete){
		super();
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.SYMBOLES, Origine.NUIT);
		this.nom = "Ascete";
		this.capacite = "Sacrifie 2 cartes Croyants d'une Divinit� ayant le Dogme Humain ou Symboles.Les capacit�s sp�ciales sont jou�es normalement";
		this.nbCroyants= 1;
		this.setIdCarte(idAscete);
	}

	/**
	 * capacit� de la carte
	 */
	@Override
	public void utiliserCapacite(){
		/**
		 * Sacrifie 2 cartes Croyants
			d'une Divinit� ayant le
			Dogme Humain ou Symboles.
			Les capacit�s sp�ciales sont
			jou�es normalement.
		 */
		ArrayList<Joueur>j=Partie.getUniquePartie().getJoueurs();
		int i=0;
		while(j.get(i).getDivinite().getPropriete().getDogmes().contains("Humain")==false&&j.get(i).getDivinite().getPropriete().getDogmes().contains("Symboles")==false&&i<=j.size()){
			i++;
		}
		if(j.get(i).getDivinite().getPropriete().getDogmes().contains("Humain")==true||j.get(i).getDivinite().getPropriete().getDogmes().contains("Symboles")==true){
			if(this.getProprietaire().isEstVirtuel()==true){
				ArrayList<Carte> c=this.getProprietaire().getMain();
				
				int k=0;
				for(i=0;i<c.size();i++){
					while(k<2){
					if(c.get(i).getTypeCarte()==TypeCarte.croyant){
						c.get(i).setEstSacrifier(true);
						c.get(i).utiliserCapacite();
						Partie.getUniquePartie().ajouterADefausse(c.get(i));
						k++;
					}
					}
				}
			}else{
				int u;
				System.out.println("Tapez le numero de la premiere carte Croyant � sacrifier");
				u=Partie.scanner.nextInt();
				ArrayList<Carte> c=this.getProprietaire().getMain();
				
				int p=0;
				while(p<2){
				while(c.get(u).getTypeCarte()!=TypeCarte.croyant){
					System.out.println("Tapez le numero de la "+p+1+"er carte Croyant � sacrifier");
					u=Partie.scanner.nextInt();
				}
				c.get(u).utiliserCapacite();
				Partie.getUniquePartie().ajouterADefausse(c.get(u));
				p++;
			}
			}
		}
	}


}
