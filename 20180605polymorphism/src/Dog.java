
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	@Override
	void sing() {
		System.out.println(this.name + " �۸�");
	}
	void playFetch() {
		System.out.println("��������");
	}
}
