package 퀴즈;

public class Bicycle implements Drivable{
	@Override
	public void brake() {
		System.out.println("브레이크를 잡다");
	}
	public void acc() {
		System.out.println("페달을 구르다");
	}
}
