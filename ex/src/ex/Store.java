package ex;

public class Store extends Mco{
	
	public String storeName;
	public String storePhoneNum;
	public int distance;
	public String storeType;
	
	public void view() {
		
	}

	public void set(String id, String storeName, String storePhoneNum, int distance, String storeType) {
		super.set(id);
		this.storeName = storeName;
		this.storePhoneNum = storePhoneNum;
		this.distance = distance;
		this.storeType = storeType;
	}
		
	
	public void get(String id, String storeName, String storePhoneNum, int distance, String storeType) {
		super.set(id);
		this.storeName = storeName;
		this.storePhoneNum = storePhoneNum;
		this.distance = distance;
		this.storeType = storeType;
	}

}


	
	
	
	
