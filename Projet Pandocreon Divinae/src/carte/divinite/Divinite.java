package carte.divinite;

import carte.Carte;

public class Divinite extends Carte{

	public Divinite(){
		super();
	}
	
	public void afficherDivinite(){
		System.out.println("Vous �tes :");
		System.out.println(nom + " d'origine " + this.getPropriete().getOrigine());
		System.out.println("Vous avez la capacit� : " + getCapacite());
	}
}
