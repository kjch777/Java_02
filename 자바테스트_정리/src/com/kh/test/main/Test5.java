package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(((num1 >= 1) && (num1 <= 9)) && ((num2 >= 1) && (num2 <= 9))) { // if �� ������ �������� �� �� �ִ�.
			int �� = num1 * num2;
			if(�� >= 1 && �� <= 9) {
				System.out.println("���ڸ� �� �Դϴ�.");
			} else {
				System.out.println("���ڸ� �� �Դϴ�.");
			}
		} else {
			System.out.println("������ ������ϴ�.");
		}
	}
}
