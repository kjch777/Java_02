package com.kh.test.main;

import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : 
			System.out.println("�Է� �Ϸ�");
			break;
		case 2 : 
			System.out.println("��ȸ ����");
			break;
		case 3 : 
			System.out.println("���� �Ϸ�");
			break;
		case 4 : 
			System.out.println("���� �Ϸ�");
			break;
		case 5 : 
			System.out.println("���� ����");
			break;
		default : 
			System.out.println("�Է� ����");
			break;
		}
		sc.close();
	}
}
