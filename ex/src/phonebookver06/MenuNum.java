package phonebookver06;

public interface MenuNum {
	
	//메인메뉴(생성, 검색, 삭제, 수정, 전체보기, 나가기)
	//상수로 표현하여 가독성을 높임
	final static int CREATE = 1;
	final static int SEARCH = 2;
	final static int DELETE = 3;
	final static int EDIT = 4;
	final static int SHOW_ALL = 5;
	final static int EXIT = 6;
	
		
	//분기 메뉴(대학/회사/동호회)
	final static int UNIV = 1;
	final static int COMPANY = 2;
	final static int CAFE = 3;
}
