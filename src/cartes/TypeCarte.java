package cartes;
/**
 * Enum�ration qui contient les diff�rents types de cartes
 * @author Admin
 *
 */
public enum TypeCarte {
	apocalyspe ("Apocaplyspe"),
	croyant ("Croyant"),
	guideSpirituel("Guide Spirituel"),
	deusEx ("Deus Ex"),
	divinite ("Divinite");
	
	private String nom = "";

	/**
	 * constructeur priv� 
	 * @param nom
	 */
	TypeCarte(String nom){
		this.nom = nom;
	}
	
	/**
	 * m�thode qui retourne le nom
	 * @return nom
	 */
	public String toString(){
		return nom;
	}
}
