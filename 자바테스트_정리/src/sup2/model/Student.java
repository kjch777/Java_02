package sup2.model;

import java.util.Scanner;

public class Student {
	
	String name;
	int grade;
	int cN;
	int num;
	char gender;
	double score;
	
	public Student(String name, int grade, int cN, int num, char gender, double score) {
		// super();
		this.name = name;
		this.grade = grade;
		this.cN = cN;
		this.num = num;
		this.gender = gender;
		this.score = score;
	}

	public void information() {
		String gC = (gender == 'M' || gender == 'm') ? "���л�" : "���л�";
		System.out.println("�л��� �̸��� " + name + "�Դϴ�.");
		System.out.println("�л��� �г��� " + grade + "�г��Դϴ�.");
		System.out.println("�л��� ���� " + cN + "���Դϴ�.");
		System.out.println("�л��� ��ȣ�� " + num + "���Դϴ�.");
		System.out.println("�л��� " + gC + "�Դϴ�.");
		System.out.println("�л��� ������ " + score + "���Դϴ�.");
	}
}
