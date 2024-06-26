package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; // .util

public class DatePre {

	public static void main(String[] args) {
		// 현재 날짜와 시간
		Date now = new Date();
		System.out.println(now);
		
		// Fri May 03 10:29:56 KST 2024 형식을
		// SimpleDateFormat 을 사용하여 변경하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH : mm : ss");
		
		// now 값을 문자열로 변경하기
		String formatDate = sdf.format(now);
		System.out.println(formatDate);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 / MM월 / dd일");
		String formatDate2 = sdf2.format(now);
		System.out.println(formatDate2);
		
		// 문자열(SimpleDateFormat String)을 날짜(Date)로 변경하기
		String 문자열 = "2024-05-03 11 : 18 : 30"; // sdf 의 형식과 문자열 의 형식이 같아야 한다.
		try {
			Date parse = sdf.parse(문자열); // sdf 의 형식과 문자열 의 형식이 같아야 한다. 
			System.out.println(parse);
			// Date 로 변경할 때, 문제가 발생할 수 있으니 try-catch 를 사용하라는 주의문구가 출력된 것이다.
		} catch (ParseException e) {

			e.printStackTrace();
		} 
		
	}
	
}
