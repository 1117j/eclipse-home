package phonebookver01_1;

public class PhoneMain {
	
	public static void main(String[]args) {
		
		PhoneInfo pn = new PhoneInfo("Jess", "1117", "0240404040");
		
		pn.showInfo();
		
		System.out.println("------------------------------");
	
		pn = new PhoneInfo("jessica","0104240444");
		
		pn.showInfo();
		
		
	}
	
	
}
