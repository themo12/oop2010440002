
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str); // set�ȿ� String�� ����־��� ������ Box Ŭ������ set �Լ����� str�� Object�� Upcasting ���ش�.
		
		// int : primitive type
		// Integer : reference type
		Integer i;
//		i = 3;
		i = new Integer(3);
		System.out.println(i);
//		i = 1 + box.get(); // error : i�� Integer ��ü�� ����, i�� type�� int�̱� ������ Object type�� + ���� x 
		System.out.println("the box contains " + box.get());
		int a = 10;
		box.set(a); // primitive type�� a�� Object �Ű������� �ޱ� ���� Integer class(reference type)���� �ڵ� ��ȯ �����ش�(Autoboxing)
		System.out.println(10 + (Integer) box.get());

	}

}
