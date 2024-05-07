package sup2.controller;

import java.util.Scanner;

import sup2.model.Student;

public class TestSup2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("학생의 학년을 입력하세요 : ");
		int grade = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		System.out.print("학생의 반을 입력하세요 : ");
		int cN = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		System.out.print("학생의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		System.out.print("학생의 성별을 입력하세요 : ");
		char gender = sc.next().charAt(0); // char 1자리
		System.out.print("학생의 성적을 입력하세요 : ");
		double score = sc.nextDouble();
		sc.nextLine(); // 버퍼 지우기
		
		Student 가져오기 = new Student(name, grade, cN, num, gender, score);
		가져오기.information();
	}
	
}
