
public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>(); // Box class의 <T>가 <String>으로
		String str = new String("Hello");
		
		box.set(str);
		System.out.println("The box has " + box.get());
		
		Box<Integer> ibox = new Box<Integer>(); // Box class의 <T>가 <Integer>로
		Integer i = new Integer(10);
		
		ibox.set(i);
//		ibox.set(new String("Koo")); // error
		System.out.println(100 + ibox.get());
		
	}
}
