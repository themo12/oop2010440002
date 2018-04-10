
public class Point {
	// Fields
	private double x;
	private double y;
	
	// Methods
	public String toString() {
		return ("(" + this.x + ", " + this.y + ")");
		// this.x, this.y�� double�̱� ������ java���� �� double�� �˾Ƽ� string���� �ٲ��ش�.
	}
	public void print() {
		System.out.println("(" + this.x + ", " + this.y + ")");
//		System.out.println("(" + getX() + ", " + getY() + ")");
//		System.out.println("(" + this.getX() + ", " + this.getY() + ")");
	}
	public double distance() {
		
//		// ��ȯ�� ���� ����
//		double result; // ��������
//		// ���������� scope�� �޼ҵ� ����
//		
//		// �Ÿ� ���
//		result = Math.sqrt(x*x+y*y); // x,y�� �ʵ�
//		
//		// �Ÿ� ��ȯ
//		return result;
		
		// ������ ���ٷ�
		return Math.sqrt(x*x+y*y);
	}
	
	// method overloading : ���� �̸��� method������ �Ű������� �ٸ��� ���־� method�� �������ش�.
	public double distance(Point p) {
		return Math.sqrt( ( this.x - p.getX() ) * ( this.x - p.getX() )
						+ ( this.y - p.getY() ) * ( this.y - p.getY() ));
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
