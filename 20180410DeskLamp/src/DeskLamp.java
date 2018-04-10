
public class DeskLamp {
	// Field
	private boolean isOn;
	
	// Method
	public void turnOn() {
		isOn = true;
	}
	public void turnOff() {
		isOn = false;
	}
	public String toString() {
		if(isOn) {
			return "켜져있습니다.";
		}
		else {
			return "꺼져있습니다.";
		}
		
		// 위에 if else를 한줄로 하면
//		return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
	}
}
