
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0)); // Math.cos()�� ���� ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ带 Static Method(���� �޼ҵ�)�� �Ѵ�.
		Car myCar = new Car("Space Blue", 300);
		Car.print();
		myCar.print();
//		System.out.println(myCar.numberOfCars);
//		Car yourCar = new Car(); // class �ȿ� �츮�� �����ڸ� ����� ���� ������ �ڹٿ��� �ڵ����� �����ڸ� ������ֱ� ������ �������� ������ �ȶ�����
//		                         // �츮�� class �ȿ� �Ű������� �޴� �����ڸ� ����� ������ �ڹٰ� ���̻� �Ű������� ���� ������(default constructor)��
//		                         // �ڵ������� ��������� �ʱ� ������ ������ ���.
//		System.out.println(yourCar.numberOfCars);
//		// ���� ������ "class�̸�.���������̸�"���ε� ������ �� �ִ�.
//		System.out.println(Car.numberOfCars);
////		myCar.setColor("Black");
////		myCar.setSpeed(100);
//		System.out.println(myCar); // ���������� toString Method ȣ��
//		System.out.println(myCar.getColor());

	}

}
