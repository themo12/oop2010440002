import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		System.out.println("1번 문제");
		// 1. 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.
		int a, b; // 두개의 정수 입력을 위한 변수
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오 : ");
		a = input.nextInt(); // 키보드에서 숫자 입력
		System.out.print("두번째 정수를 입력하시오 : ");
		b = input.nextInt(); // 키보드에서 숫자 입력
		
		if (a>b) // a가 b보다 크면
			System.out.println("큰 수는 " + a + "입니다.");
		else if (b>a) // b가 a보다 크면
			System.out.println("큰 수는 " + b + "입니다.");
		else
			System.out.println("두 수는 같습니다.");
		
		System.out.println("==============프로그램 종료==============");
	
	}

}
