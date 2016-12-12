package carte.guideSpirituel;

import java.util.ArrayList;
import java.util.Scanner;

import Joueur.Joueur;
import partie.Plateau;
import propriete.Propriete;
import carte.Carte;
import carte.TypeCarte;

/**
 * GuideSpirituel hérite de Carte
 * représente un type de carte
 * @author Admin
 *
 */
public class GuideSpirituel extends Carte{
	
	protected int nbCroyants;
	protected int nbCarteCroyantRattaches;
	protected ArrayList<Carte> croyantRattaches;
	
	/**
	 * constructeur de la classe 
	 */
	public GuideSpirituel (){
		super();
		typeCarte = TypeCarte.guideSpirituel;
		nbCarteCroyantRattaches = 0;
		croyantRattaches = new ArrayList<Carte>();
	}
	
	/**
	 * associe des croyants à ce guide spirituel
	 * @param j
	 * 		joueur auxquel appartient ce guidsprituel
	 */
	public void attacherCroyant(Joueur j){
		System.out.println("Veuillez choisir la/les cartes à attacher au Guide Spirituel :");
		for (Carte c : Plateau.getInstance().getCroyantLibre()) {
			//ne peut pas rattacher une carte croyant que le joueur viens de creer
			int i = 0;
			System.out.println("[" + i + "] " + c.getNom() + "\n Capacité : " + c.getCapacite());
			i++;
			
		}
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		clavier.close();
		
		//Verification si au moins un dogme en commun
		if (Plateau.getInstance().getCroyantLibre().get(choix).getPropriete().getDogmes().contains(this.propriete.getDogmes().get(0)) || Plateau.getInstance().getCroyantLibre().get(choix).getPropriete().getDogmes().contains(this.propriete.getDogmes().get(1)) || Plateau.getInstance().getCroyantLibre().get(choix).getPropriete().getDogmes().contains(this.propriete.getDogmes().get(2))) {
			//Verification du nombre de croyant rattachable au guide
			if (nbCroyants >=  Plateau.getInstance().getCroyantLibre().get(choix).getNbCroyants()) {
				
				j.ajouterCroyantRattaches(Plateau.getInstance().getCroyantLibre().get(choix));
				nbCroyants = nbCroyants-Plateau.getInstance().getCroyantLibre().get(choix).getNbCroyants();
				Plateau.getInstance().getCroyantLibre().remove(choix);
				
			}
		}
	}

	public int getNbCarteCroyantRattaches() {
		return nbCarteCroyantRattaches;
	}

	public ArrayList<Carte> getCroyantRattaches() {
		return croyantRattaches;
	}


}
