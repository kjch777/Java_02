package com.kh.test.main;

import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		sc.nextLine(); // ���� �����
		if (num1 < 1 || num1 > 9) {
			System.out.println("������ ������ϴ�.");
			return; // ���α׷� ����
		}
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		sc.nextLine(); // ���� �����
		if (num2 < 1 || num2 > 9) {
			System.out.println("������ ������ϴ�.");
			return; // ���α׷� ����
		}

		int ���ϱ� = num1 + num2;
		int ���� = num1 - num2;
		int ���ϱ� = num1 * num2;
		double ������ = num1 / num2;
		double �� = num1 % num2;

		System.out.println("���ϱ� = " + ���ϱ�);
		System.out.println("���� = " + ����);
		System.out.println("���ϱ� = " + ���ϱ�);
		System.out.println("������ = " + ������);
		System.out.println("�� = " + ��);
	}
}