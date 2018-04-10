
public class TestPoint {

	public static void main(String[] args) {
		Point pnt1 = new Point();
		pnt1.setX(1.0); pnt1.setY(1.0);
		Point pnt2 = new Point();
		pnt2.setX(2.0); pnt2.setY(2.0);
		
//		pnt1.print(); // print method 내부의 this는 pnt1을 의미
//		pnt2.print(); // print method 내부의 this는 pnt2를 의미
//		String str = pnt1.toString();
//		System.out.println(str);
//		System.out.println(pnt1);
		// pnt1는 string이 아니기 때문에 java에서 알아서 toString()을 부른다
		
		System.out.println(pnt2);
		System.out.println(pnt2.distance());
		// method overloading : method 이름은 동일하지만, 매개변수로 호출할 method를 구분할 수 있다.
		System.out.println(pnt2.distance(pnt1)); // 이때 distance method 내부의 this는 pnt2를 의미
		
		
		
		
		
	}

}
