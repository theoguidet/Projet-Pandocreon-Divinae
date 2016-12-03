package carte;

public class Gwenghelen extends Carte{
	
	public static Gwenghelen instance;
	
	private Gwenghelen(){
		this.nom = "Gwenghelen";
		this.capacite = "R�cup�re autant de points d'Action suppl�mentaires d'Origine N�ant que le nombre de Guides Spirituels que la Divinit� poss�de.";
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
