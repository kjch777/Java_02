package com.kh.test.main;

public class ParseString {
	public static void main(String[] args) {
		
		// 문자열을 숫자 값으로 강제 형변환 하기
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println("문자열을 정수 값으로 강제 형 변환 한 결과 : " + num1);
		
		String str2 = "123.45";
		double num2 = Double.parseDouble(str2);
		System.out.println("문자열을 실수 값으로 강제 형 변환 한 결과 : " + num2);
		
		// 정수를 문자열 값으로 강제 형변환 하기
		int num3 = 123;
		String str3 = Integer.toString(num3);
		System.out.println("정수 ▶ 문자열 강제형변환 : " + str3);
		
		double num4 = 123.45;
		String str4 = Double.toString(num4);
		System.out.println("실수 ▶ 문자열 강제형변환 : " + str4);
	}
}
