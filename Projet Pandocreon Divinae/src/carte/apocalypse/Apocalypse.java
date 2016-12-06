package carte.apocalypse;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Apocalypse extends Carte{
	
	private Propriete propriete;
	
	public Apocalypse(Origine o){
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

	public void utiliserCapacite(){
		
	}
}
