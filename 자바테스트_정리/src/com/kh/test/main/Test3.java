package com.kh.test.main;

import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		int count = 0; // 반복 횟수. 몇번 반복했는지 확인
		
		while(num <= 100) {
			sum += num; // 총합 = num + num + ... 100번 ... + num
			count++; // 평균을 구할 때 필요한 수
			num++; // while 문을 100번 반복하게 해준다.
		}
		double avg = (double) sum / count;
		System.out.println(sum);
		System.out.println(avg);
		
		/*
		boolean rp = true;
		Scanner sc = new Scanner(System.in);
		String toDo = "";
		while (rp) {
			System.out.print("숫자 입력 : ");
			int date = sc.nextInt();
			switch (date) {
			case 1:
				toDo = "월요일 = 업무";
				break;
			case 2:
				toDo = "화요일 = 공부";
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				// return;
				rp = false;
				break;
			default:
				toDo = "휴식";
				break;
			}
			System.out.println("일정 = " + toDo); // switch - case 에선 출력문을 이렇게 밖으로 빼 놓는게 권장되지 않는다.
		}
		*/
	}
}
