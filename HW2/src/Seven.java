import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		System.out.println("7�� ����");
		// 7. 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.

		int x = 1; // ���� ���� �� �ʱ�ȭ
		int y = 0; // ���� ���� �� �ʱ�ȭ
		
		while (x != 0) {
			Scanner input = new Scanner(System.in);
			System.out.print("������ �Է��Ͻÿ� : ");
			x = input.nextInt(); // Ű���忡�� ���� �Է�
			
			y = y + x;
		}	
		System.out.println("�Է��Ͻ� �������� ������ " + y + " �Դϴ�.");
		
		System.out.println("==============���α׷� ����==============");
	}

}