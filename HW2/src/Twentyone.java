import java.util.Scanner;

public class Twentyone {

	public static void main(String[] args) {
		System.out.println("21�� ����");
		// 21. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int number; // �Է��� ���ڸ� ���� ���� ����
		int i; // �Է��� ���ں��� ���� ���ڸ� ���� ���� ����
		int x; // i�� �Ҽ� Ȯ���� ���� ���� ����
		int sum = 0; // �Ҽ����� ���� ���� ���� ���� �� �ʱ�ȭ
		
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�. : ");
		number = input.nextInt(); // Ű���忡�� ���� �Է�
		
		for (i=2; i<=number; i++) {
			for (x=2; x<=i; x++) {
				if (x!=i) {
					if (i%x != 0)
						continue;
					else
						break;
				}
				else {
					sum = sum + i;
					break;
				}
			}
		}
		System.out.println("�Է��� ���� " + number + " ������ �Ҽ����� �� = " + sum);

		System.out.println("==============���α׷� ����==============");
	}
}