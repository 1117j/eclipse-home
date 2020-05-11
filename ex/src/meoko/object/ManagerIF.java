package meoko.object;

import java.util.ArrayList;
import java.util.Map;

//인터페이스: 실제 구현된 것이 없는 기본 설계도 
//추상메서드와 상수만으르 멤버로 가질 수 있으며, 인스턴스 생성이 불가.
//사용이유: 미리 정해진 규칙에 맞게 구현하도록 표준을 제시, 클래스 작성에 도움을 줄 목적으로 사용됨

public interface ManagerIF{
	//입력, 수정, 삭제 
	boolean input(Map<String, String> map);
	boolean modify(Map<String, String> map);
	boolean delete(Map<String, String> map);
	ArrayList<Mco> search(Map<String, String> map);
	
}

