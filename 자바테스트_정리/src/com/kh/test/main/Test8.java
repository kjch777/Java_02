package com.kh.test.main;

public class Test8 { // 삼항 연산자 연습
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		String 비교 = (num1 > num2) ? "num1이 더 크다" : "num2가 더 크다";
		System.out.println(비교);
		
		int num3 = 15;
		String 홀짝 = ((num3 % 2) == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(홀짝);
		
		int age = 18;
		String 결과 = (age >= 20) ? "성인입니다." : "미성년자입니다.";
		System.out.println(결과);
		
		int kor = 80;
		int eng = 75;
		int mth = 90;
		String result = (kor >= 60 && eng >= 60 && mth >= 60) ? "합격입니다." : "불합격입니다.";
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		String r1 = (n1 == n2) ? "같은 수" : "다른 수";
		System.out.println(r1);
		
	}
}
