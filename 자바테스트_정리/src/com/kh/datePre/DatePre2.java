package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre2 {
	public static void main(String[] args) {
		
		// 날짜 형식에 yyyy MM dd 만 넣어주면,
		// 시 분 초는 00 으로 출력된다.
		// - 이외에 다른걸 쓰면 시 분 초를 못 불러온다.
		
		// Date 불러오기
		Date now = new Date();
		
		// SimpleDateFormat 불러오고 형식 지정하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		// Date ▶ String
		String 문자열 = sdf.format(now);
		System.out.println(문자열);
		
		// String ▶ Date
		try {
			Date 날짜 = sdf.parse(문자열);
			System.out.println(날짜);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
}
