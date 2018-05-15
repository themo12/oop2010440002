import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{ // �� ��° �̺�Ʈ ������ ���� ��� : �ϳ��� Ŭ�������� ����
	// �ʵ� : ��� �޼ҵ忡�� ������ �� �ִ�.
	JButton button, btn;
	JTextField tf;
	
	// Constructor
		MyFrame() {
			this.setSize(900,500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("KOO's event");
			
			// ���ο� ������Ʈ�� �����ӿ� �߰�
			this.setLayout(new FlowLayout()); // setLayout() ��ġ �Ŵ��� ���, FlowLayout ��ü ����, FlowLayout()�� ������Ʈ���� ���������� ��ġ�ϴ� ���
			this.button = new JButton("KOO's button"); // ��ư ��ü ����
			this.add(this.button); // ��ư ��ü�� �����ӿ� �߰�
			this.button.setActionCommand("button1");
//			MyListener listener = new MyListener(); // �̺�Ʈ ������ ��ü ����
			button.addActionListener(this); // �̺�Ʈ ������ ��ü ���
			
			this.btn = new JButton("�ι�° ��ư");
			this.add(btn);
			this.btn.setActionCommand("button2");
			btn.addActionListener(this); // �̺�Ʈ ������ ��ü ���
			
			tf = new JTextField(20); // �ؽ�Ʈ�ʵ� ��ü ����
			this.add(tf); // �ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
			this.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if ((e.getActionCommand()).equals("button1"))
				this.tf.setText("ù ��° ��ư");
			else
				this.tf.setText("�� ��° ��ư");
			
//			JButton button = (JButton) e.getSource(); // �׼��̺�Ʈ��ü���� ������ ��ư ��ü�� (��ư ��ü�� reference ��) �����´�.
//			this.button.setText("��ư�� �ǶǶǶ� ���������!!");
//			this.tf.setText("�ؽ�Ʈ�ʵ忡 ���� ���ڸ� �־����");
//			System.out.println("OMG ��ư�� ���������!!!!!");

		}
}
