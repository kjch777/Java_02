package com.kh.test.main;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if((num>=1) && (num<=100)) {
			if((num % 2) == 0) {
				System.out.println("2의 배수입니다.");
			} else {
				System.out.println("2의 배수가 아닙니다.");
			}
		} else {
			System.out.println("1 ~ 100 사이의 정수만 입력해주세요.");
		}
		
		System.out.println("===== if - else if - if =====");
		
		int num1 = 5;
		
		if(num1 > 0) {
			System.out.println("양수입니다.");
		} else if (num1 < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
	}
}
