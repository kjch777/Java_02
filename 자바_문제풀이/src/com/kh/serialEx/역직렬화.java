package com.kh.serialEx;

import java.io.*;

public class ������ȭ {
	public static void main(String[] args) {
		
		// ����ȭ �� ���� �ҷ�����
		String fileName = "student.txt";
		
		try {
			
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// ���Ͽ��� ��ü�� ������ȭ�ϰ� �о����
			Student student = (Student) ois.readObject();
			System.out.println("���Ϸκ��� ��ü�� ������ȭ�Ͽ����ϴ�.");
			System.out.println("������ȭ �� student.txt : " + student);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
