
public class TestString {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		// str1�� str2�� �����ϴ� ��ü�� �����ϰ� ����
		// ���� 15�� ���� str1==str2�� true�� �ٲ� 
//		str1 = str2;
		// ������ str1�� �����ϰ��ִ� String ��ü�� ���� �Ұ���. ��, �ٽ� �� ��ü�� ���� �Ұ���. garbage ��.
		// ������ �� ��ü�� ������ ������ ���� �ƴ�
		// ����	Java virtual machine�� �˾Ƽ� garbage collection �� ��, �� �� ��ü�� ������
		

		System.out.println(str1==str2);
		// 5���ٿ��� String ��ü�� �����ǰ� str1�� �װ��� ����
		// 6���ٿ��� �Ǵٸ� String ��ü�� �����ǰ� str2�� �װ��� ����
		// false�� ������ str1�� str2�� �����ϴ� ��ü�� �ٸ��� �����̴�
		
		
		// equals() �޼ҵ�� �����ϴ� ��ü�� ������ �������� ���ϴ� ���̱� ������ true
		System.out.println(str1.equals(str2));
		
	}

}
