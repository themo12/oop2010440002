import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		System.out.println("11�� ����");
		// 11. �Ҽ�(prime-number) �˻�� �����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//     8 => 2 4 
		//     12 => 2 3 4 6
		//     ���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
		
		int i; // ���� ����
		int n; // ���� ����
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		n = input.nextInt(); // Ű���忡�� ���� �Է�
		
		while (n != 0) {
			System.out.print(n + " => ");
			for(i=2; i<n; i++) {
				if (n%i == 0)
					System.out.print(i + " ");
			}
			System.out.println("");
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			n = input.nextInt(); // Ű���忡�� ���� �Է�
		}
		System.out.println("");
		System.out.println("==============���α׷� ����==============");
	}
}