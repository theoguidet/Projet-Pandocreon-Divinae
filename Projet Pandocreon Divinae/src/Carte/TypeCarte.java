package Carte;
/**
 * Enumération qui contient les différents types de cartes
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
	 * constructeur privé 
	 * @param nom
	 */
	TypeCarte(String nom){
		this.nom = nom;
	}
	
	/**
	 * méthode qui retourne le nom
	 * @return nom
	 */
	public String toString(){
		return nom;
	}
}
