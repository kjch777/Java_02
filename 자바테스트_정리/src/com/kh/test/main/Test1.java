package com.kh.test.main;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if((num>=1) && (num<=100)) {
			if((num % 2) == 0) {
				System.out.println("2�� ����Դϴ�.");
			} else {
				System.out.println("2�� ����� �ƴմϴ�.");
			}
		} else {
			System.out.println("1 ~ 100 ������ ������ �Է����ּ���.");
		}
		
		System.out.println("===== if - else if - if =====");
		
		int num1 = 5;
		
		if(num1 > 0) {
			System.out.println("����Դϴ�.");
		} else if (num1 < 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}
	}
}
