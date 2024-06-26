package com.kh.test.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한글을 입력하세요 : ");
		String put = sc.nextLine();
		
		// 반복하는 패턴이 가-힣 으로 한글이라면
		if(Pattern.matches("^[가-힣]*$", put)) {
			System.out.println("입력한 문자열은 한글입니다.");
		} else {
			System.out.println("한글만 입력해주세요.");
		}
		
		// 전화번호 0-9 입력하는 스캐너 만들어보기
		System.out.print("전화번호를 입력하세요 : ");
		String pN = sc.nextLine(); // Pattern.matches(문자열 형식으로 값을 받기 때문에 String)
		
		if(Pattern.matches("^[0-9]*$", pN)) {
			System.out.println("입력한 문자열은 전화번호 형식입니다.");
			// Integer.parseInt(pN); ◀ String 을 Integer 로 강제 형변환 해줄 수도 있다.
		} else {
			System.out.println("입력한 문자열은 전화번호 형식이 아닙니다.");
		}
	}
}
