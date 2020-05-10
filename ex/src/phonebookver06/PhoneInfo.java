package phonebookver06;

public abstract class PhoneInfo implements Info {
	
	//이름, 전화번호, 주소, 이메일
	String name;
	String phoneNum;
	String addr;
	String email;
	
	
	public PhoneInfo(String name, String phoneNum, String addr, String email) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
		this.email = email;
	}
	
	//전체정보출력
	public void showAllInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호: " + this.phoneNum  );
		System.out.println("주소 : " + this.addr);
		System.out.println("이메일: " + this.email);

	//name 속성 값과 전달받은 문자열을 비교하여 반환
	}
	
	 boolean checkName(String name){
		 return this.name.equals(name);
	 }

}
