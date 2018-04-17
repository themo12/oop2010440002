
public class Animal {
	// Field
	public String name;
	
	// Constructor
	public Animal(String name) {
		this.name = name;
	}
	
	// Method
	public void sing() {
		System.out.println(name + " Sing");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
