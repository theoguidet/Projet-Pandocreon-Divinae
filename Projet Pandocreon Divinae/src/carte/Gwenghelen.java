package carte;

public class Gwenghelen extends Carte{
	
	public static Gwenghelen instance;
	
	private Gwenghelen(){
		this.nom = "Gwenghelen";
		this.capacite = "Récupère autant de points d'Action supplémentaires d'Origine Néant que le nombre de Guides Spirituels que la Divinité possède.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public Gwenghelen getInstance(){
		if (instance == null) {
			instance = new Gwenghelen();
		}
		return instance;
	}

}
