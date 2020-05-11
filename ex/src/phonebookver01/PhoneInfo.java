package phonebookver01;

public class PhoneInfo {
	
	String name;
	String phoneNum;
	String bday; 
	
	//초기화를 위한 생성자
	PhoneInfo(String name, String phoneNum, String bday){
		this.name = name;	// 지역변수를 받아서 초기화
		this.phoneNum = phoneNum;
		this.bday = bday;
	}
	
	PhoneInfo(String name, String phoneNum){
		this.name = name;
		this.phoneNum = phoneNum;
		this.bday = null;
		
		System.out.println("생일은 입려값이 없습니다.");
	}
	
	
	
	void view() {
		System.out.println("이름 ");
		System.out.println(name);
		System.out.println("핸드폰번호");
		System.out.println(phoneNum);
		System.out.println("생년월일 ");
		System.out.println(bday);
	}

}


