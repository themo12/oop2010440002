import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>(); // �̰͵� ������ Upcasting
//		LinkedList<String> list = new LinkedList<String>(); // �̷��� �ص� �Ȱ����� LinkedList�� ������ method�� ����ϴ� ��찡 �ƴϸ� ��ó��
//		List<String> list = new ArrayList<String>(); // ���� LinkedList�� �˰����� �ٸ� �� ����� �Ȱ���
		list.add(0, "zero");
		list.add("one"); // index ���������ָ� ���� ����
		list.add("two");
		
		System.out.println(list);
		
		list.add(1, "��");
		
		System.out.println(list);

	}

}
