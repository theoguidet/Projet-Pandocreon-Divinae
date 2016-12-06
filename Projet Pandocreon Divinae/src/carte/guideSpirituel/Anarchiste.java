package carte.guideSpirituel;

import propriete.Dogme;
import propriete.Origine;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

public class Anarchiste extends Carte{
	
	private int nbCroyants;
	private Propriete propriete;
	
	public Anarchiste(){
		super();
		this.nom = "Anarchiste";
		this.capacite = "Sacrifie un Guide Spirituel, si lui ou a Divinit� ne croit pas au Dogme Chaos. Les capacit�s sp�ciales sont jou�es normalement.";
		this.nbCroyants= 3;
		this.propriete = new Propriete(Dogme.HUMAIN, Dogme.CHAOS, Origine.NEANT);
		this.typeCarte = typeCarte.guideSpirituel;
	}
	
	public void attacherCroyant(){
		
	}

	public void utiliserCapacite(){
		
	}


}
