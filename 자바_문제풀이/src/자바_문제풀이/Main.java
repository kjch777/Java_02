package 자바_문제풀이;

import java.util.Scanner;

/*
 문자열 입력받고 길이 출력하기
 finish 입력되면 종료하기 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("문자열을 입력하세요 : ");
			String str = sc.nextLine();
			if(str.equals("finish")) {
				break;
			} else {
				System.out.println(str.length());
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
