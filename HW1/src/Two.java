import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("2번 문제");
		// 2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		int a; // 하나의 정수 입력을 위한 변수 선언
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		a = input.nextInt(); // 키보드에서 숫자 입력
		
		if (a%2 == 0) // a를 2로 나눈 후 나머지가 0이면
			System.out.println("입력한 정수는 짝수 입니다.");
		else // a를 2로 나눈 나머지가 0이 아니면
			System.out.println("입력한 정수는 홀수 입니다.");
		
		System.out.println("==============프로그램 종료==============");
	}

}
