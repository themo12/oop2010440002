import java.util.*;

public class Sweep {

	public static void main(String[] args) {
//		Set<String> strs = new HashSet<>(); // HashSet : �ؽ��Լ� ������ ����(��, ������ �� �� ����)
//		Set<String> strs = new TreeSet<>(); // TreeSet : ���ĺ� ������ ���ĵǾ� ����
		Set<String> strs = new LinkedHashSet<>(); // LinkedHashSet : ���ҵ��� ������ ���Ե� ������ ����.
		// �⺻�� �޼ҵ� add(), remove(), sweep() ....
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		// ù��° �ȴ� ��� : iterator ���
		Iterator<String> e = strs.iterator(); // strs set�� �ȱ� ���� iterator�� e�� ����
		while(e.hasNext()) { // ������ �ȴ�. hasNext() : ���� �湮���� ���� ���Ұ� ������ true ��ȯ
			String str = e.next(); // �ϳ��� ������. next() : ���� ���Ҹ� ��ȯ
			System.out.println(str);
		}
		
		// �ι�° �ȴ� ��� : for() �ݺ��� ���
		for (String str : strs) { // for (���Ÿ�� + �������� : �÷��� ����) �÷��� ������ �ϳ��� ���������� ���� 
			System.out.println(str);
		}
	}

}
