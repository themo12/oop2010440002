
public class Three {

	public static void main(String[] args) {
		System.out.println("3번 문제");
		// 3. 1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(while문 사용)

		int x = 1; // 변수 선언 및 초기화
		int y = 0; // 변수 선언 및 초기화
		
		while (x <= 100) {
			if (x % 3 == 0) {
				y = y + x;
				x++;
			}
			else
				x++;
		}
		
		System.out.println(y);
		
		System.out.println("==============프로그램 종료==============");
	}

}
