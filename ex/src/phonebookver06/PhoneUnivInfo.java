package phonebookver06;

public class PhoneUnivInfo extends PhoneInfo implements Info {
	
	//학과, 학년
	String major;
	String grade;
	
	public PhoneUnivInfo(String name, String phoneNum, String addr, String email,
						String major, String grade) {
		super(name, phoneNum, addr, email);
		this.major = major;
		this.grade = grade;
	}

	@Override
	public void showAllInfo() {
		super.showAllInfo();
		System.out.println("학과: " + this.major);
		System.out.println("학년: " + this.grade);
	}
}


