import javax.swing.JFrame; // javax.swing. ������ ��Ű�� �̸�

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("KOO's frame");
		frame.setSize(900,500); // GUI������ x,y ���� ���� ������ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ������ ���μ����� ������ ���� �ڵ�, EXIT_ON_CLOSE�� JFrame Ŭ������ static variable
		frame.setVisible(true);
	}

}
