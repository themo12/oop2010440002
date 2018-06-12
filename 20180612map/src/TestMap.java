import java.util.*;

public class TestMap {

	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<>();
//		Map<String, String> map = new TreeMap<>(); // key의 알파벳 순으로 정렬
		Map<String, String> map = new LinkedHashMap<>();
		// put(key, value) : 추가
		// get(key) : key 값에 해당하는 value 찾기

		map.put("재이니", "청아대");
		map.put("트럼프", "배각관");
		map.put("정으니", "피양");
		
		System.out.println(map.get("재이니"));
		
		// 훑는 방법1 : keySet을 만들어 이 keySet의  iterator 사용
//		Iterator<String> itr = map.keySet().iterator(); // 이 한줄을 두줄로 나눠 쓰면 18,19번째 줄
		Set<String> set = map.keySet(); // map에 저장된 엔트리(키,값)중 key만 뽑아서 하나의 set을 리턴
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
		}
		
		// 훑는 방법2 : keySet을 만들어 for() 반복문 사용
		for (String key : map.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
		}
		
		// 훑는 방법3 : entry set을 만드는 방법
		for (Map.Entry<String, String> elem : map.entrySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", elem.getKey(), elem.getValue()));
		}
	}

}
