package ex;

public class Purchase extends Mco {
	
	String userId, menuId, opinion;
	int grade;
	
	public void view() {
		
	}

	public void set(String id, String userId, String menuId, int grade, String opinion) {
		super.set(id);
		this.userId = userId;
		this.menuId = menuId;
		this.grade = grade;
		this.opinion = opinion;
	}
		
	public void get(String id, String userId, String menuId, int grade, String opinion) {
		super.set(id);
		this.userId = userId;
		this.menuId = menuId;
		this.grade = grade;
		this.opinion = opinion;
	}
	
}
