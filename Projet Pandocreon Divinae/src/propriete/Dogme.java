package propriete;

/**
 * énumération de dogme
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
	 * constructeur privé de l'énumération
	 * @param name
	 */
	Dogme (String name){
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
