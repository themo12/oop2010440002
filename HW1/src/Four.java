import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		System.out.println("4�� ����");
		// 4. ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//    (A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		
		int a; // �ϳ��� ���� ���� 
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if (a >= 80) // ������ 80~100�� �̻��̸�
			System.out.println("����� ����� A�Դϴ�.");
		else if(a >= 60) // ������ 60~79���̸�
			System.out.println("����� ����� B�Դϴ�.");
		else if(a >= 40) // ������ 40~59���̸�
			System.out.println("����� ����� C�Դϴ�.");
		else if(a >= 20) // ������ 20~39���̸�
			System.out.println("����� ����� D�Դϴ�.");
		else // ������ 0~19���̸�
			System.out.println("����� ����� E�Դϴ�.");
		
		System.out.println("==============���α׷� ����==============");
	}

}
