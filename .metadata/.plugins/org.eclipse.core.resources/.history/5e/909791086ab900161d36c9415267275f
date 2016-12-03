package carte;

public class PuiTara extends Carte{
	
	public static PuiTara instance;
	
	private PuiTara(){
		this.nom = "Pui-Tara";
		this.capacite = "Peut détruire toutes les cartes de Croyants au centre de la table d'Origine Jour.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public PuiTara getInstance(){
		if (instance == null) {
			instance = new PuiTara();
		}
		return instance;
	}

}
