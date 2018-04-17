
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	// Override : 상속받을 때 부모로부터 받았던 메소드 중에서 받는 것을 거부하고 메소드를 새로 만든다는 뜻.
	// 주의!!! Overloading(중복 메소드)과는 다른 것임. 즉, 매개변수를 추가해주면 Override가 아니고 Overloading이므로 오류가 뜬다. 
	@Override
	public void sing() {
		System.out.println(name + " 멍멍");
	}

}
