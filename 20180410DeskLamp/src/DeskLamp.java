
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
			return "�����ֽ��ϴ�.";
		}
		else {
			return "�����ֽ��ϴ�.";
		}
		
		// ���� if else�� ���ٷ� �ϸ�
//		return "���� ���´� " + (isOn == true ? "����" : "����");
	}
}
