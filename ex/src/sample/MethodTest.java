package sample;

public class MethodTest {

	public static void thisistestmethod() {
		int sum=1;
		
		for(int i = 1; i< 10; i++) {
			sum += i;
			sum++;
			System.out.println(i);
			System.out.println(sum+"+"+ (i-1)+   "=" + sum);
			System.out.println(sum);
			System.out.println();
		System.out.println("--------------------");
		}
	
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		thisistestmethod();

	}

}
