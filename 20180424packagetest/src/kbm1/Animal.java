package kbm1;

public class Animal {
	
	// Field
	public String publicField;
	private String privateField;
	String packageField;
	// protected : �к��� ���ο� ������� ��ӵ�
	//             ���� ��Ű�� �������� public
	//             Ÿ ��Ű�������� private
	protected String protectedField;
	
	// Constructor
	public Animal() {
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}

}
