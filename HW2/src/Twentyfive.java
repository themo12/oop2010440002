
public class Twentyfive {

	public static void main(String[] args) {
		System.out.println("25�� ����");
		// 25.������ ���� ����� �������� ���α׷��� �ۼ��Ͻÿ�.
		//    (1) ***********
		//        *********
		//        *******
		//        *****
		//        ***
		//        *
		//        *** 
		//        ***** 
		//        ******* 
		//        ********* 
		//        ***********
		//    (2)54321012345
		//       432101234
		//       3210123
		//       21012
		//       101
		//       0
		//       101
		//       21012
		//       3210123
		//       432101234
		//       54321012345

		System.out.println("(1)�� ���� ���");
		int x; // �� �ٿ��� ����� ��ǥ�� ������ ���� ���� ����
		int y; // �� �ٿ��� ����� ��ǥ�� ������ ���� ���� ����
		for (x=10; x>0; x=x-2) {
			for (y=x; y>=0; y--)
				System.out.print("*");
			System.out.println("");
		}
		
		for (x=0; x<=10; x=x+2) {
			for (y=x; y>=0; y--)
				System.out.print("*");
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("(2)�� ���� ���");
		int a; // �ٿ��� ó�� ������ ���ڸ� ���� ���� ����
		int b; // ����� ���ڸ� ���� ���� ����
		for (a=5; a>0; a--) { // ũ�Ⱑ �پ��� �ﰢ���� ���� for��
			for (b=a; b>=0; b--) // 543210, 43210, 3210...�� ���� for��
				System.out.print(b);
			for (b=1; b<=a; b++) // 12345, 1234, 123...�� ���� for��
				System.out.print(b);
			System.out.println(""); // �� �ѱ��� ���� for��
		}
		
		for (a=0; a<=5; a++) { // ũ�Ⱑ �þ�� �ﰢ���� ���� for��
			for (b=a; b>=0; b--) // 0, 10, 210...�� ���� for��
				System.out.print(b);
			for (b=1; b<=a; b++) // 1, 12, 123...�� ���� for��
				System.out.print(b);
			System.out.println(""); // �� �ѱ��� ���� for��
		}
		
		System.out.println("==============���α׷� ����==============");
	}

}



