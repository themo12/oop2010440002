package kbm1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickName; // package �������� : ��Ű�� �������� publicó�� ���
	void print() {
		System.out.println(publicField);
//		System.out.println(privateField); Error : private�� ����� �ȵǹǷ�
		System.out.println(packageField);
		System.out.println(protectedField);
	}
}
