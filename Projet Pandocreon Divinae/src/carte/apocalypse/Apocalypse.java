package carte.apocalypse;

import partie.Partie;
import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Apocalypse extends Carte{
	
	public Apocalypse(String o){
		super();
		this.nom = "Apocalypse";
		this.capacite = "";
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
