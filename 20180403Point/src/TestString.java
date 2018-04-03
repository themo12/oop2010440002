
public class TestString {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		// str1이 str2가 참조하는 객체를 참조하게 해줌
		// 따라서 15번 줄의 str1==str2가 true로 바뀜 
//		str1 = str2;
		// 이전의 str1이 참조하고있던 String 객체는 접근 불가능. 즉, 다시 그 객체를 참조 불가능. garbage 됨.
		// 하지만 그 객체가 완전히 지워진 것은 아님
		// 따라서	Java virtual machine이 알아서 garbage collection 해 줌, 즉 그 객체를 지워줌
		
		// false인 이유는 str1과 str2가 참조하는 객체가 다르기 때문이다
		// 5번줄에서 String 객체가 생성되고 str1이 그것을 참조
		// 6번줄에서 또다른 String 객체가 생성되고 str2가 그것을 참조
		System.out.println(str1==str2);
		
		// equals() 메소드는 참조하는 객체의 내용이 같은지를 비교하는 것이기 때문에 true
		System.out.println(str1.equals(str2));
		
	}

}
