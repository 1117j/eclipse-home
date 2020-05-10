package sample;

public class ThisCon {
	
	String color;
	String type;
	int door;
	
	
	ThisCon() {
		this("blue", "auto", 4);
	}
	
	ThisCon(String color){
		this(color,"auti",4);
		
	}
		
	ThisCon(String color, String type, int door){
		this.color = color;
		this.type = type;
		this.door = door;
	}
	


	public static void main(String[] args) {
		ThisCon c1 = new ThisCon();
		ThisCon c2 = new ThisCon("yelloo");
		
		System.out.println(c1.color+"," + c1.type + "," + c1.door  );
		System.out.println("----------------------------------------");
		System.out.println(c2.color+ ","+ c2.type + "," + c2.door);
	}
}