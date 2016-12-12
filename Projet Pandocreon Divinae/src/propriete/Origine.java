package propriete;

/**
 * énumération des origines
 * @author Admin
 *
 */
public enum Origine {
	JOUR ("Jour"),
	NUIT ("Nuit"),
	CREPUSCULE ("Crepuscule"),
	NEANT ("Neant"),
	AUBE ("Aube"),
	NULL ("");
	
	private String name = "";
	
	/**
	 * constructeur privé de l'énumération
	 * @param name
	 * 		nom
	 */
	Origine (String name){
		this.name = name;
	}
	
	/**
	 * affiche le nom
	 * @return nom
	 */
	public String toString(){
		return name;
	}
}
