package crudPractice;

public class User {
	
	//유저객체의 변수 만들기
	String id;
	String name;
	String pw;
	int countOfPost;
	
	
	User(String id, String name, String pw, int countOfPost){
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.countOfPost = countOfPost;
	}
	
	
	
	//보여주기 
	public void showUserInfo() {
		System.out.println("User ID: "+id);
		System.out.println("User Name: " +name);
		System.out.println("User PW: " + pw);
		System.out.println("현재 포스팅 개수: " + countOfPost);	
	}
	
	
	
	
	
	
	
	
}	
	
	
/*
	public void view() {
		
	}
	
	public void set(String id,String name,String pw,int countOfPost) {
		this.id = id;
		this.name=name;
		this.pw=pw;
		this.countOfPost=countOfPost;		
	}
	
	public void get(String id,String name,String pw,int countOfPost) {
		id = this.id;
		name = this.name;
		pw = this.pw;
		countOfPost = this.countOfPost;		
	}
}

	
	*/