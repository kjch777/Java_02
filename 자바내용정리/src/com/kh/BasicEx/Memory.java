package com.kh.BasicEx;

public class Memory {

	// 자바가 컴퓨터에서 실행되고, 자바를 실행하기 위한 공간이 생성된다.
	public static void main(String[] args) {
		
		// 힙에는 내클래스 라는 객체가 생성된다.
		MyClass 내클래스 = new MyClass();
		
		// 스택에는 메인 메서드 안에 작성된 지역변수가 생성된다.
		int x = 10;
		String name = "동그라미";
		
	}
	
}
