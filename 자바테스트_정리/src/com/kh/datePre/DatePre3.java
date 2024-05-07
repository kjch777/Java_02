package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre3 {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy / MM / dd / E");
		
		// sdf 는 형식 지정일 뿐이고 날짜를 가져오는 것은 now 이다.
		String change = sdf.format(now);
		System.out.println(change);
		
		System.out.println("주민등록번호 8자리");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		String change2 = sdf2.format(now);
		System.out.println(change2);
		
		System.out.println("주민등록번호 6자리");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyMMdd");
		String change3 = sdf3.format(now);
		System.out.println(change3);
	}
}
