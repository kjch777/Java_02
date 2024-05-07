package com.kh.serialEx;

import java.io.*;

public class 역직렬화 {
	public static void main(String[] args) {
		
		// 직렬화 된 파일 불러오기
		String fileName = "student.txt";
		
		try {
			
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 파일에서 객체를 역직렬화하고 읽어오기
			Student student = (Student) ois.readObject();
			System.out.println("파일로부터 객체를 역직렬화하였습니다.");
			System.out.println("역직렬화 된 student.txt : " + student);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
