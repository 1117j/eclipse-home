package sample;

public class FruiteSeller {
	
	int appleN;
	int money;
	final int PRICE;
	
	public FruiteSeller(int mon, int an, int price) {
		 
		money = mon;
		appleN = an;
		PRICE = price;
	}
	

	

	public static void main(String[] args) {
	
		FruiteSeller s1 = new FruiteSeller(0 , 30, 5000);
		FruiteSeller s2 = new FruiteSeller(0, 20, 5500);

	}

}
