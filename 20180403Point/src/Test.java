
public class Test {

	public static void main(String[] args) {

		Point p = new Point(); // ����Ʈ ��ü ���� �� reference p�� ����
		
		// ��ü�� �ʵ� ����
		p.x = 1.0;
		p.y = 1.0;
		
		System.out.println(p.distance()); // p ��ü�� distance() �Լ� ȣ��
	}

}
