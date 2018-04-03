

public class Point {
	// 필드의 scope(유효범위)은 class 내부이다.
	private double x; // 필드
	private double y; // 필드
	
	
	// 설정자 : 필드의 값을 설정하는 메소드 (필드의 private 속성을 public으로 바꿈)
	public void setX(double xx) {
		this.x = xx;
		xx = 100.0;
	}
	public void setY(double yy) {
		this.y = yy;
	}
	
	// 접근자 : 필드의 값을 반환하는 메소드
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	
	// ex) 원점에서 어떤 포인트 위치까지 길이 구할 때
	//	C언어 : 길이 = distance(p);
	//	Java : 길이 = p.distance();  -> 따라서 매개변수 필요 없음
	public double distance() {
		
		// 반환할 변수 선언
		double result; // 지역변수
		// 지역변수의 scope은 메소드 내부
		
		// 거리 계산
		result = Math.sqrt(x*x+y*y); // x,y는 필드
		
		// 거리 반환
		return result;
	}
	

	// ex) 벡터 p2 = 벡터 p1 + 벡터 p
	//	C언어 : p2=move(p1,p);
	//	Java : p2=p1.mov(p);
	public Point move(Point p) { // Point p : 매개변수(매개변수의 scope은 메소드 내부
		
		// temp 변수 선언
		double a;
		double b;
		
		// 포인트 p만큼 이동
		a = this.x + p.x;
		b = this.y + p.y;
		// this는 .뒤에 나오는 변수가 이 객체의 필드라는 것을 강조하기 위함
		// 즉, this.x 는 x가 필드라는 것을 강조하는 것
		
		// 새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		// 새로운 포인트 반환
		return pnt;
	}
	
}

