package propriete;

/**
 * �num�ration de dogme
 * @author Admin
 *
 */
public enum Dogme {

	NATURE ("Nature"),
	HUMAIN ("Humain"),
	SYMBOLES ("Symboles"),
	MYSTIQUE ("Mystique"),
	CHAOS ("Chaos");
	
	
	private String name = "";
	
	/**
	 * constructeur priv� de l'�num�ration
	 * @param name
	 */
	Dogme (String name){
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
