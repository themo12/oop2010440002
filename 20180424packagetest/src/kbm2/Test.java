package kbm2;

import kbm1.*; // kbm1 패키지의 모든 클래스를 편이하게 사용하기 위한 문장. 15번줄을 16번줄로 바꿀 수 있다.

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
//		aBasil.age = 2; Error : age is a private field
		
		// 타 패키지의 클래스를 사용하려면 
		// 1. 패키지명.클라스명
		// 2. import 명령어 사용
//		kbm1.Dog aDog = new kbm1.Dog();
		Dog aDog = new Dog();
		aDog.name = "happy";
//		aDog.IDN = "23232"; Error : IDN is a private field
//		aDog.nickName = "kk"; Error : ncikName은 (kbm1의)패키지 접근지정
		
		Animal aa = new Animal();
//		aa.protectedField = "ddd"; Error : 즉 protected는 같은 패키지 내에서는 public처럼, 다른 패키지에서는 private 처럼(단, 상속은 된다.)
		
		Rosemary rr = new Rosemary();
		System.out.println(rr.getprotectedField()); // protected는 다른 패키지여도 private으로 상속이 가능하기 때문에 get함수를 사용하여 사용 가능하다.
		
	}

}
