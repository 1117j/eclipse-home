package meoko.object;

//Mco를 상속
public class Purchase extends Mco{
	
	private String userid;
	private String storeid;
	private String menuid;
	private int grade;
		
	public void set(String id,String userid,String storeid,String menuid,int grade) {
		super.set(id);
		this.userid=userid;
		this.storeid=storeid;
		this.menuid=menuid;
		this.grade=grade;
				
	}
		
	public void get(String id,String userid,String storeid,String menuid,int grade) {
		super.get(id);
		userid=this.userid;
		storeid=this.storeid;
		menuid=this.menuid;
		grade=this.grade;	
	}	

	//useridf를 반환하는 메소드
	public String getUserid() {
		return userid;
	}
	//storeid 를 반환하는 메소드
	public String getStoreid() {
		return storeid;
	}
	//menuid를 반환하는 메소드
	public String getMenuid() {
		return menuid;
	}
	//평점을 반환하는 메소드
	public int getGrade() {
		return grade;
	}
}



