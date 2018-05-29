
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str); // set안에 String을 집어넣었기 때문에 Box 클래스의 set 함수에서 str을 Object로 Upcasting 해준다.
		
		// int : primitive type
		// Integer : reference type
		Integer i;
//		i = 3;
		i = new Integer(3);
		System.out.println(i);
//		i = 1 + box.get();
		System.out.println("the box contains " + box.get());
		int a = 10;
		box.set(a); // primitive type인 a를 Object 매개변수로 받기 위해 Integer class(reference type)으로 자동 변환 시켜준다(Autoboxing)
		System.out.println(10 + (Integer) box.get());

	}

}
