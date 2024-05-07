package com.kh.test.main;

public class Test7 {
	public static void main(String[] args) {
		
		int[] 배열 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double 합계 = 0;
		
		for (int 찾기 : 배열) {
			if (찾기 % 2 != 0) {
				합계 += 찾기;
			}
		}
		
		System.out.println(합계);
		
	}
}
