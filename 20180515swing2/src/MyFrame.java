import java.awt.FlowLayout;
import javax.swing.*;

public class MyFrame extends JFrame {
	// Constructor
	MyFrame() {
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("KOO's 2nd frame");
		
		// ���ο� ������Ʈ�� �����ӿ� �߰�
//		FlowLayout f1 = new FlowLayout(); // FlowLayout ��ü ����, ������Ʈ���� ���������� ��ġ�ϴ� ���
//		this.setLayout(f1); // setLayout() ��ġ �Ŵ��� method ���
		setLayout(new FlowLayout()); // 12, 13������ ���ٷ� ����
		JLabel label = new JLabel("���ڸ� ������ �Է��ϼ��� : "); // ���̺� ��ü ����
		JTextField tf = new JTextField(20); // �ؽ�Ʈ�ʵ� ��ü ����, ���� ���� �ؽ�Ʈ�ʵ��� ����
		JButton button = new JButton("KOO's button"); // ��ư ��ü ����
		
		button.setText("������"); // ��ư �̸� ����
		tf.setText("�������̷ε���������");
		
		// �г� ����
		JPanel panel = new JPanel(); // �г� ��ü ����
		panel.add(label); // ���̺� ��ü�� �гο� �߰�
		panel.add(tf); // �ؽ�Ʈ�ʵ� ��ü�� �гο� �߰�
		
		this.add(button); // ��ư ��ü�� �����ӿ� �߰�
		this.add(panel); // panel�� �����ӿ� �߰�
//		this.add(label); // ���̺� ��ü�� �����ӿ� �߰�
//		this.add(tf); // �ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
//		pack(); // �������� ũ�⸦ �� �ȿ� �ִ� ������Ʈ ũ�⿡ �����
		
		this.setVisible(true);
		
	}
}
