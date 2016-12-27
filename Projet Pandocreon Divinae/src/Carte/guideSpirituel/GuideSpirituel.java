package Carte.guideSpirituel;

import java.util.ArrayList;

import Carte.Carte;
import Carte.TypeCarte;
import Carte.croyant.Croyant;
import Joueur.Joueur;
import partie.Partie;
import partie.Plateau;

/**
 * GuideSpirituel h�rite de Carte
 * repr�sente un type de carte
 * @author Admin
 *
 */
public class GuideSpirituel extends Carte{
	
	protected int nbCroyants;
	protected int nbCarteCroyantRattaches;
	/**
	 * Carte---->Croyant
	 */
	protected ArrayList<Croyant> croyantRattaches;
	
	/**
	 * constructeur de la classe 
	 */
	public GuideSpirituel (){
		super();
		typeCarte = TypeCarte.guideSpirituel;
		nbCarteCroyantRattaches = 0;
		croyantRattaches = new ArrayList<Croyant>();
	}
	
	/**
	 * associe des croyants � ce guide spirituel
	 * @param j
	 * 		joueur auxquel appartient ce guidsprituel
	 */
	public void attacherCroyant(Joueur j){
		System.out.println("Veuillez choisir la/les cartes � attacher au Guide Spirituel :");
		for (Carte c : Plateau.getInstance().getCroyantLibre()) {
			//ne peut pas rattacher une carte croyant que le joueur viens de creer
			int i = 0;
			System.out.println("[" + i + "] " + c.getNom() + "\n Capacit� : " + c.getCapacite());
			i++;
			
		}
		int choix = Partie.scanner.nextInt();
		boolean continuer = true;
		String rep = "";
		while (continuer) {
			//Verification si au moins un dogme en commun
			if (Plateau.getInstance().getCroyantLibre().get(choix).getPropriete().getDogmes().contains(this.propriete.getDogmes().get(0)) || Plateau.getInstance().getCroyantLibre().get(choix).getPropriete().getDogmes().contains(this.propriete.getDogmes().get(1)) || Plateau.getInstance().getCroyantLibre().get(choix).getPropriete().getDogmes().contains(this.propriete.getDogmes().get(2))) {
				//Verification du nombre de croyant rattachable au guide
				if (nbCroyants >=  Plateau.getInstance().getCroyantLibre().get(choix).getNbCroyants()) {

					j.ajouterCroyantRattaches(Plateau.getInstance().getCroyantLibre().get(choix));
					nbCroyants = nbCroyants-Plateau.getInstance().getCroyantLibre().get(choix).getNbCroyants();
					Plateau.getInstance().getCroyantLibre().remove(choix);

				}else{
					System.out.println("Ce croyant regroupe trop de points de pri�res pour ce guide spirituel.");
				}
			}else{
				System.out.println("Cette carte n'a pas de dogme en commun avec le guide spirituel.");
			}
			
			System.out.println("Continuer ? o/n");
			rep = Partie.scanner.nextLine();
			if (rep.equals("n")) {
				continuer = false;
			}else{
				continuer = true;
			}
				
		}
		
		
	}

	public int getNbCarteCroyantRattaches() {
		return nbCarteCroyantRattaches;
	}

	public ArrayList<Croyant> getCroyantRattaches() {
		return croyantRattaches;
	}


}
