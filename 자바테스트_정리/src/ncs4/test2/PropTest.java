package ncs4.test2;

import java.io.*;
import java.util.*;

public class PropTest {
	// 파일 저장
	public static void fileSave(Properties p) throws IOException {
		// Properties 객체에 데이터 저장하기
		// .setProperty("", ""); // "" 밖에는 , 가 하나만 존재해야 하며,
		// "" 안에는 띄어쓰기도 인식한다.
		p.setProperty("1", "apple, 1200, 3");
		p.setProperty("2", "banana, 2500, 2");
		p.setProperty("3", "grape, 4500, 5");
		p.setProperty("4", "orange, 800, 10");
		p.setProperty("5", "melon, 5000, 2");
		
		// Properties 객체를 xml 파일로 저장하기
		FileOutputStream fos = new FileOutputStream("data.xml");
		p.storeToXML(fos, null); // xml 파일로 저장하겠다는 코드
		// fos : 입출력을 입력하겠다는 코드 // null : 코멘트로 설명을 달아서 저장하겠다는 코드
		// 추가로 작성할 설명이 없으면 null 로 처리됨.
		fos.close(); // 종료
	}
	
	// 파일 읽기
	public static void fileOpen(Properties p) {
		try {
			// Properties 객체에 xml 파일 내용 읽어올 준비하기
			FileInputStream fis = new FileInputStream("data.xml");
			
			p.loadFromXML(fis);
			fis.close(); // 종료
			
			// Properties 객체에 키-값 형식으로 Fruit 객체를 List 로 저장하기
			List<Fruit> fruits = new ArrayList();
			
			// 파일에 저장하기
			for(String key : p.stringPropertyNames()) { // 설정에 작성되어 있는 문자 형식의 이름을 가져와서,
				// key 로 넣기
				String[] values = p.getProperty(key).split(", ");
				// "apple, 1_200, 3" 을 , 로 구분하여 각각 값을 저장하겠다는 코드
				
				//                    "apple",                      1200,                             3
				//                     String                  String ▶ int                    String ▶ int
				Fruit 과일 = new Fruit(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
				fruits.add(과일);
				
				// List 를 배열로 변환하고, 오름차순으로 정렬하기
				Fruit[] 과일배열 = fruits.toArray(new Fruit[0]);
				
				// 정렬하기
				Arrays.sort(과일배열);
				
				// Fruit 과일배열 출력하기
				System.out.println("Fruit 과일 배열 출력");
				for(Fruit f : 과일배열) {
					System.out.println(f);
				}
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
			
		}
		
	// 최종 출력
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		fileSave(prop);
		fileOpen(prop);
	}
}
