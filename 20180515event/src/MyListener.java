import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
// ù ��° �̺�Ʈ ������ ���� ��� : �ٸ� Ŭ�������� ����
public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource(); // �׼��̺�Ʈ��ü���� ������ ��ư ��ü�� (��ư ��ü�� reference ��) �����´�.
		button.setText("��ư�� ���������!!");
		System.out.println("OMG ��ư�� ���������!!!!!");

	}

}
