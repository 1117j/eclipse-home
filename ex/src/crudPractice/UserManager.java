package crudPractice;

import java.util.ArrayList;
import java.util.Scanner;

import crudPractice.StringEmptyException;

public class UserManager {
	

	
	//리스트배열 
	 ArrayList<User> userinfo;
	 Scanner kb;
	
	 private UserManager(int num) {
	
		 userinfo = new ArrayList<>();
		 kb = new Scanner(System.in);
	}
	
	
	
	//리스트 배열을 선언해보자 
	
//	UserManager(){
//		userinfo = new ArrayList<>();		
//	}
//	
	
	//싱글톤 패턴//유저매니저
	private static UserManager manage = new UserManager(200);
	
	public static UserManager getInstance() {
		return manage;
	}
		
	   void addInfo(User info) {
		   userinfo.add(info);
	   }

	
	//1, 유저 생성 메소드 
	 	void createUser() {
		//-> 객체를 저장할 info 변수와 입력받을 문자열 저장할 변수 초기화해주기
	
		String id = null, name = null, pw = null;
		int pNum = 0;
		
		System.out.println("1. 이름: ");
		name = kb.nextLine();
		System.out.println("2. 아이디: ");
		id = kb.nextLine();
		System.out.println("3. 패스워드: ");
		pw = kb.nextLine();
	
		User info = new User(id, name, pw, pNum);	
		
		userinfo.add(info);
	
	}
	
	
	void showUserData() {
		System.out.println("당신의 정보를 출력합니다.");
		for(int i = 0 ; i < userinfo.size(); i++) {
			userinfo.get(i).showUserInfo();
			System.out.println("-----------------------");
		}
		
	}
	
	//배열 인덱스 검색(네임 기준 )
	int searchIndex(String id) {
		//정상적인 인덱스 값은 0이상의 값, 찾지 못하였을 때 구분값 -1을 사용한다. 
		int searchIndex = -1;
		
		for (int i = 0; i < userinfo.size(); i++) {
			if (userinfo.get(i).id.equals(id)) {
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
			userinfo.get(index).showUserInfo();
			System.out.println("---------------");
		}

	} 
	
	
	
	  void editUser() {
		  System.out.println("수정합니다.");
		  System.out.println("아이디를 입력해주세요");
		  String id = kb.nextLine();
		  
		  int index = searchIndex(id);
		  
		  
		  userinfo.get(index);
		  String name = null, pw = null;
		  int cP = 0;
		  System.out.println("이름을 수정하세요");
		  name = kb.nextLine();
		  System.out.println("비번을 수정하세요.");
		  pw = kb.nextLine();  
		  
		  User info = new User(id, name, pw, cP);
		  userinfo.remove(index);
		  userinfo.add(index, info);
		  
	  }

	 
	
	
	 void deleteUser() {

		String id;
		id = kb.nextLine();
		int index = searchIndex(id);
		
		userinfo.get(index)	;
	
		if(index < 0) {
			System.out.println("삭제하려는 아이디는 없어요");
		}else {
			System.out.println("삭제합니다. ");
		
			
			userinfo.remove(index);
		}
		
		
		
	}
	

	
	
	
	

}
