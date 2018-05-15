import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
// 첫 번째 이벤트 리스너 구현 방법 : 다른 클래스에서 구현
public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource(); // 액션이벤트객체에서 눌려진 버튼 객체를 (버튼 객체의 reference 값) 가져온다.
		button.setText("버튼이 눌러졌어요!!");
		System.out.println("OMG 버튼이 눌러졌어요!!!!!");

	}

}
