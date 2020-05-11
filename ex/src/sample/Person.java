package sample;

public class Person {
	private int perID;
	private int milID;
	
	public Person(int plD, int mlD) {
		perID = plD;
		milID = mlD;

	}
	public Person(int plD) {
		perID = plD;
		milID=0;
	}
	
	public void showInfo(){
		System.out.println("민번: "+perID);
		if(milID!=0)
		System.out.println("군번: "+milID+'\n');
		else
		System.out.println("군과 관계 없음 \n");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person man=new Person(950123, 880102);
		Person woman=new Person(941125);
		man.showInfo();
		woman.showInfo();
	}

}
