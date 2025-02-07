package phonebookver06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import phonebookver06.BadNumberException;
import phonebookver06.StringEmptyException;

public class PhoneBookManager {

	//PhoneBookManager class 싱글톤 패턴 처리 
	private static PhoneBookManager manager = new PhoneBookManager();

	static PhoneBookManager getInstance() {
		return manager;
	}

	//배열생성(ArrayList)
	final ArrayList<PhoneInfo> pBook;	
	Scanner sc;
	
	public PhoneBookManager() {
		
		pBook = new ArrayList<PhoneInfo>();
		sc = new Scanner(System.in);
	}
	
	//배열에 정보저장
	//1. 배열에 정보를 추가하기 
	private void addInfo(PhoneInfo info) {
		pBook.add(info);
	}
	
	//사용자 요청에 맞는 인스턴스 생성
	//2.저장: 이름, 전화번호, 주소, 이메일 , 타입에 따른 추가정보를 저장
	 public void createInfo() {
		 //객체를 저장할 info변수와 입력받은 문자열을 저장할 4가지 변수를 초기화
		 
		 int select = 0; //사용자 선택 번호
		 
		 while(true) {
			 System.out.println("1. 대학  2.회사  3.동호회");
			 System.out.println("해당 번호를 입력해주세요.");
			 
			//예외처리 
			try { 
				select = sc.nextInt();
				
				if(!(select>=1 && select <=3)) {  		//정상범위 1~3안에 들지 않는다면
					
					BadNumberException e = new BadNumberException("잘못된 번호를 입력하였습니다.");
					
					throw e;
				}	
			}catch (NumberFormatException e) {
				e.printStackTrace();
			}catch (InputMismatchException e) {
				System.out.println("잘못된 번호입니다. \n 다시 입력해주세요.");
				//manager.sc.nextLine();
				continue;
			}catch (BadNumberException e) {
				System.out.println("메뉴법위를 벗어난 숫자입니다. \n 확인 후 다시입력해주세요.");
				continue;
			}catch (Exception e) {
				System.out.println("잘못된 번호를 입력하였습니다.");
				continue;
		 } finally {
			 sc.nextLine();
		 }
			break;
		 }
		 
		 PhoneInfo info = null;
		 String name = null, phoneNum = null, addr= null, email = null;
		 
		 //기본정보(이름, 전화번호, 주소, 이메일)
		 
		 while(true) {
			 System.out.println("이름을 입력해주세요.");
			 name = sc.nextLine();
			 System.out.println("전화번호를 입력해주세요.");
			 phoneNum = sc.nextLine();
			 System.out.println("주소를 입력해주세요.");
			 addr = sc.nextLine();
			 System.out.println("이메일을 입력해주세요");
			 email = sc.nextLine();
			 
			try {
				if (name.trim().isEmpty()||
						phoneNum.trim().isEmpty()||
						addr.trim().isEmpty()||
						email.trim().isEmpty()) {
				StringEmptyException e = new StringEmptyException();
				
				throw e;
				}
			}catch (StringEmptyException e) {
				System.out.println("기본정보에 공백이 있습니다.");
				System.out.println("공백없이 다시 입력해주세요.");
				continue;
				
			}
			break;
		 }
		 switch(select) {
		 
		 case MenuNum.UNIV:
			 System.out.println("전공(학과)를 입력하세요.");
			 String major = sc.nextLine();
			 System.out.println("학년(학번)을 입력하세요.");
			 String grade = sc.nextLine();
			 //대학 클래스로 인스턴스 생성 
			 info = new PhoneUnivInfo(name, phoneNum, addr, email, major, grade);
			 break;
			 			 
		 case MenuNum.COMPANY:
			 System.out.println("회사의 이름을 입력하세요");
			 String company = sc.nextLine();
			 System.out.println("부서의 이름을 입력하세요");
			 String dept = sc.nextLine();
			 System.out.println("직급을 입력하세요.");
			 String job = sc.nextLine();
			 //회사 클래스로 인스턴스 생성
			 info = new PhoneCompanyInfo(name, phoneNum, addr, email, company, dept, job);
			 break;
			 
		 case MenuNum.CAFE:
			 System.out.println("동호회 이름을 입력하세요.");
			 String cafeName = sc.nextLine();
			 System.out.println("닉네임을 입력하세요.");
			 String nickName = sc.nextLine();
			 //동호회 클래스로 인스턴스 생성
			 info = new PhoneCafeInfo(name, phoneNum, addr, email, cafeName, nickName);
			 break;
		 }//생성된 인스턴스를 배열에 저장
		 
		 pBook.add(info);
	 	}
	 
