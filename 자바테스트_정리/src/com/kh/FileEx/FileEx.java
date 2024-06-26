package com.kh.FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// 파일이 존재하는지 확인하기
		String fileName = "example.txt"; // String 변수명 = "파일 이름.확장자";  
		
		// 파일 만들고 글 작성하기
		// 파일을 만들 때 따로 경로 설정을 하지 않았을 경우,
		// 무조건 java 코드를 작성하고 있는 폴더 안에 만들어진다.
		// 따라서, 자바테스트_정리 안에 만들어졌다.
		File file = new File(fileName); // ( ) 안에 파일 이름을 넣어주어야 한다.
		
		// 파일이 존재하는지 확인하기
		if(file.exists()) {
			System.out.println("같은 이름의 파일이 이미 존재합니다.");
		} else {
			file.createNewFile();
			System.out.println(file + " 을/를 성공적으로 생성했습니다.");
		}
		
		// 글 작성하기
		FileWriter write = new FileWriter(file);
		write.write("파일 작성 예시 \n"); // \n 으로 줄바꿈 처리
		write.write("글 작성 방법 연습 중 \n");
		write.write("어지럽다 ㅠㅠ");
		
		// 글 작성을 완료했다면, .close() 로 닫아주어야 한다.
		// 파일을 수정하고 저장하지 않은 채로 종료하려 할 때,
		// 저장하겠습니까? 라는 창이 뜨면서 저장/취소 가 나오는 것처럼
		// .close() 를 사용한다는 것은 저장하기와 같은 의미이다.
		// .close() 를 작성하지 않는다는 것은 글을 작성만 하고 저장하지 않은 것과 같은 의미이다.
		write.close();
		System.out.println("파일 수정 완료");
	}
	
}
