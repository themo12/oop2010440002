package kbm2;

import kbm1.*; // kbm1 ��Ű���� ��� Ŭ������ �����ϰ� ����ϱ� ���� ����. 15������ 16���ٷ� �ٲ� �� �ִ�.

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
//		aBasil.age = 2; Error : age is a private field
		
		// Ÿ ��Ű���� Ŭ������ ����Ϸ��� 
		// 1. ��Ű����.Ŭ�󽺸�
		// 2. import ��ɾ� ���
//		kbm1.Dog aDog = new kbm1.Dog();
		Dog aDog = new Dog();
		aDog.name = "happy";
//		aDog.IDN = "23232"; Error : IDN is a private field
//		aDog.nickName = "kk"; Error : ncikName�� (kbm1��)��Ű�� ��������
		
		Animal aa = new Animal();
//		aa.protectedField = "ddd"; Error : �� protected�� ���� ��Ű�� �������� publicó��, �ٸ� ��Ű�������� private ó��(��, ����� �ȴ�.)
		
		Rosemary rr = new Rosemary();
		
	}

}
