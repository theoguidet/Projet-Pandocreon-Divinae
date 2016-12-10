package propriete;

public enum Dogme {

	NATURE ("Nature"),
	HUMAIN ("Humain"),
	SYMBOLES ("Symboles"),
	MYSTIQUE ("Mystique"),
	CHAOS ("Chaos");
	
	
	private String name = "";
	
	Dogme (String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
