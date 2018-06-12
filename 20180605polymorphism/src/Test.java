
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina"); // Upcasting
		Animal aCat = new Cat("망고"); // Upcasting
		aDog.sing();
//		aDog.playFetch(); // error : aDog 클래스의 class type은 부모 클래스인 Animal인데 playFetch()는 자식 클래스인 Dog 클래스의 method이므로 에러
		((Dog) aDog).playFetch(); // Downcasting 후 에러 없어짐
//		((Cat) aCat).playFetch(); // error : Cat 클래스에는 playFetch() method가 없으므로
		
		((Dog) aCat).playFetch(); // error
		// Downcasting은 될수도 안될수도 있다. 여기서는 aCat이 Cat 클래스를 참조하지만 클래스 Type이 Animal이기 때문에 Dog 클래스로 Downcasting은 가능
		// But, Downcasting 후 현재 Cat을 참조할지 Dog를 참조할지는 모름. Runtime 때 이것을 확인하고 run or error.
		
		aCat.sing();
		
		
		
	}

}
