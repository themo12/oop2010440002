import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		System.out.println("1�� ����");
		// 1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b; // �ΰ��� ���� �Է��� ���� ����
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		b = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if (a>b) // a�� b���� ũ��
			System.out.println("ū ���� " + a + "�Դϴ�.");
		else if (b>a) // b�� a���� ũ��
			System.out.println("ū ���� " + b + "�Դϴ�.");
		else
			System.out.println("�� ���� �����ϴ�.");
		
		System.out.println("==============���α׷� ����==============");
	
	}

}
