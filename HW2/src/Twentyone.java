import java.util.Scanner;

public class Twentyone {

	public static void main(String[] args) {
		System.out.println("21번 문제");
		// 21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		
		int number; // 입력할 숫자를 위한 변수 선언
		int i; // 입력한 숫자보다 작은 숫자를 위한 변수 선언
		int x; // i의 소수 확인을 위한 변수 선언
		int sum = 0; // 소수들의 합을 위한 변수 선언 및 초기화
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오. : ");
		number = input.nextInt(); // 키보드에서 숫자 입력
		
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
		System.out.println("입력한 숫자 " + number + " 이하의 소수들의 합 = " + sum);

		System.out.println("==============프로그램 종료==============");
	}
}
