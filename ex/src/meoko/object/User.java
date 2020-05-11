package meoko.object;

public class User extends Mco{
	
	//User객체(이름/패스워드/포스트개수)
	private String name;
	private String pw;
	private int countOfPost;
	
	//생성자
	public User() {
		this.countOfPost = 0;
	}
	
	public void set(String id, String name, String pw) {
		super.set(id);
		this.name = name;
		this.pw = pw;
	}
	
	public void setCountOfPost(int countOfPost) {
		this.countOfPost = countOfPost;
	}

	//countOfPost 수를 반환 메서드
	public int getCountOfPost() {
		return this.countOfPost;
	}
	
	
}
