
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	// Override : ��ӹ��� �� �θ�κ��� �޾Ҵ� �޼ҵ� �߿��� �޴� ���� �ź��ϰ� �޼ҵ带 ���� ����ٴ� ��.
	// ����!!! Overloading(�ߺ� �޼ҵ�)���� �ٸ� ����. ��, �Ű������� �߰����ָ� Override�� �ƴϰ� Overloading�̹Ƿ� ������ ���. 
	@Override
	public void sing() {
		System.out.println(name + " �۸�");
	}

}
