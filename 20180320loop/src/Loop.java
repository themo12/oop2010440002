
public class Loop {

	public static void main(String[] args) {
//		// 1~10 ������ ȭ�鿡 ���(for��)
//		int i; // i�� ��������
//		for (i=1; i<=10; i++) { // 1.���� ���� �ʱ�ȭ, 2.���� ���ǽ�, 4.�������� ��ȭ
//			System.out.println(i); // 3.������
//		}
		
//		// 1~10 ������ ȭ�鿡 ���(while��)
//		int i; // i�� ��������
//		i = 1; // 1.�������� �ʱ�ȭ
//		while (i<=10) { // 2.���� ���ǽ�
//			System.out.println(i); // 3.������
//			i++; // 4.���� ���� ��ȭ
//		}
		
//		// 1~10 ������ �� ���ϱ� (while��)
//		int i, sum; // i, sum�� ��������
//		i = 1; sum = 0; // 1.�������� �ʱ�ȭ
//		while (i<=10) { // 2.���� ���ǽ�
//			sum = sum + i; // 3.������
//			i++; // 4.���� ���� ��ȭ
//		}
		
		// 1~10 ������ �� ���ϱ� (for��)
		int i;
		int sum = 0; // i, sum�� ��������
		for (i=1; i<=10; i++) { // 1.�������� �ʱ�ȭ, 2.���� ���ǽ�, 4.���� ���� ��ȭ
			sum = sum + i; // 3.������
		}
		
		System.out.println("sum = " + sum);
		
		// ���忡�� 1�� ���� ���ϱ�
		String str = "hello darkness my old friend";
		int count = 0;
		for (i=0; i < str.length(); i++) { // C������ �޸� JAVA������ str�� object(��ü), ���� ()�ȿ� ���� �ȳ־���.
			if (str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("���忡�� �߰��� l�� ������ " + count + "��");
		System.out.println("==============���α׷� ����==============");
	}
}
