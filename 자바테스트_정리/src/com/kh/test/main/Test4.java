package com.kh.test.main;

import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		if (num1 < 1 || num1 > 9) {
			System.out.println("범위를 벗어났습니다.");
			return; // 프로그램 종료
		}
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		if (num2 < 1 || num2 > 9) {
			System.out.println("범위를 벗어났습니다.");
			return; // 프로그램 종료
		}

		int 더하기 = num1 + num2;
		int 빼기 = num1 - num2;
		int 곱하기 = num1 * num2;
		double 나누기 = num1 / num2;
		double 몫 = num1 % num2;

		System.out.println("더하기 = " + 더하기);
		System.out.println("빼기 = " + 빼기);
		System.out.println("곱하기 = " + 곱하기);
		System.out.println("나누기 = " + 나누기);
		System.out.println("몫 = " + 몫);
	}
}