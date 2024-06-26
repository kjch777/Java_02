package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		// Date 사용하기
		Date now = new Date();
		
		// SimpleDateFormat 사용하기
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH시 mm분 ss초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd || HH : mm : ss");
		
		// String 으로 변경하기
		String result1 = sdf1.format(now);
		String result2 = sdf2.format(now);
		String result3 = sdf3.format(now);
		
		// 출력하기
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		// 문자열(SimpleDateFormat String) ▶ 날짜(Date) 로 변경하기
		String 문자열1 = "2024년 5월 3일"; // sdf1 의 형식과 문자열1 의 형식이 같아야 한다.
		try {
			Date parse1 = sdf1.parse(문자열1); // sdf1 의 형식과 문자열1 의 형식이 같아야 한다.
			System.out.println(parse1);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		String 문자열2 = "05시 06분 07초"; // sdf2 의 형식과 문자열2 의 형식이 같아야 한다.
		try {
			Date parse2 = sdf2.parse(문자열2); // sdf2 의 형식과 문자열2 의 형식이 같아야 한다.
			System.out.println(parse2);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
		String 문자열3 = "1234-56-78 || 01 : 02 : 03"; // sdf3 의 형식과 문자열3 의 형식이 같아야 한다.
		try {
			Date parse3 = sdf3.parse(문자열3); // sdf3 의 형식과 문자열3 의 형식이 같아야 한다.
			System.out.println(parse3);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
}
