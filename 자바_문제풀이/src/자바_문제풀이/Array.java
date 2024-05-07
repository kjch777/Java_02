package 자바_문제풀이;

public class Array {
	public static void main(String[] args) {
		Circle[] circles = new Circle[2];
		
		// for 문 조건 범위 확인
		// i 값이 비어있지는 않은지 확인
		// circles[0], circles[1] 각 자리에 값이 비어있지는 않은지 확인
		System.out.println("circles[0] : " + circles[0]);
		
		// 값이 비어있다면 값을 넣어주거나, null
		circles[0] = new Circle(1.5);
		circles[1] = new Circle(3.5);
		
		for(int i = 0; i < circles.length; i++) {
			System.out.println(circles[i].getRadius());
		}
	}
}
