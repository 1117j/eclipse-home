package ex;

public class Menu extends Store {
	
	String menuName;
	String storeId;
	int price;
	
	public void view() {
		
	}

	public void set(String id, String menuName, String storeId, int price) {
		super.set(id);
		this.menuName = menuName;
		this.storeId = storeId;
		this.price = price;

	}
		
	
	public void get(String id, String menuName, String storeId, int price) {
		super.set(id);
		this.menuName = menuName;
		this.storeId = storeId;
		this.price = price;

	}

}

