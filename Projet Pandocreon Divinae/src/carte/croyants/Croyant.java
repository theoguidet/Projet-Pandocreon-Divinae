package carte.croyants;

import carte.Carte;
import propriete.Propriete;

public class Croyant extends Carte{
	protected int nbCroyants;
	
	public Croyant(){
		super();
	}

	public Propriete getPropriete() {
		return propriete;
	}

	public void setPropriete(Propriete propriete) {
		this.propriete = propriete;
	}

	public int getNbCroyants() {
		return nbCroyants;
	}
	
}
