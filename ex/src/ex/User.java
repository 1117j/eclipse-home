package ex;

public class User extends Mco{
	
		String name;			// USER 이름
		String passWord;		// USER 비밀번호
		int countOfPost;		// USER 포스팅수
		
		public User(String id, String name, String passWord, int countOfPost) {
			this.name = name;
			this.passWord = passWord;
			this.countOfPost = countOfPost;
		}
	
		@Override
		public String get(String id) {
			return get(id);
		}	

		@Override
		public void set(String id) {
			super.set(id);
		}

		@Override
		public void view() {
			super.view();
		}
		
} 
		
		 

		

