
public class Three {

	public static void main(String[] args) {
		System.out.println("3�� ����");
		// 3. 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(while�� ���)

		int x = 1; // ���� ���� �� �ʱ�ȭ
		int y = 0; // ���� ���� �� �ʱ�ȭ
		
		while (x <= 100) {
			if (x % 3 == 0) {
				y = y + x;
				x++;
			}
			else
				x++;
		}
		
		System.out.println(y);
		
		System.out.println("==============���α׷� ����==============");
	}

}
