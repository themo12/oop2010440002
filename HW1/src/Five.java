import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("5�� ����");
		// 5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//	  choose one of the following.
		//	  apple
		//	  orange
		//	  banana
		//	  peach
		//	  enter your choice here : (����� �Է�)orange
		//	  --------------
		//	  Your choice is ��orange��.

		String x; // �ϳ��� ���� ���� 
		String a = "apple";
		String b = "orange";
		String c = "banana";
		String d = "peach";
		
		System.out.println("Choose one of the following.");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your choice here : ");
		x = input.nextLine(); // Ű���忡�� �޴� �Է�
		System.out.println("-----------");
		
		switch (x) {
		case "apple" :
			System.out.println("Your choice is " + x);
			break;
		case "orange" :
			System.out.println("Your choice is " + x);
			break;
		case "banana" :
			System.out.println("Your choice is " + x);
			break;
		case "peach" :
			System.out.println("Your choice is " + x);
			break;
		default :
			System.out.println("We don't care about that");
			break;
		}
				
		System.out.println("==============���α׷� ����==============");

	}

}
