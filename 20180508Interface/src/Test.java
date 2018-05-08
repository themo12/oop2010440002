import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
//		tina = new Dog();
//		tina.eat();
////		aaa.eat(); Error:Animal Ŭ���� �ȿ� eat��� method�� ���� ������
		
		// Upcasting
		// �캯�� Ŭ������ �º� Ŭ������ sub-class�̸� ���� ����. �º� <--�캯
//		Animal aaa = new Dog();
		Animal aaa = (Animal) new Dog();
		// override�� method�� ȣ���ϸ� subclass�� method�� ����ȴ�.
		aaa.sing();
//		aaa.eat(); Error:aaa�� type�� Animal. ��, Dog Ŭ������ Animal Ŭ������ ���õ� �͸� ���ٴ� ��.
		// ������ ����ȯ�̴�. 16���� 17�� ������ ���� �ǹ� implicit / explicit
		
		aaa = new Cat();
		aaa.sing();
		// 19�������� Dog�� sing()�� 23�������� Cat�� sing()�� ȣ�� �Ǵ°��� ������(Polymorphism)�̶� �Ѵ�.
		// method�� �θ��� ������ ���� �̸��ε� ���� ���ư��� method�� �ٸ��� ������ �������̶� �Ѵ�.
		
		// ������(Polymorphism)
		//  1. �ϳ��� Ŭ�����κ��� ���� ����Ŭ������ ���� ���
		//  2. ��� ����Ŭ������ ����Ŭ������ �޼ҵ带 override�Ѵ�.
		//  3. SuperClass SupRefVar = new SubClass();
		//  4. SuperRefVar.overridedMethod() -> ��ü�� Ŭ������ ������ �޼ҵ带 �����Ѵ�.
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing(); // ���� ���ε�(Dynamic Binding) : ���α׷� ���� �� ȣ���� �޼ҵ带 �����Ѵ�.
//		aaa = new Animal(); Error:�߻� Ŭ������ ��ü�� ���� �� ����. 
		
		// Type casting(����ȯ)
		int a;
		a = (int) 3.1;
		System.out.println(a);
	}

}
