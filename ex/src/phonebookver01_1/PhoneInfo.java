package phonebookver01_1;

public class PhoneInfo {

	String name;
	String bday;
	String pNum;
	
	
	PhoneInfo(String name, String bday, String pNum){
		this.name = name;
		this.bday = bday;
		this.pNum = pNum;
	}
	
	PhoneInfo(String name, String pNum){
		this.name = name;
		this.bday = null;
		this.pNum = pNum;	
		System.out.println("생년월일을 입력하지 않았습니다.");
	}
	
	void showInfo() {
		System.out.println("name: "+ name);
		System.out.println("bday: " +bday);
		System.out.println("phone Number" +pNum);
	}
	
	
}
