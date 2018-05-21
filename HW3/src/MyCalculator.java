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

public class MyCalculator extends JFrame implements ActionListener{ // 이벤트 리스너를 하나의 클래스에서 구현
	
	
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
		this.setLayout(new BorderLayout()); // setLayout() 배치 매니저, 가운데를 중심으로 동서남북 배치 가능한 BorderLayout() method 사용
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임을 닫으면 프로세스를 끝내기 위한 코드, EXIT_ON_CLOSE는 JFrame 클래스의 static variable
		
		
		// (글씨체, 굵게, 글씨 크기) 설정하는 Font 객체 생성
		Font tmpFont = new Font("Serif", Font.PLAIN, 15); // tmp display를 위한 Font 설정
		Font font = new Font("Serif", Font.BOLD, 30); // 나머지 display와 버튼들을 위한 Font 설정
		
		
		// Panel 객체 생성 및 설정
		displayPanel = new JPanel(); // display를 위한 Panel 객체 생성
		btnPanel = new JPanel(); // button을 위한 Panel 객체 생성
		defaultPanel = new JPanel(); // clear 버튼을 위한 Panel 객체 생성
		
		displayPanel.setLayout(new GridLayout(2, 1, 5, 5)); // displayPanel은 (row, col, hgap, vgap)설정이 가능한 GridLayout() method 사용
		btnPanel.setLayout(new GridLayout(0, 3, 5, 5)); // btnPanel은 (row, col, hgap, vgap)설정이 가능한 GridLayout() method 사용
		defaultPanel.setLayout(new FlowLayout()); // defaultPanel은 순차적으로 배치 가능한 FlowLayout() method 사용
		
		
		// Display Panel 부분
		tmp = new JTextField(11); // 크기 11인 TextField 객체 생성
		tmp.setFont(tmpFont); // tmp TextField 폰트 설정
		tmp.setBackground(Color.lightGray); // tmp TextField의 배경색을 light gray로 설정
		tmp.setHorizontalAlignment(JTextField.RIGHT); // 오른쪽 정렬
		
		display = new JTextField(11); // 크기 11인 TextField 객체 생성
		display.setText("0"); // 초기화면 0으로 표시
		display.setFont(font); // display TextField 폰트 설정
		display.setHorizontalAlignment(JTextField.RIGHT); // 오른쪽 정렬
		
		displayPanel.add(tmp); // displayPanel에 tmp TextField 추가
		displayPanel.add(display); // displayPanel에 display TextField 추가
		
		
		// Button Panel 부분
		btnInt = new JButton[10]; // 크기가 10인 Button 배열 객체 생성을 위한 메모리 생성
		for (int i=0; i<btnInt.length; i++) { // 실제 숫자 버튼 객체 생성 및 폰트 설정
			btnInt[i] = new JButton("" + i); // 각각의 버튼에 숫자 텍스트 설정
			btnInt[i].setFont(font); // 숫자 버튼 폰트 설정
			btnInt[i].addActionListener(this); // 이벤트 리스너 객체 등록
			btnInt[i].setActionCommand("" + i); // 이벤트 커맨드 각 버튼의 숫자로 등록
		}
		
		btnPlus = new JButton("+"); // + 버튼 객체 생성
		btnPlus.setFont(font); // + 버튼 폰트 설정
		btnPlus.addActionListener(this); // 이벤트 리스너 객체 등록
		btnPlus.setActionCommand("plus"); // 이벤트 커맨드 등록
		
		btnEqual = new JButton("="); // = 버튼 객체 생성
		btnEqual.setFont(font); // = 버튼 폰트 설정
		btnEqual.addActionListener(this); // 이벤트 리스너 객체 등록
		btnEqual.setActionCommand("equal"); // 이벤트 커맨드 등록
		
