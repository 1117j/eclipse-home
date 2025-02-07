package phonebookver06;

import java.util.InputMismatchException;

public class PhoneMain {

	public static void main(String[] args) {
		
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		while(true) {
			
			Menu.showMenu();
			
			int select = 0;
			try {
				select = manager.sc.nextInt();
				// 정상범위 1~6, MenuNum Create ~ Exit
				if(!(select >=MenuNum.CREATE && select <= MenuNum.EXIT)) {
					BadNumberException e = new BadNumberException("잘못된 입력입니다. \n 확인 후 다시입력해주세요 ");
					throw e;}
				}catch (InputMismatchException e) {
					System.out.println("잘못된 메뉴입력입니다. \n확인 후 다시입력해주세요.");
					continue;
				}catch (BadNumberException e) {
					System.out.println("메뉴범위를 벗어난 숫자입니다. \n 확인 후 다시입력해주세요.");
					continue;
				}catch (Exception e) {
					System.out.println("잘못된 메뉴입력입니다.");
					continue;
				}
				finally {
					manager.sc.nextLine();
				}
				
				switch(select) {
				case MenuNum.CREATE:
					manager.createInfo();
					break;
					
				case MenuNum.SEARCH:
					manager.showInfo();
					break;
				
				case MenuNum.DELETE:
					manager.deleteInfo();
					break;
				
				case MenuNum.EDIT:
					manager.editInfo();
					break;
				
				case MenuNum.SHOW_ALL:
					manager.showAllInfo();
					break;
					
				case MenuNum.EXIT:
					break;
			}
		}
	}
	
}
