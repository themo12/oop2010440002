
public class TestString {

	public static void main(String[] args) {
		int a = 10; // int���� ���� a ���� + �� 10�� a�� ����
		// a�� primitive ����
		
		// string ��ü ���� ���
		String str; // class string�� ��ü�� ������ �� �ִ� ���� ����(reference ����) ����
		// String�� class �̸�
		// str�� reference ���� (c������ ������)		
		// int a; �� �޸� String str; �� c������ �����Ϳ� ���� �����ϸ� �ȴ�. 
		
		str = new String("Hello darkness my old frined."); // ��ü ����
		// Heap ������ String ��ü�� Stack ������ str ������ �����ϴ� ��.
		
		// String ��ü�� ����
		// �޼ҵ� ȣ�� ��� : ��������.�޼ҵ�()
		int len = str.length();
	
		System.out.println("string length is " + len);
		
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1 : " + str1);
		// str1 = str.toUpperCase(); ���� Heap ������ str ���ڿ����� �빮�ڷ� �ٲ� String ��ü�� �����ϴ� ��.
		// ���� str1�� �� ��ü�� reference
		// c���� malloc ����Ͽ� �ϴ� �͵��� �� �ٷ� ������ ����
	}

}
