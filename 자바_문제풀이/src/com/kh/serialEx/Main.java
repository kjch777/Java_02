package com.kh.serialEx;

import java.io.*;

// ����ȭ
public class Main {
	public static void main(String[] args) {
		
		// ����ȭ �� �����͸� ���Ϸ� �����ϱ�
		String fileName = "student.txt";
		
		// ����ȭ�Ͽ� ������ ��ü �����ϱ�
		Student student = new Student("��¯��", 5);
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// ��ü�� ����ȭ�Ͽ� ���� �ۼ��ϱ�
			oos.writeObject(student);
			oos.close(); // .close(); �� ������ ������� �ʴ´�.
			System.out.println("��ü�� ����ȭ�Ͽ� ���Ͽ� �����Ͽ����ϴ�.");
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
