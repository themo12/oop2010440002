
public class Seventeen {

	public static void main(String[] args) {
		System.out.println("17번 문제");
		// 17. 1부터 100까지의 합을 for loop을 써서 구하는 프로그램을 작성하시오.
		
		int i;
		int sum=0;
		
		for (i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 총 합은 : " + sum);
		
		System.out.println("==============프로그램 종료==============");
	}
}
