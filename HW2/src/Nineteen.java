import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		System.out.println("19번 문제");
		// 19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		
		int a;
		int i;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오. : ");
		a = input.nextInt(); // 키보드에서 숫자 입력
		
		for (i=2; i<=a; i++) {
			if (i!=a) {
				if (a%i != 0)
					continue;
				else {
					System.out.println("소수가 아닙니다.");
					break;
				}
			}
			else
				System.out.println("소수입니다.");
				break;
		}
		
		System.out.println("==============프로그램 종료==============");
	}
}
