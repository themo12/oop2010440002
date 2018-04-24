package kbm1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.print();
		tina.name = "Tina";
//		tina.IDN = "30942394"; Error : IDN is a private field
		tina.nickName = "tt";
		tina.publicField = "U2";
//		tina.privateField = "Sting"; Error : private은 상속이 안된다.
		tina.packageField = "Ed";
		tina.protectedField = "Beatles";
		tina.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";

	}

}
