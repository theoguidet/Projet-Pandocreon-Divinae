package carte.guideSpirituel;

import partie.Plateau;
import propriete.Propriete;
import carte.Carte;

public class GuideSpirituel extends Carte{
	
	protected int nbCroyants;
	protected Propriete propriete;
	
	public GuideSpirituel (){
		super();
	}
	
	public void attacherCroyant(){
		System.out.println("Veuillez choisir la/les cartes à attacher au Guide Spirituel :");
		for (Carte c : Plateau.getInstance().getCroyantLibre()) {
			//ne peut pas rattacher une carte croyant que le joueur viens de creer
			int i = 0;
			System.out.println("[" + i + "] ");
			i++;
		}
		Plateau.getInstance().getCroyantLibre();
	}


}
