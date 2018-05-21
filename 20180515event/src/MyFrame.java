import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//프레임 만드는 두번째 방법 : JFrame으로부터 상속받은 클래스를 만든다.
public class MyFrame extends JFrame implements ActionListener{ // 두 번째 이벤트 리스너 구현 방법 : 하나의 클래스에서 구현
	// 필드 : 모든 메소드에서 접근할 수 있다.
	JButton button, btn;
	JTextField tf;
	
	// Constructor
	MyFrame() {
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("KOO's event");
		
		// 새로운 컴포넌트를 프레임에 추가
		this.setLayout(new FlowLayout()); // setLayout() 배치 매니저 사용, FlowLayout 객체 생성, FlowLayout()은 컴포넌트들을 순차적으로 배치하는 방식
		this.button = new JButton("KOO's button"); // 버튼 객체 생성
		this.add(this.button); // 버튼 객체를 프레임에 추가
		this.button.setActionCommand("button1");
//		MyListener listener = new MyListener(); // 이벤트 리스너 객체 생성
//		button.addActionListener(listener); // 이벤트 리스너 객체 등록
		button.addActionListener(this); // 이벤트 리스너 객체 등록
		
		this.btn = new JButton("두번째 버튼");
		this.add(btn);
		this.btn.setActionCommand("button2");
		btn.addActionListener(this); // 이벤트 리스너 객체 등록
		
		tf = new JTextField(20); // 텍스트필드 객체 생성
		this.add(tf); // 텍스트필드 객체를 프레임에 추가
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if ((e.getActionCommand()).equals("button1"))
			this.tf.setText("첫 번째 버튼");
		else
			this.tf.setText("두 번째 버튼");
		
//		JButton button = (JButton) e.getSource(); // 액션이벤트객체에서 눌려진 버튼 객체를 (버튼 객체의 reference 값) 가져온다.
//		this.button.setText("버튼이 또또또또 눌러졌어요!!");
//		this.tf.setText("텍스트필드에 마구 글자를 넣었어요");
//		System.out.println("OMG 버튼이 눌러졌어요!!!!!");
		}
}
