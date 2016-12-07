package carte.divinite;

import propriete.Propriete;
import carte.Carte;

public class Divinite extends Carte{
	
	private Propriete propriete;

	public Propriete getPropriete() {
		return propriete;
	}

	public void setPropriete(Propriete propriete) {
		this.propriete = propriete;
	}

	public Divinite(){
		super();
	}
}