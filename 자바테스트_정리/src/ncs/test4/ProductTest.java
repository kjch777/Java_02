package ncs.test4;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("��ǰ ������ �Է��ϼ��� : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("��ǰ ������ �Է��ϼ��� : ");
		int quantity = Integer.parseInt(sc.nextLine());
		
		// �Է¹��� ���� ��ü Product �� ���� ��
		Product p1 = new Product(name, price, quantity); // ��ȣ �ȿ� ä���
		
		// ��� �ϱ�
		System.out.println(p1.information());
		
	}
}
