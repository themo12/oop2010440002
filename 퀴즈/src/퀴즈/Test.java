package ДыБо;

public class Test {

	public static void main(String[] args) {
		Drivable myCar = new Car();
		Drivable myBicycle = new Bicycle();
		myCar.brake();
		myCar.acc();
		myBicycle.brake();
		myBicycle.acc();
	}

}
