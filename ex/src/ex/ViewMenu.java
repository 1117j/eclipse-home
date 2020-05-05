package ex;

public class ViewMenu {
	
		//1 첫 화면(로그인/회원가입)
		static void menuN1() {		
			System.out.println("===================");
			System.out.println("메뉴");
			System.out.println("===================");
			System.out.println("1. "+NamedIF.LOG_IN);	//1.로그인 
			System.out.println("2. "+NamedIF.SIGN_UP);	//2.회원가입
		}
		
		//1.1 로그인 화면(아이디/패스워드)
		static void menuN11() {	
			
			System.out.println("===================");
			System.out.println(NamedIF.MENU+">"+NamedIF.LOG_IN);
			System.out.println("===================");
			System.out.println(NamedIF.ID+" : ");
			System.out.println(NamedIF.PW+" : ");
		}
		
		//1.1.1 메뉴_로그인_실패
		static void menuN111 () {
			System.out.println("=========================================");
			System.out.println("로그인에 실패하였습니다. 메뉴화면으로 돌아가시겠습니까?"); 
			System.out.println("=========================================");
			System.out.println("1. "+NamedIF.YES);	//1.YES 
			System.out.println("2. "+NamedIF.NO);	//2.NO
		}
		
		//1.2 메뉴_회원가입 
		static void menuN12 () {		
			System.out.println("===================");
			System.out.println("회원가입");
			System.out.println("===================");
			System.out.println(NamedIF.NAME+" : ");
			System.out.println(NamedIF.ID+ " : ");
			System.out.println(NamedIF.PW+" : ");

		//수정: 이미 존재하는 아이디입니다 (menuN121)
		}
	
		//2 로그인 완료 
		static void menuN2() {
			System.out.println("===================");
			System.out.println("WELCOME! :)");
			System.out.println("===================");
			System.out.println("1. "+NamedIF.MENU);	//1.목록보기 
			System.out.println("2. "+NamedIF.NEW);	//2.글쓰기
			System.out.println("3. "+NamedIF.MY_POST);	//3.내가 쓴 글 보기
			System.out.println("4. "+NamedIF.MY_ACCT);	//4.회원정보 보기
			
		}
		
		//2.1 로그인 완료_목록보기(신규회원 DEFAULT)
		static void menuN21() {
			System.out.println("==============================");
			System.out.println("게시글 1개 이상 작성 시 조회가 가능합니다.");
			System.out.println("==============================");
		}

		//2.2 로그인_완료_글쓰기 ->  3.1 글쓰기화면으로 이동
		
		//2.3 로그인_완료_내가쓴글보기(순서대로출력)
		static void menuN23() {
			System.out.println("==============================");
			System.out.println("내가 쓴 글 목록화면(1/10)");
			System.out.println("==============================");
		}
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		