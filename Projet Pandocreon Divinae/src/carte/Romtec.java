package carte;

public class Romtec extends Carte{
public static Romtec instance;
	
	private Romtec(){
		this.nom = "Romtec";
		this.capacite = "Peut empêcher un jour de créer un Guide Spirituel. La carte est défaussée.";
		this.estDistribuee = false;
		this.typeCarte = TypeCarte.divinite;
	}
	
	public Romtec getInstance(){
		if (instance == null) {
			instance = new Romtec();
		}
		return instance;
	}

}
