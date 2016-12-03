package carte.apocalypse;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Apocalypse extends Carte{
	
	private Propriete propriete;
	
	public Apocalypse(String nom, String capacite, boolean estDistribuee, TypeCarte typeCarte, Dogme d1, Dogme d2, Dogme d3, Origine o){
		super(nom,capacite,estDistribuee,typeCarte);
		if (o==null) {
			propriete = null;
		}else if(d1==null && d2==null && d3==null){
			propriete = new Propriete(o);
		}else{
			propriete = new Propriete(d1, d2, d3, o);
		}
	}

	public void utiliserCapacite(){
		
	}
}
