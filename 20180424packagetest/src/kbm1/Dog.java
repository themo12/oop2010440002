package kbm1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickName; // package 접근지정 : 패키지 내에서만 public처럼 사용
	void print() {
		System.out.println(publicField);
//		System.out.println(privateField); Error : private은 상속이 안되므로
		System.out.println(packageField);
		System.out.println(protectedField);
	}
}
