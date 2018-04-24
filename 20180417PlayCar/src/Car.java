
public class Car {
	// Fields
	private String color;
	private int speed;

	public static int numberOfCars = 0; // Static Field : 정적 변수
	
	// Constructor(생성자) : Method 이름이 Class 이름과 같다. 반환형이 없다.
	// 만약 생성자를 정의하지 않으면 자바는 매개변수 없는 생성자를 자동으로 생성해준다.
	// 하지만, 생성자를 하나라도 정의하면 자바는 아무 일도 하지 않는다.
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		numberOfCars++;
	}
	public Car() {
		this.color = "White";
		this.speed = 60;
		numberOfCars++;
	}
	
	// Method
	public static void print() {
		// 정적 메소드는 어떤 객체의 필드에 접근하지 못한다. 즉, 정적 메소드는 정적 변수만 접근할 수 있다. 또한 정적 메소드에서는 다른 정적 메소드만 접근할 수 있다.(인스턴스 메소드는 호출 못함)
//		System.out.println(this.color + ", " + this.speed); // error : 인스턴스 메소드는 호출 못하기 때문에
		System.out.println(numberOfCars);
	}
	public String toString() {
		return ("Color is " + this.color + ". Speed is " + this.speed);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
