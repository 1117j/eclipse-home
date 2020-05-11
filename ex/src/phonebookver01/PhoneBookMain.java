package phonebookver01;

public class PhoneBookMain {
	// public class PhoneBookMain(){} // default 생성자 자동생성

	public static void main(String[] args) {
		//void는 리턴 타입으로 리턴값이 없는경우 void를 사용
		//메인메소드 (프로그램의 시작점 역할을 하는 자바의 약속된 내용)
		//  
		
		//new는 생성자를 호출하는 것 
		PhoneInfo abc = new PhoneInfo("JJ","0103404","821117");
		// abc라는 객체 인스턴스를 생성하고 생성자를 호출 
		
		abc.view();
		
		System.out.println("------------------------------------");
		
		abc = new PhoneInfo("cutiepie","0102404");
		
		abc.view();
		

	}
}