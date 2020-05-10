package meoko.object;

public class Menu extends Mco {

	//메뉴이름, 가게id, 가격정보 
	private String name;
	private String storeid;
	private int price;
		
	public void set(String id,String name,String storeid,int price) {
		super.set(id);
		this.name=name;
		this.storeid=storeid;
		this.price=price;		
	}
	
	public void get(String id,String name,String storeid,int price) {
		super.get(id);
		name = this.name;
		storeid=this.storeid;
		price=this.price;		
	}
	
	public String getName() {
		return name;
	}
	public String getStoreid() {
		return storeid;
	}
	public int getPrice() {
		return price;
	}

}
