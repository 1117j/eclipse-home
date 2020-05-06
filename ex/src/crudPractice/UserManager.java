package crudPractice;

import java.util.Scanner;

import crudPractice.StringEmptyException;

public class UserManager {
	
	//유저매니저 접근제어
	private static UserManager manage = new UserManager(100);
	
	public static UserManager getInstance() {
		return manage;
	}
	
	
	Scanner kb;

	User[] userInfo; //배열생성
	int numOfUser; 
	
	UserManager(int num) {
		userInfo = new User[num];   
		numOfUser =0;
		kb = new Scanner(System.in);
	}
	

	void addUser(User info) {		//배열에 정보를 저장하기 void 유저저장기능이름 (배열이름 ??)
		userInfo[numOfUser] = info;
		numOfUser++;
	}

	
	
	//1. 사용자로 부터 받은 데이터로 인스턴스 생성
	//유저의 기능
	void createUser() {
		
		String select;
		
		
		select = kb.nextLine();	//사용자 선택 번호
		
		String id = null,name =null,pw = null; //초기화인가?
		
		User info = null;
		//기본정보 수집하기 
		while(true) {
		System.out.println("1. 이름: ");
		name = kb.nextLine();
		
		System.out.println("2. 아이디: ");
		id = kb.nextLine();
		
		System.out.println("3. 패스워드: ");
		pw = kb.nextLine();
		
		try {
			if (name.trim().isEmpty() || id.trim().isEmpty() || pw.trim().isEmpty()) {
				StringEmptyException e = new StringEmptyException();
				throw e;
			}
		} catch (StringEmptyException e) {
			System.out.println("기본정보는 공백없이 입력하세요.");
			continue;
		}
		break;
		}
		
			addUser(info);
		
	}
	
/*	//배열 인덱스 검색(네임 기준 )
	int searchIndex(String name) {
		int searchIndex = -1;
		for (int i = 0; i < numOfUser; i++) {
			if (userInfo[i].name.equals(name)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;
	}
	
	
	void showInfo() {
		System.out.println("검색하실 이름을 입력하세요");
		String name = kb.nextLine();
		int index = searchIndex(name);
		if (index < 0) {
			System.out.println("검색한 이름의 정보가 없습니다");
		} else {
			System.out.println("---------------");
			userInfo[index].showUserInfo();
			System.out.println("---------------");
		}

	} */
	
	
	void editUser() {
		
		System.out.println("회원 정보 수정");
		
		System.out.println("이름 : ");
		String name = kb.nextLine();
		String editname = name;
		
		System.out.println("2. 아이디: ");
		String id = kb.nextLine();
		
		System.out.println("3. 패스워드: ");
		String pw = kb.nextLine();
		
	}
	
	
	void updateUser() {
		
	}
	
	void deleteUser() {
		
	}
	

	
	
	
	
	

}