	 	//배열의 데이터를 출력
	 	void showAllInfo() {
	 		System.out.println("=====전체 정보출력=====");
	 		for(int i = 0; i < pBook.size(); i++) {
	 			pBook.get(i).showAllInfo();
	 			System.out.println("=====================");
	 		}
	 	}
	 	
	 	//배열의 정보 검색: 이름 기준으로 
	 	int searchIndex(String name) {
	 	
	 	int searchIndex = -1;    //정상적인 인덱스값은 0 이상의 갑승로, 찾지 못할 때 구분값 -1 사용
	 	
	 	//배열의 반복으로 이름값을 비교하여 인덱스 값 찾기
	 	for (int i = 0; i < pBook.size(); i++) {
	 		if(pBook.get(i).name.equals(name)) {
	 			searchIndex =  i;
	 			break;
	 		}
	 		
	 	}
	 	return searchIndex;
	 	}
	 	
	 	void showInfo() {
	 		System.out.println("검색하실 이름을 입력하세요.");
	 		String name = sc.nextLine();
	 		
	 		int index = searchIndex(name);
	 		if(index<0) {
	 			System.out.println("검색하신 이름은 없습니다");
	 		}else {
	 			System.out.println();
	 			pBook.get(index).showAllInfo();
	 			System.out.println();
	 			}
	 	}
	 	
	 	//배열의 정보를 이름 기준으로 삭제
	 	void deleteInfo() {
	 		System.out.println("삭제하고자 하는 이름을 입력하세요.");
	 		String name = sc.nextLine();
	 		
	 		int index = searchIndex(name);
	 		if(index<0) {
	 			System.out.println("찾으시는 이름의 정보가 없습니다.");	 
	 		}else {
	 			System.out.println();
	 			pBook.remove(index);
	 		}
	 	}
	 
	 
	 	// 배열의 정보를 이름 기준으로 찾고 수정
	 	void editInfo() {
	 		System.out.println("변경하고자 하는 정보의 이름을 입력하세요.");
	 		String name = sc.nextLine();
	 		
	 		int index = searchIndex(name);
	 		PhoneInfo info = null;
	 		
	 		if (index<0) {
	 			System.out.println("찾으시는 이름은 없는 이름입니다.");
	 		}else {
	 			String editName = pBook.get(index).name;
	 			System.out.println("정보를 수정합니다.");
	 			System.out.println("이름은 "+ editName +" 입니다.");
	 			System.out.println("새로운 전화번호를 입력해주세요.");
	 			String phoneNum = sc.nextLine();
	 			System.out.println("새로운 주소를 입력해주세요.");
	 			String addr = sc.nextLine();
	 			System.out.println("새로운 이메일를 입력해주세요.");
	 			String email = sc.nextLine();
	 			 
	 			//저장된 인스턴스(대학/동호회/카페로 나누기)
	 			if (pBook.get(index) instanceof PhoneUnivInfo) {
	 				System.out.println("새로운 전공을 입력해주세요");
	 				String major = sc.nextLine();
	 				System.out.println("새로운 학년(학번)를 입력해주세요.");
	 				String grade = sc.nextLine();
	 			
	 			info = new PhoneUnivInfo(editName, phoneNum, addr, email, major, grade);
	 			}else if(pBook.get(index) instanceof PhoneCompanyInfo) {
	 				System.out.println("새로운 회사를 입력해주세요");
	 				String company = sc.nextLine();
	 				System.out.println("새로운 부서를 입력해주세요");
	 				String dept = sc.nextLine();
	 				System.out.println("새로운 직급을 입력해주세요");
	 				String job = sc.nextLine();
	 			
	 			info = new PhoneCompanyInfo(editName, phoneNum, addr, email, company, dept, job);
	 			}else if(pBook.get(index) instanceof PhoneCafeInfo) {
	 				System.out.println("새로운 동호회이름을 입력해주세요.");
	 				String cafeName = sc.nextLine();
	 				System.out.println("새로운 닉네임을 입력해주세요.");
	 				String nickName = sc.nextLine();
	 			
	 			info = new PhoneCafeInfo(editName, phoneNum, addr, email, cafeName, nickName);
	 			}
	 			
	 			//배열에 기존데이터 삭제, 새로운 데이터로 저장 
	 			pBook.remove(index);
	 			pBook.add(index, info);
	 			}
	 
		 }		 
		 
	 }

