package meoko.object;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import meoko.object.ManagerIF;

public class ManagerOfUser implements ManagerIF{
	
	final ArrayList<Mco> arr; 
	final ArrayList<Mco> res;
	Scanner sc;
	
	// 초기화 생성자
	public ManagerOfUser(){
		// 1. 배열 초기화
		arr = new ArrayList<Mco>();
		res = new ArrayList<Mco>();
		// 2. Scanner 객체 초기화
		sc = new Scanner(System.in);
	}
	
	// index 검색 메소드
	public int searchIndex(String id) {
		int idx=-1;
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).getId()== id) {
				idx = i;
				break;
			}
		}
		return idx;
	}

	// 입력 메소드
	public boolean input(Map<String, String> map) {

		User user = new User();
		// User 정보 입력
		user.set((String)map.get("id"), (String)map.get("name"), (String)map.get("pw"));
		
		// 배열에 추가
		return arr.add(user);
		//HashMap<String, String> map = new HashMap<String, String>();
		//map.put("id", "cool");
		//map.put("name", );
	}
	
	// 수정 메소드
	public boolean modify(Map<String, String> map) {
		boolean bResult = true;
		
		// ArrayList에서 index 검색
		int idx = searchIndex((String)map.get("id"));
		
		if(idx>0) {
			// User 객체 인스턴스 생성 및 정보 입력
			User user = new User();
			user.set((String)map.get("id"), (String)map.get("name"), (String)map.get("pw"));
			
			// 기존 객체 삭제 및 동일 index에 수정된 객체 덮어쓰기
			arr.remove(idx);
			arr.add(idx, user);
		}
		else
			bResult = false;
		
		return bResult;
	}

	// 삭제 메소드
	public boolean delete(Map<String, String> map) {
		boolean bResult = true;
	
		// ArrayList에서 id로 index 검색
		int idx = searchIndex((String)map.get("id"));
		
		if(idx>0) {
			// 삭제
			arr.remove(idx);
		}
		else
			bResult = false;
		
		return bResult;
	}
	
	// 검색 메소드 : 객체 반환
	public ArrayList<Mco> search(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).getId()== (String)map.get("id")) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
	
	public ArrayList<Mco> searchName(Map<String, String> map) {
		res.clear();
		
		for(int i=0; i<arr.size(); i++) {
			if(((User)arr.get(i)).getId()== (String)map.get("name")) {
				res.add(arr.get(i));
			}
		}
		
		return res;
	}
}
