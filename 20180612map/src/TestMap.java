import java.util.*;

public class TestMap {

	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<>();
//		Map<String, String> map = new TreeMap<>(); // key�� ���ĺ� ������ ����
		Map<String, String> map = new LinkedHashMap<>();
		// put(key, value) : �߰�
		// get(key) : key ���� �ش��ϴ� value ã��

		map.put("���̴�", "û�ƴ�");
		map.put("Ʈ����", "�谢��");
		map.put("������", "�Ǿ�");
		
		System.out.println(map.get("���̴�"));
		
		// �ȴ� ���1 : keySet�� ����� �� keySet��  iterator ���
//		Iterator<String> itr = map.keySet().iterator(); // �� ������ ���ٷ� ���� ���� 18,19��° ��
		Set<String> set = map.keySet(); // map�� ����� ��Ʈ��(Ű,��)�� key�� �̾Ƽ� �ϳ��� set�� ����
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, map.get(key)));
		}
		
		// �ȴ� ���2 : keySet�� ����� for() �ݺ��� ���
		for (String key : map.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, map.get(key)));
		}
		
		// �ȴ� ���3 : entry set�� ����� ���
		for (Map.Entry<String, String> elem : map.entrySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", elem.getKey(), elem.getValue()));
		}
	}

}
