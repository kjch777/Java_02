package com.kh.BasicEx;

public class 가비지컬렉터그림판 {
	
	public static void main(String[] args) {
		String 전화번호 = "010";      // 가비지 컬렉션에 의해 Heap에서 사라진다.
		System.out.println(전화번호); // 가비지 컬렉션에 의해 Heap에서 사라진다.
		       
		       전화번호 += "-1234-5648";
		System.out.println(전화번호);
	}
	
}
