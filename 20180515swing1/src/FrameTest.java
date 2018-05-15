import javax.swing.JFrame; // javax.swing. 까지는 패키지 이름

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("KOO's frame");
		frame.setSize(900,500); // GUI에서는 x,y 축이 왼쪽 위에서 시작
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임을 닫으면 프로세스를 끝내기 위한 코드, EXIT_ON_CLOSE는 JFrame 클래스의 static variable
		frame.setVisible(true);
	}

}
