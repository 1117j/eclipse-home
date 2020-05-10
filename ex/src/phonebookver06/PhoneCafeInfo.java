package phonebookver06;

public class PhoneCafeInfo extends PhoneInfo implements Info{

	String cafeName;
	String nickName;
	
	public PhoneCafeInfo(String name, String phoneNum, String addr, 
			String email, String cafeName, String nickName) {
		super(name, phoneNum, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	@Override
	public void showAllInfo() {
		super.showAllInfo();
		System.out.println("동호회 이름: " + this.cafeName);
		System.out.println("닉네임: "+ this.nickName);
	}
	
}
