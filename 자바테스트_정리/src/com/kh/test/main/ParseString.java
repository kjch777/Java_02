package com.kh.test.main;

public class ParseString {
	public static void main(String[] args) {
		
		// ���ڿ��� ���� ������ ���� ����ȯ �ϱ�
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println("���ڿ��� ���� ������ ���� �� ��ȯ �� ��� : " + num1);
		
		String str2 = "123.45";
		double num2 = Double.parseDouble(str2);
		System.out.println("���ڿ��� �Ǽ� ������ ���� �� ��ȯ �� ��� : " + num2);
		
		// ������ ���ڿ� ������ ���� ����ȯ �ϱ�
		int num3 = 123;
		String str3 = Integer.toString(num3);
		System.out.println("���� �� ���ڿ� ��������ȯ : " + str3);
		
		double num4 = 123.45;
		String str4 = Double.toString(num4);
		System.out.println("�Ǽ� �� ���ڿ� ��������ȯ : " + str4);
	}
}
