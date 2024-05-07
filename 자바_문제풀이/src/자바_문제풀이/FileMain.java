package 자바_문제풀이;

import java.io.*;
/*
 이어서 작성하기 
 */
public class FileMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("animal.txt", true);
			fw.write("\n코뿔소, 10");
			fw.write("\n코끼리 친구 코뿔소");
			fw.close(); // .close(); 로 닫아주어야 저장이 완료된다.
			System.out.println("이어쓰기 저장완료");
		} catch (IOException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
}
