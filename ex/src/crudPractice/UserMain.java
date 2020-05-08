package crudPractice;

public class UserMain {
	
	public static void main(String[] args) {
		
		UserManager manage = UserManager.getInstance();
		
		System.out.println("회원가입 테스트");
		
		manage.showUserData();
		
		
		System.out.println("---------------------------");
		
		manage.createUser();
		manage.createUser();
		manage.createUser();
		manage.createUser();
		System.out.println("---------------------------");
		
		manage.showUserData();
		System.out.println("----------삭제할 아이디---------------");
		manage.deleteUser();
		System.out.println("-----------수정할 아이디 --------");
		manage.editUser();
		System.out.println("---------------------------");
		manage.showUserData();
		System.out.println("--------------검색할이름-------");
		manage.showInfo();
		
		
		
		
		
				
	}
}
