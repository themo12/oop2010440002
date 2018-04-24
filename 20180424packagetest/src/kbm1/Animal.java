package kbm1;

public class Animal {
	
	// Field
	public String publicField;
	private String privateField;
	String packageField;
	// protected : 패비지 여부와 상관없이 상속됨
	//             동일 패키지 내에서는 public
	//             타 패키지에서는 private
	protected String protectedField;
	
	// Constructor
	public Animal() {
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}

}
