package �ڹ�_����Ǯ��;

public class Circle {
	
	public static final double PI = 3.14;
	public double radius;
	
	// �⺻ �����ڰ� ��� ������ �߻������� �ʴ� �� ����.
	
	public Circle(double radius) {
		// super(); �θ� Ŭ���������� �ʿ� ����.
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	public void draw() {
		System.out.println("������ " + radius + "cm�� ���� �׸��ϴ�.");
	}
	
	public static void main(String[] args) {
	
		Circle circle = new Circle(2.5);
		circle.draw();
		
	}
	
}
