package com.kh.test.main;

public class Test8 { // ���� ������ ����
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		String �� = (num1 > num2) ? "num1�� �� ũ��" : "num2�� �� ũ��";
		System.out.println(��);
		
		int num3 = 15;
		String Ȧ¦ = ((num3 % 2) == 0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.println(Ȧ¦);
		
		int age = 18;
		String ��� = (age >= 20) ? "�����Դϴ�." : "�̼������Դϴ�.";
		System.out.println(���);
		
		int kor = 80;
		int eng = 75;
		int mth = 90;
		String result = (kor >= 60 && eng >= 60 && mth >= 60) ? "�հ��Դϴ�." : "���հ��Դϴ�.";
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		String r1 = (n1 == n2) ? "���� ��" : "�ٸ� ��";
		System.out.println(r1);
		
	}
}
