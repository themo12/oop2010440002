import java.util.*;

public class Sweep {

	public static void main(String[] args) {
//		Set<String> strs = new HashSet<>(); // HashSet : 해쉬함수 순서로 저장(즉, 순서를 알 수 없음)
//		Set<String> strs = new TreeSet<>(); // TreeSet : 알파벳 순으로 정렬되어 저장
		Set<String> strs = new LinkedHashSet<>(); // LinkedHashSet : 원소들의 순서는 삽입된 순서와 같다.
		// 기본적 메소드 add(), remove(), sweep() ....
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		// 첫번째 훑는 방법 : iterator 사용
		Iterator<String> e = strs.iterator(); // strs set을 훑기 위한 iterator를 e에 리턴
		while(e.hasNext()) { // 끝까지 훑다. hasNext() : 아직 방문하지 않은 원소가 있으면 true 반환
			String str = e.next(); // 하나식 빼낸다. next() : 다음 원소를 반환
			System.out.println(str);
		}
		
		// 두번째 훑는 방법 : for() 반복문 사용
		for (String str : strs) { // for (요소타입 + 참조변수 : 컬렉션 변수) 컬렉션 변수를 하나씩 참조변수에 대입 
			System.out.println(str);
		}
	}

}
