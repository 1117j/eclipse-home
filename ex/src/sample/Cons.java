package sample;


class ConsTest{
	
	
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	
	public ConsTest() {
		System.out.println("생성자");
	}

	  public static void main(String []args) {
		 System.out.println("CiiTest bv");
		 //ConsTest ct = new ConsTest();
		 
		 System.out.println("2 ");
		// ConsTest ct2 = new ConsTest();
	
		
		 
	 }
}