
public class TestString {

	public static void main(String[] args) {
		int a = 10; // int���� ���� a ���� + �� 10�� a�� ����
		// a�� primitive ����
		
		// string ��ü ���� ���
		String str; // class string�� ��ü�� ������ �� �ִ� ���� ����(reference ����) ����
		// String�� class �̸�
		// str�� reference ���� (c������ ������)		
		// int a; �� �޸� String str; �� c������ �����Ϳ� ���� �����ϸ� �ȴ�.
		// �̶� ��ü�� �����Ǵ� ���� �ƴ϶� �ؿ��� ��ü ����
		// ���Ϲ�ȣ(�ּ�)�� ����Ҹ� Ȯ���ϴ� �ܰ�
		
		str = new String("Hello darkness my old frined.");
		// 1.��ü ����
		// 2.��ü�� Reference ��ȯ
		// Heap ������ String ��ü�� Stack ������ str ������ �����ϴ� ��.
		
		int len = str.length();
		// String ��ü�� ����
		// �޼ҵ� ȣ�� ��� : ��������.�޼ҵ�()
	
		System.out.println("string length is " + len);
		
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1 : " + str1);
		// str1 = str.toUpperCase(); ���� Heap ������ str ���ڿ����� �빮�ڷ� �ٲ� String ��ü�� �����ϴ� ��.
		// ���� str1�� �� ��ü�� reference
		// c���� malloc ����Ͽ� �ϴ� �͵��� �� �ٷ� ������ ����
	}

}
