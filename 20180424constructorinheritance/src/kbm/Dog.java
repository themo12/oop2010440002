package kbm;

public class Dog extends Animal {
	public Dog() {// default constructor
//		super(); 이 문장을 안쓰면 implicit, 쓰면 explicit. 즉, 쓰나 안쓰나 super 생성자를 먼저 실행하는 기능은 같음
		System.out.println("Dog 디폴트 생성자");
	} // Animal의 생성자의 properties를 받고 Dog의 생성자의 properties를 따로 설정하기 위한 생성자
	public Dog(int a) {
		super(a); // 이 때는 이와 같이 explicit 하지 않으면 부모 클래스의 정수형 생성자를 만들지 않고 디폴트 생성자를 만든다.
		System.out.println("Dog 정수형 생성자");
	}
}
