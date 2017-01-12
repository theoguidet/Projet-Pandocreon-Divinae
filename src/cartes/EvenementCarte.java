package cartes;

public class EvenementCarte {
/**
 * evenement de la carte
 */
	private EvenementCarteType evenement;
	
	private Carte objet;
	private Object[] objetssupplementaires;

	/**
	 * @param evenement
	 * @param objet
	 */
	public EvenementCarte(EvenementCarteType evenement, Carte objet) {
		this.evenement = evenement;
		this.objet = objet;
	}
	public EvenementCarte(EvenementCarteType evenement, Carte objet, Object[] objetssuplementaires){
		this.evenement=evenement;
		this.objet=objet;
		this.objetssupplementaires=objetssuplementaires;
	}

	public Object[] getObjetssupplementaires() {
		return objetssupplementaires;
	}
	public void setObjetssupplementaires(Object[] objetssupplementaires) {
		this.objetssupplementaires = objetssupplementaires;
	}
	public EvenementCarteType getEvenement() {
		return evenement;
	}

	public Carte getObjet() {
		return objet;
	}
	
}
