package pre.propertiesEx;

import java.io.*;
import java.util.*;

public class PropTest {
	
	public static void fileOpen(Properties p) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("movies.xml"); // open ▶ input
			p.loadFromXML(fis); // Properties.xml 에서 가져오기(FileInputStream);
			fis.close(); // FileInputStream 끝내기
			
			List<Movies> movieList = new ArrayList(); // 리스트 만들기
			
			for(String s : p.stringPropertyNames()) {
				// 문자열 값 : 설정 파일.문자열로 되어 있는 설정 이름들
				
				String[] values = p.getProperty(s).split(", ");
				// 문자열 배열에 설정 파일.문자열 값을 (,띄어쓰기) 를 기준으로 구분하여 각각 하나씩 집어넣기
				
				String 제목 = values[0]; // 문자열 배열의 0번 인덱스에 있는 값은 title 이다. 그 제목을 문자열 값으로 제목에 저장한다.
				
				int 평점 = Integer.parseInt(values[1]); // 문자열 값을 숫자 값으로 변경해주는 코드
				int 관객수 = Integer.parseInt(values[2]); // 문자열 값을 숫자 값으로 변경해주는 코드
				
				Movies 영화들 = new Movies(제목, 평점, 관객수); // Movies 영화들 이라는 새 공간을 만들고, 거기에 제목, 평점, 관객수를 값으로 집어 넣는다.
				
				movieList.add(영화들); // 리스트에 값 집어넣기
				
				Movies[] 정렬                		=	 movieList.toArray(new Movies[0]); 
				// 배열을 만들어야 정렬을 할 수 있다.         리스트에 있는 값들을 이름순으로 정렬하겠다는 코드
				
				Arrays.sort(정렬); // 실제 정렬 수행하기
				
				System.out.println("===== 영화 목록 =====");
				
				for(Movies m : movieList) {
				// 리스트에 있는 값을 하나하나 빼오기
					
					System.out.println(m);
				}
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void fileSave(Properties p) {
		// Properties 에 xml 파일로 내용 저장하기
		p.setProperty("1", "패밀리맨, 4, 2000");
		p.setProperty("2", "엘리멘탈, 5, 2023");
		p.setProperty("3", "투모로우, 5, 2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movies are fun.");
			fos.close(); // 파일 저장 후 종료 
			System.out.println("설정이 movies.xml 파일에 저장되었습니다.");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	
		Properties p = new Properties();
		fileSave(p);
		
	}
	
}
