package carte.guideSpirituel;

import java.util.Scanner;

import Joueur.Joueur;
import partie.Plateau;
import propriete.Propriete;
import carte.Carte;

public class GuideSpirituel extends Carte{
	
	protected int nbCroyants;
	protected Propriete propriete;
	
	public GuideSpirituel (){
		super();
	}
	
	public void attacherCroyant(Joueur j){
		System.out.println("Veuillez choisir la/les cartes � attacher au Guide Spirituel :");
		for (Carte c : Plateau.getInstance().getCroyantLibre()) {
			//ne peut pas rattacher une carte croyant que le joueur viens de creer
			int i = 0;
			System.out.println("[" + i + "] " + Plateau.getInstance().getCroyantLibre().get(i).getNom() + "\n Capacit� : " + Plateau.getInstance().getCroyantLibre().get(i).getCapacite());
			i++;
			
		}
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		
		if (Plateau.getInstance().getCroyantLibre().get(choix).getPropriete().getDogmes().contains(this.propriete.getDogmes().get(0)) || Plateau.getInstance().getCroyantLibre().get(choix).getPropriete().getDogmes().contains(this.propriete.getDogmes().get(1)) || Plateau.getInstance().getCroyantLibre().get(choix).getPropriete().getDogmes().contains(this.propriete.getDogmes().get(2))) {
			if (nbCroyants >=  Plateau.getInstance().getCroyantLibre().get(choix).getNbCroyants()) {
				j.ajouterCroyantGuideRattaches(Plateau.getInstance().getCroyantLibre().get(choix));
				nbCroyants = nbCroyants-Plateau.getInstance().getCroyantLibre().get(choix).getNbCroyants();
				Plateau.getInstance().getCroyantLibre().remove(choix);
				
			}
		}
	}


}
