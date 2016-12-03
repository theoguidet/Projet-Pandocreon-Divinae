package propriete;

public enum Origine {
	JOUR ("Jour"),
	NUIT ("Nuit"),
	CREPUSCULE ("Crepuscule"),
	NEANT ("Neant"),
	AUBE ("Aube");
	
	private String name = "";
	
	Origine (String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
