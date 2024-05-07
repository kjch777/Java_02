package com.kh.serialEx;

import java.io.*;

// 직렬화
public class Main {
	public static void main(String[] args) {
		
		// 직렬화 된 데이터를 파일로 저장하기
		String fileName = "student.txt";
		
		// 직렬화하여 전송할 객체 생성하기
		Student student = new Student("신짱구", 5);
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체를 직렬화하여 파일 작성하기
			oos.writeObject(student);
			oos.close(); // .close(); 가 없으면 저장되지 않는다.
			System.out.println("객체를 직렬화하여 파일에 저장하였습니다.");
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
