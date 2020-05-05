 package sample;




public class TvTest{
	public static void main(String[]args) {
		
		CaptionTvTest ctv = new CaptionTvTest();
		ctv.channel = 10;
		ctv.chUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello World");
		ctv.caption = true;
		ctv.displayCaption("HEllooooooo");
		}
	}
