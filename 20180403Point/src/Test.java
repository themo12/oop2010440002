
public class Test {

	public static void main(String[] args) {

		Point p = new Point(); // ����Ʈ ��ü ���� �� reference p�� ����
		
		// ��ü�� �ʵ� ����
//		p.x = 1.0;
//		p.y = 1.0;
		
		double temp = 1.0;
		
		// setX : ������
		p.setX(temp); // �����ڸ� ����� �ʵ尪 ����
		System.out.println("temp=" + temp);
		
		System.out.println(p.getX());
		p.setY(temp);
		
//		System.out.println(p.distance()); // p ��ü�� distance() �Լ� ȣ��
	}

}
