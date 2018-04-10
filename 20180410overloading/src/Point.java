
public class Point {
	// Fields
	private double x;
	private double y;
	
	// Methods
	public String toString() {
		return ("(" + this.x + ", " + this.y + ")");
		// this.x, this.y는 double이기 때문에 java에서 이 double을 알아서 string으로 바꿔준다.
	}
	public void print() {
		System.out.println("(" + this.x + ", " + this.y + ")");
//		System.out.println("(" + getX() + ", " + getY() + ")");
//		System.out.println("(" + this.getX() + ", " + this.getY() + ")");
	}
	public double distance() {
		
//		// 반환할 변수 선언
//		double result; // 지역변수
//		// 지역변수의 scope은 메소드 내부
//		
//		// 거리 계산
//		result = Math.sqrt(x*x+y*y); // x,y는 필드
//		
//		// 거리 반환
//		return result;
		
		// 위에를 한줄로
		return Math.sqrt(x*x+y*y);
	}
	
	// method overloading : 같은 이름의 method이지만 매개변수를 다르게 해주어 method를 구분해준다.
	public double distance(Point p) {
		return Math.sqrt( ( this.x - p.getX() ) * ( this.x - p.getX() )
						+ ( this.y - p.getY() ) * ( this.y - p.getY() ));
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
