package meoko.object;

//상속을 통해 연관된 클래스들에 대한 공통적인 규약을 정의하고 적용한다.
public abstract class Mco {
	

	String id;
	
	//id 가져오기 
	public void get(String id) {
		this.id = id;
		
	}
	 
	//id 입력
	public void set(String id) {
		id = this.id;
	}
	
	//id 반환 메서드 
	public String getId() {
		return this.id;
	}
}
