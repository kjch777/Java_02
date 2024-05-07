package com.kh.test.main;

public class Test2 {
	public static void main(String[] args) {
		for (int Dan = 2; Dan <= 5; Dan++) {
			System.out.println("===== " + Dan + "단 =====");
			for (int i = 1; i <= 9; i++) { // i += 2 : i를 2씩 증가하게 하는 코드
				if (((Dan * i) % 2) == 1) {
					System.out.println(Dan + " X " + i + " = " + Dan * i);
				}
			}
		}
	}
}
