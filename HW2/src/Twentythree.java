
public class Twentythree {

	public static void main(String[] args) {
		System.out.println("23번 문제");
		// 23. ***** * 12345678 6, 12, 18 / 8, 16
		//     *** ***
		//     * *****
		//     를 출력하시오(반복문 써서!)
		
		int i; // 변수 선언
		for (i=1; i<=24; i++) {
			if (i==6 || i==12 || i==18) // i가 6 또는 12 또는 18이면
				System.out.print(" ");
			else if (i==8 || i==16 || i==24) // i가 8 또는 16 또는 24이면
				System.out.println("");
			else // 그 외에
				System.out.print("*");
		}
		System.out.println("==============프로그램 종료==============");
	}

}
