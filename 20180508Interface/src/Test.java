import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
//		tina = new Dog();
//		tina.eat();
////		aaa.eat(); Error:Animal 클래스 안에 eat라는 method가 없기 때문에
		
		// Upcasting
		// 우변의 클래스가 좌변 클래스의 sub-class이면 문제 없다. 좌변 <--우변
//		Animal aaa = new Dog();
		Animal aaa = (Animal) new Dog();
		// override한 method를 호출하면 subclass의 method가 수행된다.
		aaa.sing();
//		aaa.eat(); Error:aaa의 type은 Animal. 즉, Dog 클래스의 Animal 클래스에 관련된 것만 본다는 뜻.
		// 일종의 형변환이다. 16번과 17번 라인이 같은 의미 implicit / explicit
		
		aaa = new Cat();
		aaa.sing();
		// 19번에서는 Dog의 sing()이 23번에서는 Cat의 sing()이 호출 되는것을 다형성(Polymorphism)이라 한다.
		// method를 부르는 변수는 같은 이름인데 실제 돌아가는 method가 다르기 때문에 다형성이라 한다.
		
		// 다형성(Polymorphism)
		//  1. 하나의 클래스로부터 여러 서브클래스를 만들 경우
		//  2. 모든 서브클래스는 수퍼클래스의 메소드를 override한다.
		//  3. SuperClass SupRefVar = new SubClass();
		//  4. SuperRefVar.overridedMethod() -> 객체의 클래스가 구현한 메소드를 실행한다.
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing(); // 동적 바인딩(Dynamic Binding) : 프로그램 수행 시 호출할 메소드를 결정한다.
//		aaa = new Animal(); Error:추상 클래스의 객체를 만들 수 없다. 
		
		// Type casting(형변환)
		int a;
		a = (int) 3.1;
		System.out.println(a);
	}

}
