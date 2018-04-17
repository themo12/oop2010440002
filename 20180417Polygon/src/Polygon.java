
public abstract class Polygon { // abstract class : 객체를 생성할 수 없는 클래스. 그러나 의미가 있다(상속받는 클래스들의 편의를 위함).
	// Field
	public double height;
	public double width;
	
	// Method
	public abstract double area(); // abstract method : 구현이 없는 method. 상속받는 클래스들이 이 method를 구현해야한다.
//	public double area() {
//		
//		return 0;
//	}
	
}
