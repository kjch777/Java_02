package sup2.controller;

import java.util.Scanner;

import sup2.model.Student;

public class TestSup2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("�л��� �г��� �Է��ϼ��� : ");
		int grade = sc.nextInt();
		sc.nextLine(); // ���� �����
		System.out.print("�л��� ���� �Է��ϼ��� : ");
		int cN = sc.nextInt();
		sc.nextLine(); // ���� �����
		System.out.print("�л��� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine(); // ���� �����
		System.out.print("�л��� ������ �Է��ϼ��� : ");
		char gender = sc.next().charAt(0); // char 1�ڸ�
		System.out.print("�л��� ������ �Է��ϼ��� : ");
		double score = sc.nextDouble();
		sc.nextLine(); // ���� �����
		
		Student �������� = new Student(name, grade, cN, num, gender, score);
		��������.information();
	}
	
}
