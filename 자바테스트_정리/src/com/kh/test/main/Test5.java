package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(((num1 >= 1) && (num1 <= 9)) && ((num2 >= 1) && (num2 <= 9))) { // if 문 조건은 여러개를 쓸 수 있다.
			int 곱 = num1 * num2;
			if(곱 >= 1 && 곱 <= 9) {
				System.out.println("한자리 수 입니다.");
			} else {
				System.out.println("두자리 수 입니다.");
			}
		} else {
			System.out.println("범위를 벗어났습니다.");
		}
	}
}
