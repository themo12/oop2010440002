import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		System.out.println("15�� ����");
		// 15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)
		//     ��) ���� 49�� ���:
		//     ���ڸ� �Է��Ͻÿ�: 36
		//     �Է��Ͻ� ���ں��� Ů�ϴ�.
		//     ���ڸ� �Է��Ͻÿ�: 51
		//     �Է��Ͻ� ���ں��� �۽��ϴ�.
		//     ���ڸ� �Է��Ͻÿ�: 49
		//     �����Դϴ�!
		
		int number = (int) (Math.random()*100)+1; // 1~100 ������ ���� �ϳ� ����
		
		int a; // ���� ����
		int i; // ���� ����
		
		Scanner input = new Scanner(System.in);
		
		for (i=1; i<=10; i++) {
			if (i != 10) {
				System.out.print("���ڸ� �Է��Ͻÿ�. : ");
				a = input.nextInt(); // Ű���忡�� ���� �Է�
				
				if (a > number)
					System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
				else if (a < number)
					System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
				else {
					System.out.println("�����Դϴ�!!");
					break;
				}
			}
			else {
				System.out.print("���ڸ� �Է��Ͻÿ�. : ");
				a = input.nextInt(); // Ű���忡�� ���� �Է�
				if (a != number)
					System.out.println("Game Over");
				else
					System.out.println("�����Դϴ�!!");					
			}
		}

		System.out.println("==============���α׷� ����==============");
	}
}