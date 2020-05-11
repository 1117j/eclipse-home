package phonebookver06;

public class PhoneCompanyInfo extends PhoneInfo{
	
	//회사, 부서, 직급
	String company;
	String dept;
	String job;
	
	public PhoneCompanyInfo(String name, String phoneNum, String addr, String email,
							String company, String dept, String job) {
		super(name, phoneNum, addr, email);
		this.company = company;
		this.dept = dept;
		this.job = job;
	}

	@Override
	public void showAllInfo() {
		super.showAllInfo();
		System.out.println("회사이름 :" + this.company);
		System.out.println("부서이름 :" + this.dept);
		System.out.println("직급:" + this.job);
	}
	
}
