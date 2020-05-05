package sample;
//클래스 변수(static), 인스턴스 변수 연습
public class CardTest {
	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);
		Card.jess();
		
	Card c2 = new Card();
	c2.jessica();
	
	Card c1 = new Card();
	c1.kind = "heart";
	c1.number = 2;
	
	System.out.println(c1.kind+c1.number);

	}
}

class Card{
	String kind;
	int number;
	
	
	static int width = 100;
	static int height = 200;
	
	static void jess() {
		System.out.println("jess");}
		
	void jessica() {
		System.out.println("jessica");
	};
	
	

}


