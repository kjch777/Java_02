package com.kh.test.main;

public class Test2 {
	public static void main(String[] args) {
		for (int Dan = 2; Dan <= 5; Dan++) {
			System.out.println("===== " + Dan + "�� =====");
			for (int i = 1; i <= 9; i++) { // i += 2 : i�� 2�� �����ϰ� �ϴ� �ڵ�
				if (((Dan * i) % 2) == 1) {
					System.out.println(Dan + " X " + i + " = " + Dan * i);
				}
			}
		}
	}
}
