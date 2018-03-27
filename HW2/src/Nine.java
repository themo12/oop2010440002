import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		System.out.println("9번 문제");
		// 9. 1부터 9사이의 숫자 하나를 입력 받아 그 숫자의 구구단을 출력하는 프로그램을 작성하시오.(5이면 5단을 출력)
		//    위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 이 경우에 잘못된 숫자라는 것을
		//    알려주는 에러 메시지를 출력하고다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)

		int i; // 변수 선언
		int n; // 변수 선언
		Scanner input = new Scanner(System.in);
		System.out.print("1부터 9사이의 숫자 하나를 입력하시오 : ");
		n = input.nextInt(); // 키보드에서 숫자 입력
		
		for (i=1; i<10; i++) {	
			if (n<1 || n>9) { // 입력한 숫자가 1부터 9사이 이외의 숫자이면
				System.out.println("1부터 9사이의 숫자로 입력하지 않았습니다.");
				i=0; // 변수 초기화
				System.out.print("1부터 9사이의 숫자 하나를 입력하시오 : ");
				n = input.nextInt(); // 키보드에서 메뉴 입력
			}
			else
				System.out.println(n + " * " + i + " = " + n*i); // 구구단 시작
		}
		
		System.out.println("==============프로그램 종료==============");
	}

}