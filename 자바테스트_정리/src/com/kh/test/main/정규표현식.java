package com.kh.test.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ����ǥ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ѱ��� �Է��ϼ��� : ");
		String put = sc.nextLine();
		
		// �ݺ��ϴ� ������ ��-�R ���� �ѱ��̶��
		if(Pattern.matches("^[��-�R]*$", put)) {
			System.out.println("�Է��� ���ڿ��� �ѱ��Դϴ�.");
		} else {
			System.out.println("�ѱ۸� �Է����ּ���.");
		}
		
		// ��ȭ��ȣ 0-9 �Է��ϴ� ��ĳ�� ������
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		String pN = sc.nextLine(); // Pattern.matches(���ڿ� �������� ���� �ޱ� ������ String)
		
		if(Pattern.matches("^[0-9]*$", pN)) {
			System.out.println("�Է��� ���ڿ��� ��ȭ��ȣ �����Դϴ�.");
			// Integer.parseInt(pN); �� String �� Integer �� ���� ����ȯ ���� ���� �ִ�.
		} else {
			System.out.println("�Է��� ���ڿ��� ��ȭ��ȣ ������ �ƴմϴ�.");
		}
	}
}
