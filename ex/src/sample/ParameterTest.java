package sample;

public class ParameterTest {

	public static void main(String[] args) {
		// 기본형 매개변수 테스트(read only) 
		
		Data d = new Data();
		d.x = 10;
		System.out.println("기본형 매개변수 테스트 1입니다. "+  d.x);
		
		change(d.x);
		
		System.out.println("기본형 매개변수 테스트: " + d.x);
		

	}
	
	static void change(int x) {//기본형 매개변수 
		x = 1000;
		System.out.println(x);
		
	}
	
}


class Data{
	
	int x;
}
