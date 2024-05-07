package com.kh.test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate3 {
	public static void main(String[] args) {
		
		// ����
		int bY1 = 1987;
		int bM1 = 8;
		int bD1 = 14;
		
		// ����
		Calendar pD = Calendar.getInstance();
		
		// ����
		int pY1 = pD.get(Calendar.YEAR);
		int pM1 = pD.get(Calendar.MONTH) + 1;
		int pD1 = pD.get(Calendar.DAY_OF_MONTH);
		
		// ���� ���
		int age = pY1 - bY1;
		
		if(pM1 < bM1 || (bM1 == pM1) && (pD1 < bD1)) {
			age--;
		}
		
		// ���� ���� ���
		Calendar bD = new GregorianCalendar(bY1, bM1 -1, bD1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� M�� d��");
		
		// ����ϱ�
		System.out.println("���� : " + sdf.format(bD.getTime()));
		System.out.println("���� : " + sdf.format(pD.getTime()));
		System.out.println("���� : " + age + "��");
	}
}
