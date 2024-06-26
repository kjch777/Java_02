package com.kh.FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePre {

	public static void main(String[] args) throws IOException {
		String fileName = "practice.txt";
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("같은 이름의 파일이 이미 존재합니다.");
		} else {
			file.createNewFile();
			System.out.println("파일을 성공적으로 생성했습니다.");
		}
		
		FileWriter write = new FileWriter(file);
		
		write.write("Java \nFile \nObject \n"); // \n 하고 띄어쓰기 안 해도 된다.
		write.write("Instance");
		
		write.close();
		
		System.out.println("파일에 내용을 성공적으로 작성했습니다.");

	}

}
