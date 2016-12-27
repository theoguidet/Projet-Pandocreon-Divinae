package propriete;

/**
 * �num�ration des origines
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
	 * constructeur priv� de l'�num�ration
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
	@Override
	public String toString(){
		return name;
	}
}
