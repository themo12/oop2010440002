import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		System.out.println("7번 문제");
		// 7. 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.

		int x = 1; // 변수 선언 및 초기화
		int y = 0; // 변수 선언 및 초기화
		
		while (x != 0) {
			Scanner input = new Scanner(System.in);
			System.out.print("정수를 입력하시오 : ");
			x = input.nextInt(); // 키보드에서 숫자 입력
			
			y = y + x;
		}	
		System.out.println("입력하신 정수들의 총합은 " + y + " 입니다.");
		
		System.out.println("==============프로그램 종료==============");
	}

}