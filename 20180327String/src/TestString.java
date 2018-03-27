
public class TestString {

	public static void main(String[] args) {
		int a = 10; // int형의 변수 a 생성 + 값 10을 a에 저장
		// a는 primitive 변수
		
		// string 객체 생성 방법
		String str; // class string의 객체를 참조할 수 있는 참조 변수(reference 변수) 생성
		// String은 class 이름
		// str은 reference 변수 (c언어에서의 포인터)		
		// int a; 와 달리 String str; 은 c언어에서의 포인터와 같다 생각하면 된다. 
		
		str = new String("Hello darkness my old frined."); // 객체 생성
		// Heap 영역의 String 객체를 Stack 영역의 str 변수가 참조하는 것.
		
		// String 객체의 길이
		// 메소드 호출 방법 : 참조변수.메소드()
		int len = str.length();
	
		System.out.println("string length is " + len);
		
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1 : " + str1);
		// str1 = str.toUpperCase(); 또한 Heap 영역에 str 문자열들을 대문자로 바꾼 String 객체를 생성하는 것.
		// 따라서 str1이 그 객체를 reference
		// c언어에서 malloc 사용하여 하던 것들을 한 줄로 간단히 가능
	}

}
