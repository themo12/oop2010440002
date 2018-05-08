
public class Dog extends Animal implements Playable {
	@Override
	void sing() {
		System.out.println("A Dog barks");
	}
	void eat() {
		System.out.println("A dog eats");
	}
	@Override
	public void walk() {
		System.out.println("Walk with a dog");
	}
	public void fetch() {
		System.out.println("fetch fecth");
	}
}
