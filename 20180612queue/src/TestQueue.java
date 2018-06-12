import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
//		Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); // ���ĺ� ������ �����
		strs.add("trump"); // Queue �� ���� ��Ҹ� �߰�
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");

		while (!strs.isEmpty()) {
			System.out.println(strs.remove()); // remove() : Queue �� �տ��� ��Ҹ� �����Ͽ� �� ��Ҹ� ��ȯ
			Thread.sleep(2000); // �� 2�� ��ٷ�!!
		}
	}

}
