
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina"); // Upcasting
		Animal aCat = new Cat("����"); // Upcasting
		aDog.sing();
//		aDog.playFetch(); // error : aDog Ŭ������ class type�� �θ� Ŭ������ Animal�ε� playFetch()�� �ڽ� Ŭ������ Dog Ŭ������ method�̹Ƿ� ����
		((Dog) aDog).playFetch(); // Downcasting �� ���� ������
//		((Cat) aCat).playFetch(); // error : Cat Ŭ�������� playFetch() method�� �����Ƿ�
		
		((Dog) aCat).playFetch(); // error
		// Downcasting�� �ɼ��� �ȵɼ��� �ִ�. ���⼭�� aCat�� Cat Ŭ������ ���������� Ŭ���� Type�� Animal�̱� ������ Dog Ŭ������ Downcasting�� ����
		// But, Downcasting �� ���� Cat�� �������� Dog�� ���������� ��. Runtime �� �̰��� Ȯ���ϰ� run or error.
		
		aCat.sing();
		
		
		
	}

}
