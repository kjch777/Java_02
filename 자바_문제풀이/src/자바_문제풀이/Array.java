package �ڹ�_����Ǯ��;

public class Array {
	public static void main(String[] args) {
		Circle[] circles = new Circle[2];
		
		// for �� ���� ���� Ȯ��
		// i ���� ��������� ������ Ȯ��
		// circles[0], circles[1] �� �ڸ��� ���� ��������� ������ Ȯ��
		System.out.println("circles[0] : " + circles[0]);
		
		// ���� ����ִٸ� ���� �־��ְų�, null
		circles[0] = new Circle(1.5);
		circles[1] = new Circle(3.5);
		
		for(int i = 0; i < circles.length; i++) {
			System.out.println(circles[i].getRadius());
		}
	}
}
