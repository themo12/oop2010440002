package kbm;

public class Dog extends Animal {
	public Dog() {// default constructor
//		super(); �� ������ �Ⱦ��� implicit, ���� explicit. ��, ���� �Ⱦ��� super �����ڸ� ���� �����ϴ� ����� ����
		System.out.println("Dog ����Ʈ ������");
	} // Animal�� �������� properties�� �ް� Dog�� �������� properties�� ���� �����ϱ� ���� ������
	public Dog(int a) {
		super(a); // �� ���� �̿� ���� explicit ���� ������ �θ� Ŭ������ ������ �����ڸ� ������ �ʰ� ����Ʈ �����ڸ� �����.
		System.out.println("Dog ������ ������");
	}
}
