package carte;

public class Romtec extends Carte{
public static Romtec instance;
	
	private Romtec(){
		this.nom = "Romtec";
		this.capacite = "Peut emp�cher un jour de cr�er un Guide Spirituel. La carte est d�fauss�e.";
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
