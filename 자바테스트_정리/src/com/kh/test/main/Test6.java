package com.kh.test.main;

import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : 
			System.out.println("입력 완료");
			break;
		case 2 : 
			System.out.println("조회 시작");
			break;
		case 3 : 
			System.out.println("수정 완료");
			break;
		case 4 : 
			System.out.println("삭제 완료");
			break;
		case 5 : 
			System.out.println("정상 종료");
			break;
		default : 
			System.out.println("입력 오류");
			break;
		}
		sc.close();
	}
}
