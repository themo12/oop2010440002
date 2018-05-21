import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator extends JFrame implements ActionListener{ // �̺�Ʈ �����ʸ� �ϳ��� Ŭ�������� ����
	
	
	// Field
	JPanel displayPanel;
	JPanel btnPanel;
	JPanel defaultPanel;
	
	JTextField tmp;
	JTextField display;
	
	JButton[] btnInt;
	JButton btnClear;
	JButton btnPlus;
	JButton btnEqual;
	
	int sum = 0;
	boolean setEqual = false;
	
	
	// Constructor
	MyCalculator() {
		this.setSize(300,400);
		this.setTitle("KOO's Calculator");
		this.setLayout(new BorderLayout()); // setLayout() ��ġ �Ŵ���, ����� �߽����� �������� ��ġ ������ BorderLayout() method ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ������ ���μ����� ������ ���� �ڵ�, EXIT_ON_CLOSE�� JFrame Ŭ������ static variable
		
		
		// (�۾�ü, ����, �۾� ũ��) �����ϴ� Font ��ü ����
		Font tmpFont = new Font("Serif", Font.PLAIN, 15); // tmp display�� ���� Font ����
		Font font = new Font("Serif", Font.BOLD, 30); // ������ display�� ��ư���� ���� Font ����
		
		
		// Panel ��ü ���� �� ����
		displayPanel = new JPanel(); // display�� ���� Panel ��ü ����
		btnPanel = new JPanel(); // button�� ���� Panel ��ü ����
		defaultPanel = new JPanel(); // clear ��ư�� ���� Panel ��ü ����
		
		displayPanel.setLayout(new GridLayout(2, 1, 5, 5)); // displayPanel�� (row, col, hgap, vgap)������ ������ GridLayout() method ���
		btnPanel.setLayout(new GridLayout(0, 3, 5, 5)); // btnPanel�� (row, col, hgap, vgap)������ ������ GridLayout() method ���
		defaultPanel.setLayout(new FlowLayout()); // defaultPanel�� ���������� ��ġ ������ FlowLayout() method ���
		
		
		// Display Panel �κ�
		tmp = new JTextField(11); // ũ�� 11�� TextField ��ü ����
		tmp.setFont(tmpFont); // tmp TextField ��Ʈ ����
		tmp.setBackground(Color.lightGray); // tmp TextField�� ������ light gray�� ����
		tmp.setHorizontalAlignment(JTextField.RIGHT); // ������ ����
		
		display = new JTextField(11); // ũ�� 11�� TextField ��ü ����
		display.setText("0"); // �ʱ�ȭ�� 0���� ǥ��
		display.setFont(font); // display TextField ��Ʈ ����
		display.setHorizontalAlignment(JTextField.RIGHT); // ������ ����
		
		displayPanel.add(tmp); // displayPanel�� tmp TextField �߰�
		displayPanel.add(display); // displayPanel�� display TextField �߰�
		
		
		// Button Panel �κ�
		btnInt = new JButton[10]; // ũ�Ⱑ 10�� Button �迭 ��ü ������ ���� �޸� ����
		for (int i=0; i<btnInt.length; i++) { // ���� ���� ��ư ��ü ���� �� ��Ʈ ����
			btnInt[i] = new JButton("" + i); // ������ ��ư�� ���� �ؽ�Ʈ ����
			btnInt[i].setFont(font); // ���� ��ư ��Ʈ ����
			btnInt[i].addActionListener(this); // �̺�Ʈ ������ ��ü ���
			btnInt[i].setActionCommand("" + i); // �̺�Ʈ Ŀ�ǵ� �� ��ư�� ���ڷ� ���
		}
		
		btnPlus = new JButton("+"); // + ��ư ��ü ����
		btnPlus.setFont(font); // + ��ư ��Ʈ ����
		btnPlus.addActionListener(this); // �̺�Ʈ ������ ��ü ���
		btnPlus.setActionCommand("plus"); // �̺�Ʈ Ŀ�ǵ� ���
		
		btnEqual = new JButton("="); // = ��ư ��ü ����
		btnEqual.setFont(font); // = ��ư ��Ʈ ����
		btnEqual.addActionListener(this); // �̺�Ʈ ������ ��ü ���
		btnEqual.setActionCommand("equal"); // �̺�Ʈ Ŀ�ǵ� ���
		
		btnPanel.add(btnInt[1]); btnPanel.add(btnInt[2]); btnPanel.add(btnInt[3]); // btnPanel�� ��ư�� �߰�
		btnPanel.add(btnInt[4]); btnPanel.add(btnInt[5]); btnPanel.add(btnInt[6]);
		btnPanel.add(btnInt[7]); btnPanel.add(btnInt[8]); btnPanel.add(btnInt[9]);
		btnPanel.add(btnInt[0]); btnPanel.add(btnPlus);   btnPanel.add(btnEqual);
		
		
		// Default Panel �κ�
		btnClear = new JButton("Clear"); // Clear ��ư ��ü ����
		btnClear.setFont(font); // Clear ��ư ��Ʈ ����
		btnClear.addActionListener(this); // �̺�Ʈ ������ ��ü ���
		btnClear.setActionCommand("clear"); // �̺�Ʈ Ŀ�ǵ� ���
		
		defaultPanel.add(btnClear); // defaultPanel�� C ��ư �߰�
		
		
		// Panel���� �����ӿ� �߰�
		this.add(displayPanel, BorderLayout.NORTH); // displayPanel�� ���ʿ� ��ġ
		this.add(btnPanel, BorderLayout.CENTER); // btnPanel�� ����� ��ġ
		this.add(defaultPanel, BorderLayout.SOUTH); // defaultPanel��  ���ʿ� ��ġ
		
		this.setVisible(true); // ���α׷� ���� �� �������� ȭ�鿡 ǥ��
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) { // ActionListener �������̽��� actionPerformed method ����
		
		for (int i=0; i<btnInt.length; i++) {
			if (setEqual != true) { // = ��ư�� �ȴ����� ���¿���
				if (e.getActionCommand().equals("" + i)) { // ���� ��ư�� ��������
					if (display.getText().equals("0")) { // display�� "0", �� ó������
						tmp.setText("" + i); // tmp display�� �Է��� ��ư�� ���� ǥ��
						display.setText("" + i); // display�� �Է��� ��ư�� ���� ǥ��
					}
					else if (display.getText().equals("+")) { // + ��ư�� ���� �� ���� ��ư�� ��������
						tmp.setText(tmp.getText() + i); // ������ tmp display ȭ�鿡 �̾� �Է��� ��ư�� ���� ǥ��
						display.setText("" + i); // display�� �Է��� ��ư�� ���� ǥ��
					}
					else { // display�� "0"�� �ƴϰ� + ��ư�� ������ ���� ���¿��� ���� ��ư�� ��������
						tmp.setText(tmp.getText() + i); // ������ tmp display ȭ�鿡 �̾� �Է��� ��ư�� ���� ǥ��
						display.setText(display.getText() + i); // ������ display ȭ�鿡 �̾� �Է��� ��ư�� ���� ǥ��
					}
				}
			}
			else { // = ��ư�� ������ ��
				if (e.getActionCommand().equals("" + i)) { // ���� ��ư�� ��������
					sum = 0; // sum �ʱ�ȭ
					tmp.setText("" + i); // tmp display�� �Է��� ��ư�� ���� ǥ��
					display.setText("" + i); // display�� �Է��� ��ư�� ���� ǥ��
					setEqual = false; // setEqual �ʱ�ȭ
				}
				
			}
		}
		
		if (e.getActionCommand().equals("plus")) {
			if (setEqual != true) { // = ��ư�� �ȴ����� ���¿��� + ��ư�� ��������
				sum += Integer.parseInt(display.getText()); // sum�� ���� sum�� display�� ǥ�õ� ���ڸ� ���� ��
			}
			tmp.setText(tmp.getText() + " + "); // ������ tmp display ȭ�鿡 �̾� "+" ǥ��
			display.setText("+"); // display�� "+" ǥ��
			setEqual = false; // setEqual �ʱ�ȭ
		}
		
		if (e.getActionCommand().equals("equal")) {
			if (setEqual != true) { // = ��ư�� �ȴ����� ���¿��� = ��ư�� ��������
				sum += Integer.parseInt(display.getText()); // sum�� ���� sum�� display�� ǥ�õ� ���ڸ� ���� ��
				display.setText("" + sum); // display�� sum �� ǥ��
				setEqual = true; // setEqual�� ������ ���¸� �ǹ�
			}
		}
		
		if (e.getActionCommand().equals("clear")) { // Clear ��ư�� ��������
			tmp.setText(""); // tmp display �ʱ�ȭ
			display.setText("0"); // display �ʱ�ȭ
			sum = 0; // sum Field �ʱ�ȭ
		}
	}

}
