package phonebookver02;

import java.util.Scanner;

public class PhoneInfo {
	
	String name;
	String pnum;
	String bday;
	
	
	
	PhoneInfo(String name, String pnum, String bday){
		this.name = name;
		this.bday = bday;
		this.pnum = pnum;	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력합니다");
		name = sc.nextLine();
		System.out.println("생년월일을 입력합니다.");
		bday = sc.nextLine();
		System.out.println("번호를 입력합니다.");
		pnum =sc.nextLine();
		sc.close();
		
		
	}
	
	void showInfo() {
		System.out.println(name);
		System.out.println(pnum);
		System.out.println(bday);
	}
	
	

}
