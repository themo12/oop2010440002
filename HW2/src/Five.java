
public class Five {

	public static void main(String[] args) {
		System.out.println("5�� ����");
		// 5. 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(do-while�� ���)


		int x = 1; // ���� ���� �� �ʱ�ȭ
		int y = 0; // ���� ���� �� �ʱ�ȭ
		
		do {
			if (x % 3 == 0) {
				y = y + x;
				x++;
			}
			else
				x++;
		} while (x <= 100);
			
		System.out.println(y);
		
		System.out.println("==============���α׷� ����==============");
	}

}