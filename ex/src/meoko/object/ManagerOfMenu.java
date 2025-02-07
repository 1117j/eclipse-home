package meoko.object;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ManagerOfMenu implements ManagerIF {
	
	final ArrayList<Mco> arr;
	final ArrayList<Mco> res;
	Scanner sc;
	
	//초기화 생성자 
	public ManagerOfMenu() {
		arr = new ArrayList<Mco>();
		res = new ArrayList<Mco>();
		sc = new Scanner(System.in);
	}
	
	//index 검색메서드 
	public int searchIndex(String id) {
		int idx = 1;
		for(int i = 0; i< arr.size(); i++) {
						//배열개수
			if(arr.get(i).getId() == id) {
				idx = i;
				break;
			}
		} return idx;
	}

	@Override
	//Map : 인터페이스 HashMap -> key나 값에 null저장 가능
	//사용방법 Map<String, String> map -> put()메서드 이용 key value 넣기, 
	
	public boolean input(Map<String, String> map) {
		Menu menu = new Menu();
		menu.set((String)map.get("id"), (String)map.get("name"), (String)map.get("storeid"), Integer.parseInt((String)map.get("price")));
																								//parseint -> 문자열을 정수로 바꾸는 함수
		return arr.add(menu);
	}

	@Override
	public boolean modify(Map<String, String> map) {
		boolean bResult = true;
		int idx = searchIndex((String)map.get("id"));
								//ArrayList에서 id로 인덱스 검색
		
		if(idx>0) {
			//User객체 인스턴스 생성 및 정보 입력
			Menu menu = new Menu();
			menu.set((String)map.get("id"), (String)map.get("name"), (String)map.get("storeid"), Integer.parseInt((String)map.get("price")));
			
			//기존 객체 삭제, 및 동일 인덱스에 수정된 객체 덮어쓰기
			arr.remove(idx);
			arr.add(idx, menu);
			}
		else 
			bResult = false;
		return bResult;
	}

	@Override
	public boolean delete(Map<String, String> map) {
		boolean bResult = true;
		int idx = searchIndex((String)map.get("id"));
		
		if(idx>0) {
			arr.remove(idx);
		} else 
			bResult = false;
		return bResult;
	}

	@Override
	public ArrayList<Mco> search(Map<String, String> map) {
		res.clear();
		//맵 res에 저장된 모든 객체 제거
		
		 for(int i = 0; i < arr.size(); i++) {
			 if(((Menu)arr.get(i)).getStoreid()==(String)map.get("id")) {
				 res.add(arr.get(i));
			 }
		 }
		return res;
	}

		//금액검색
	public ArrayList<Mco> searchPrice(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((Menu)arr.get(i)).getPrice()== Integer.parseInt((String)map.get("price"))) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
		//이름검색
	public ArrayList<Mco> searchName(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((Menu)arr.get(i)).getName()== (String)map.get("name")) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
		//가게검색
	public ArrayList<Mco> searchStoreid(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((Menu)arr.get(i)).getStoreid()== (String)map.get("storeid")) {
				res.add(arr.get(i));
			}
		}
		return res;
	}
}
	

