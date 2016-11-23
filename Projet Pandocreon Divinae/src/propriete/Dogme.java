package propriete;

public enum Dogme {
	JOUR ("Jour"),
	NUIT ("Nuit"),
	CREPUSCULE ("Crepuscule"),
	NEANT ("Neant"),
	AUBE ("Aube");
	
	private String name = "";
	
	Dogme (String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
//	public static void main(String args[]){
//		Dogme d = Dogme.AUBE;
//		System.out.println(d.toString());
//	}
}