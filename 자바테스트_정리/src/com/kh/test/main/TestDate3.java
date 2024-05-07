package com.kh.test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate3 {
	public static void main(String[] args) {
		
		// 정보
		int bY1 = 1987;
		int bM1 = 8;
		int bD1 = 14;
		
		// 현재
		Calendar pD = Calendar.getInstance();
		
		// 현재
		int pY1 = pD.get(Calendar.YEAR);
		int pM1 = pD.get(Calendar.MONTH) + 1;
		int pD1 = pD.get(Calendar.DAY_OF_MONTH);
		
		// 나이 계산
		int age = pY1 - bY1;
		
		if(pM1 < bM1 || (bM1 == pM1) && (pD1 < bD1)) {
			age--;
		}
		
		// 생일 요일 계산
		Calendar bD = new GregorianCalendar(bY1, bM1 -1, bD1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일");
		
		// 출력하기
		System.out.println("생일 : " + sdf.format(bD.getTime()));
		System.out.println("오늘 : " + sdf.format(pD.getTime()));
		System.out.println("나이 : " + age + "살");
	}
}
