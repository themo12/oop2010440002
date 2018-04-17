
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0)); // Math.cos()과 같이 객체를 생성하지 않고 사용할 수 있는 메소드를 Static Method(정적 메소드)라 한다.
		Car myCar = new Car("Space Blue", 300);
		Car.print();
		myCar.print();
//		System.out.println(myCar.numberOfCars);
//		Car yourCar = new Car(); // class 안에 우리가 생성자를 만들어 놓지 않으면 자바에서 자동으로 생성자를 만들어주기 때문에 이전에는 오류가 안떴지만
//		                         // 우리가 class 안에 매개변수를 받는 생성자만 만들어 놓으면 자바가 더이상 매개변수가 없는 생성자(default constructor)를
//		                         // 자동적으로 만들어주지 않기 때문에 오류가 뜬다.
//		System.out.println(yourCar.numberOfCars);
//		// 정적 변수는 "class이름.정적변수이름"으로도 접근할 수 있다.
//		System.out.println(Car.numberOfCars);
////		myCar.setColor("Black");
////		myCar.setSpeed(100);
//		System.out.println(myCar); // 참조변수의 toString Method 호출
//		System.out.println(myCar.getColor());

	}

}
