
public class Car {
	// Fields
	private String color;
	private int speed;

	public static int numberOfCars = 0; // Static Field : ���� ����
	
	// Constructor(������) : Method �̸��� Class �̸��� ����. ��ȯ���� ����.
	// ���� �����ڸ� �������� ������ �ڹٴ� �Ű����� ���� �����ڸ� �ڵ����� �������ش�.
	// ������, �����ڸ� �ϳ��� �����ϸ� �ڹٴ� �ƹ� �ϵ� ���� �ʴ´�.
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
		// ���� �޼ҵ�� � ��ü�� �ʵ忡 �������� ���Ѵ�. ��, ���� �޼ҵ�� ���� ������ ������ �� �ִ�. ���� ���� �޼ҵ忡���� �ٸ� ���� �޼ҵ常 ������ �� �ִ�.(�ν��Ͻ� �޼ҵ�� ȣ�� ����)
//		System.out.println(this.color + ", " + this.speed); // error : �ν��Ͻ� �޼ҵ�� ȣ�� ���ϱ� ������
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
