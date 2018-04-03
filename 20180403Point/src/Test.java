
public class Test {

	public static void main(String[] args) {

		Point p = new Point(); // 포인트 객체 생성 및 reference p에 저장
		
		// 객체의 필드 접근
//		p.x = 1.0;
//		p.y = 1.0;
		
		double temp = 1.0;
		
		// setX : 설정자
		p.setX(temp); // 접근자를 사용한 필드값 설정
		System.out.println("temp=" + temp);
		System.out.println(p.getX());
		p.setY(temp);
		
//		System.out.println(p.distance()); // p 객체의 distance() 함수 호출
	}

}
