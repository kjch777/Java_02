package �ڹ�_����Ǯ��;

import java.util.Scanner;

/*
 ���ڿ� �Է¹ް� ���� ����ϱ�
 finish �ԷµǸ� �����ϱ� 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			String str = sc.nextLine();
			if(str.equals("finish")) {
				break;
			} else {
				System.out.println(str.length());
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
