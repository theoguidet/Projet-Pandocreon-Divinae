package cartes;

public class EvenementCarte {
/**
 * evenement de la carte
 */
	private EvenementCarteType evenement;
	
	private Carte objet;

	/**
	 * @param evenement
	 * @param objet
	 */
	public EvenementCarte(EvenementCarteType evenement, Carte objet) {
		this.evenement = evenement;
		this.objet = objet;
	}

	public EvenementCarteType getEvenement() {
		return evenement;
	}

	public Carte getObjet() {
		return objet;
	}
	
}
