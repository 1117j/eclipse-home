package sample;

public class ParameterTest2 {

	public static void main(String[] args) {
		//참조형 매개변수 테스트
		
		Data d = new Data();
		
		d.x = 10;
		System.out.println("참조형 1 : "+ d.x );
		
		
		change(d);
		System.out.println("참조형 2 ㅣ "+ d.x );
		

	}
	
	static void change(Data d) {  	// 매개변수를 참조형으로 지정해본다
		
		d.x = 1000;
		System.out.println("참조형 매갭변수 연습입니다" + d.x);
		
	}
}
