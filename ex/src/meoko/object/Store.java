package meoko.object;

public class Store extends Mco {
	
	private String name;
	private String phoneNumber;
	private double distance;
	private String type;

	public void set(String id,String name,String phoneNumber,double distance,String type) {
		super.set(id);
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.distance=distance;
		this.type=type;		
	}
	
	public void get(String id,String name,String phoneNumber,double distance,String type) {
		super.get(id);
		name = this.name;
		phoneNumber = this.phoneNumber;
		distance=this.distance;
		type=this.type;		
	}

	//이름반환 메소드
	public String getName() {
		return name;
	}
	//가게번호 반환하는 메소드
	public String getPhoneNumber() {
		return phoneNumber;
	}
	//거리를 반환하는 메소드
	public double getDistance() {
		return distance;
	}
	//업종을 반환하는 메소드
	public String getType() {
		return type;
	}
}
