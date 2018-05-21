import java.awt.FlowLayout;
import javax.swing.*;

public class MyFrame extends JFrame {
	// Constructor
	MyFrame() {
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("KOO's 2nd frame");
		
		// 새로운 컴포넌트를 프레임에 추가
//		FlowLayout f1 = new FlowLayout(); // FlowLayout 객체 생성, 컴포넌트들을 순차적으로 배치하는 방식
//		this.setLayout(f1); // setLayout() 배치 매니저 method 사용
		setLayout(new FlowLayout()); // 12, 13번줄을 한줄로 정리
		JLabel label = new JLabel("네자리 정수를 입력하세요 : "); // 레이블 객체 생성
		JTextField tf = new JTextField(20); // 텍스트필드 객체 생성, 가로 안은 텍스트필드의 길이
		JButton button = new JButton("KOO's button"); // 버튼 객체 생성
		
		button.setText("구범모"); // 버튼 이름 설정
		tf.setText("봄은봄이로데졸립구먼");
		
		// 패널 생성
		JPanel panel = new JPanel(); // 패널 객체 생성
		panel.add(label); // 레이블 객체를 패널에 추가
		panel.add(tf); // 텍스트필드 객체를 패널에 추가
		
		this.add(button); // 버튼 객체를 프레임에 추가
		this.add(panel); // panel을 프레임에 추가
//		this.add(label); // 레이블 객체를 프레임에 추가
//		this.add(tf); // 텍스트필드 객체를 프레임에 추가
//		pack(); // 프레임의 크기를 그 안에 있는 컴포넌트 크기에 맞춘다
		
		this.setVisible(true);
		
	}
}
