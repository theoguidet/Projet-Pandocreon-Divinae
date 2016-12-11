package carte.apocalypse;

import partie.Partie;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Apocalypse extends Carte{
	
	public Apocalypse(Origine o){
		super();
		this.nom = "Apocalypse";
		this.capacite = "Vous faites perdre le joueur ayant le moins de prières (4 joueurs ou plus) ou vous faites gagner le joueur ayant le plus de prières (2 ou 3 joueurs).";
		this.typeCarte = TypeCarte.apocalyspe;
		
		if (o==null) {
			propriete = null;
		}else {
			propriete = new Propriete(o);
		}
	}

	public void utiliserCapacite(Partie p){
		if (p.getNbJoueur() >= 4) {
			p.supprimerJoueur();
		}else{
			p.determinerGagnant();
		}
	}
}
