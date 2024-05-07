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
		String gC = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
		System.out.println("학생의 이름은 " + name + "입니다.");
		System.out.println("학생의 학년은 " + grade + "학년입니다.");
		System.out.println("학생의 반은 " + cN + "반입니다.");
		System.out.println("학생의 번호는 " + num + "번입니다.");
		System.out.println("학생은 " + gC + "입니다.");
		System.out.println("학생의 점수는 " + score + "점입니다.");
	}
}
