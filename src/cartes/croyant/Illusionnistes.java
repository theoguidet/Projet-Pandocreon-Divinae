package cartes.croyant;

import cartes.Carte;
import cartes.TypeCarte;
import joueurs.Joueur;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
/**
 * Illusionnistes h�rite de Croyant
 * repr�sente une carte du jeu
 * @author Admin
 *
 */
public class Illusionnistes extends Croyant{
	

	/**
	 * constructeur de la classe
	 */
	public Illusionnistes (int idIllusionnistes){
		super();
		this.nom = "Illusionnistes";
		this.capacite = "Vous b�n�ficiez de la capacit� sp�ciale de sacrifice d'une carte de Croyants appartenant � une autre Divinit�. La carte en question reste en jeu.";
		this.nbCroyants= 4;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS, Dogme.SYMBOLES, Origine.NUIT);
		this.typeCarte = TypeCarte.croyant;
		this.setIdCarte(idIllusionnistes);
	}
	
	/**
	 * capacit� de la carte
	 */
	public void utiliserCapacite(){
		/*
		 * Vous b�n�ficiez de la capacit�
		sp�ciale de sacrifice d'une
		carte de Croyants
		appartenant � une autre
		Divinit�. La carte en question
		reste en jeu.
		 */
		
		Joueur joueurAAttaquer = this.getProprietaire().choisirLeJoueurAAttaquer();
		this.getProprietaire().setEnCoursDeJouer(false);
		joueurAAttaquer.setEnCoursDeJouer(true);
		Carte carte=joueurAAttaquer.choisirCarteVictime(TypeCarte.croyant);
		if(carte== null){
			System.out.println("Le joueur � attaquer n'a pas carte croyant!");
		}else{
			carte.setProprietaire(this.getProprietaire());
			this.getProprietaire().getMain().add(carte);
			joueurAAttaquer.getMain().remove(carte);
			carte.utiliserCapacite();
			joueurAAttaquer.getMain().add(carte);
			this.getProprietaire().getMain().remove(carte);
			}
		
	}
}
