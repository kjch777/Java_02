package 자바_문제풀이;

public class Circle {
	
	public static final double PI = 3.14;
	public double radius;
	
	// 기본 생성자가 없어도 문제가 발생하지는 않는 것 같다.
	
	public Circle(double radius) {
		// super(); 부모 클래스에서는 필요 없다.
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
		System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
	}
	
	public static void main(String[] args) {
	
		Circle circle = new Circle(2.5);
		circle.draw();
		
	}
	
}
