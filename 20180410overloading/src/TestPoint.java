
public class TestPoint {

	public static void main(String[] args) {
		Point pnt1 = new Point();
		pnt1.setX(1.0); pnt1.setY(1.0);
		Point pnt2 = new Point();
		pnt2.setX(2.0); pnt2.setY(2.0);
		
//		pnt1.print(); // print method ������ this�� pnt1�� �ǹ�
//		pnt2.print(); // print method ������ this�� pnt2�� �ǹ�
//		String str = pnt1.toString();
//		System.out.println(str);
//		System.out.println(pnt1);
		// pnt1�� string�� �ƴϱ� ������ java���� �˾Ƽ� toString()�� �θ���
		
		System.out.println(pnt2);
		System.out.println(pnt2.distance());
		// method overloading : method �̸��� ����������, �Ű������� ȣ���� method�� ������ �� �ִ�.
		System.out.println(pnt2.distance(pnt1)); // �̶� distance method ������ this�� pnt2�� �ǹ�
		
		
		
		
		
	}

}
