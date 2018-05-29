import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>(); // 이것도 일종의 Upcasting
//		LinkedList<String> list = new LinkedList<String>(); // 이렇게 해도 똑같지만 LinkedList의 고유한 method를 써야하는 경우가 아니면 위처럼
//		List<String> list = new ArrayList<String>(); // 위의 LinkedList와 알고리즘이 다를 뿐 결과는 똑같다
		list.add(0, "zero");
		list.add("one"); // index 지정안해주면 끝에 붙음
		list.add("two");
		
		System.out.println(list);
		
		list.add(1, "돌");
		
		System.out.println(list);

	}

}