		btnPanel.add(btnInt[1]); btnPanel.add(btnInt[2]); btnPanel.add(btnInt[3]); // btnPanel에 버튼들 추가
		btnPanel.add(btnInt[4]); btnPanel.add(btnInt[5]); btnPanel.add(btnInt[6]);
		btnPanel.add(btnInt[7]); btnPanel.add(btnInt[8]); btnPanel.add(btnInt[9]);
		btnPanel.add(btnInt[0]); btnPanel.add(btnPlus);   btnPanel.add(btnEqual);
		
		
		// Default Panel 부분
		btnClear = new JButton("Clear"); // Clear 버튼 객체 생성
		btnClear.setFont(font); // Clear 버튼 폰트 설정
		btnClear.addActionListener(this); // 이벤트 리스너 객체 등록
		btnClear.setActionCommand("clear"); // 이벤트 커맨드 등록
		
		defaultPanel.add(btnClear); // defaultPanel에 C 버튼 추가
		
		
		// Panel들을 프레임에 추가
		this.add(displayPanel, BorderLayout.NORTH); // displayPanel을 북쪽에 배치
		this.add(btnPanel, BorderLayout.CENTER); // btnPanel을 가운데에 배치
		this.add(defaultPanel, BorderLayout.SOUTH); // defaultPanel을  남쪽에 배치
		
		this.setVisible(true); // 프로그램 실행 시 프레임을 화면에 표시
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) { // ActionListener 인터페이스의 actionPerformed method 구현
		
		for (int i=0; i<btnInt.length; i++) {
			if (setEqual != true) { // = 버튼이 안눌러진 상태에서
				if (e.getActionCommand().equals("" + i)) { // 숫자 버튼이 눌러지면
					if (display.getText().equals("0")) { // display가 "0", 즉 처음에는
						tmp.setText("" + i); // tmp display에 입력한 버튼의 숫자 표시
						display.setText("" + i); // display에 입력한 버튼의 숫자 표시
					}
					else if (display.getText().equals("+")) { // + 버튼을 누른 후 숫자 버튼이 눌러지면
						tmp.setText(tmp.getText() + i); // 이전의 tmp display 화면에 이어 입력한 버튼의 숫자 표시
						display.setText("" + i); // display에 입력한 버튼의 숫자 표시
					}
					else { // display가 "0"이 아니고 + 버튼을 누르지 않은 상태에서 숫자 버튼이 눌러지면
						tmp.setText(tmp.getText() + i); // 이전의 tmp display 화면에 이어 입력한 버튼의 숫자 표시
						display.setText(display.getText() + i); // 이전의 display 화면에 이어 입력한 버튼의 숫자 표시
					}
				}
			}
			else { // = 버튼이 눌러진 후
				if (e.getActionCommand().equals("" + i)) { // 숫자 버튼이 눌러지면
					sum = 0; // sum 초기화
					tmp.setText("" + i); // tmp display에 입력한 버튼의 숫자 표시
					display.setText("" + i); // display에 입력한 버튼의 숫자 표시
					setEqual = false; // setEqual 초기화
				}
				
			}
		}
		
		if (e.getActionCommand().equals("plus")) {
			if (setEqual != true) { // = 버튼이 안눌러진 상태에서 + 버튼이 눌러지면
				sum += Integer.parseInt(display.getText()); // sum은 기존 sum에 display에 표시된 숫자를 더한 값
			}
			tmp.setText(tmp.getText() + " + "); // 이전의 tmp display 화면에 이어 "+" 표시
			display.setText("+"); // display에 "+" 표시
			setEqual = false; // setEqual 초기화
		}
		
		if (e.getActionCommand().equals("equal")) {
			if (setEqual != true) { // = 버튼이 안눌러진 상태에서 = 버튼이 눌러지면
				sum += Integer.parseInt(display.getText()); // sum은 기존 sum에 display에 표시된 숫자를 더한 값
				display.setText("" + sum); // display에 sum 값 표시
				setEqual = true; // setEqual이 눌러진 상태를 의미
			}
		}
		
		if (e.getActionCommand().equals("clear")) { // Clear 버튼이 눌러지면
			tmp.setText(""); // tmp display 초기화
			display.setText("0"); // display 초기화
			sum = 0; // sum Field 초기화
		}
	}

}
