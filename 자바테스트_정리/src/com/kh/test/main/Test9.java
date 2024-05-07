package com.kh.test.main;

public class Test9 {
	public static void main(String[] args) {
		String[] 요일 = {"월", "화", "수"};
		for(String 날짜 : 요일) {
			System.out.println(날짜);
		}
		
		// .length 는 장바구니같은 배열에 들어있는 갯수를 의미한다.
		System.out.println("요일의 길이 : " + 요일.length);
		
		// index 로 각 자리에 어떤 값이 들어있는지 확인하고 싶다면,
		// 변수명[알고싶은 자리의 숫자]
		System.out.println("요일 0번째 자리 : " + 요일[0]);
		
		// index 를 이용하여 요일 1번 자리에 있는 값과,
		// 요일 2번 자리에 있는 값 출력해보기
		System.out.println("요일 1번째 자리 : " + 요일[1]);
		System.out.println("요일 2번째 자리 : " + 요일[2]);
	}
}
