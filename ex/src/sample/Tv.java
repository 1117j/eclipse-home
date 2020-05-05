package sample;

public class Tv {	

		String color;
		boolean power;
		int channel;
		
		void power() {
			power = !power;   // true면 false로, false면 true로 변경하는 기능
		}
		void chUp(){
			++channel;
		}
		void chDn(){
			--channel;
		}
	}

class CaptionTvTest extends Tv {
	boolean caption;
	
	void displayCaption(String text) {
		if(caption == true) {
			System.out.println(text);
		}
		
	}
	
}