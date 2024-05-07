package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public class TestSup1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자의 국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		System.out.print("사용자의 영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		System.out.print("사용자의 수학 점수를 입력하세요 : ");
		int mth = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		
		Score Score = new Score(kor, eng, mth);
		
		Score.result();
		
	}
}
