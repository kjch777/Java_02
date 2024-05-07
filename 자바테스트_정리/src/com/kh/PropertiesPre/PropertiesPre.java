package com.kh.PropertiesPre;
// 단축키 : Ctrl + Shift + S == 모두 한꺼번에 저장하기
import java.util.Map;
import java.util.Properties;

public class PropertiesPre {

	public static void main(String[] args) {
		Properties 설정 = new Properties();
		
		// 속성 설정
		설정.setProperty("이름", "김철수");
		설정.setProperty("나이", "15"); // 숫자를 포함한 모든 표기는 " " 안에 작성해주어야 한다.
		설정.setProperty("주소", "서울");
		
		// 특정 값 조회하기
		String 이름조회 = 설정.getProperty("이름");
		System.out.println("이름 : " + 이름조회);
		
		// 전체 조회하기
		System.out.println("===== 전체 조회 =====");
		
		// Properties 도 Map.Entry 를 사용하여 전체 조회를 할 수 있다.
		// Properties 는 문자열로 키와 값을 작성하지만, Object 를 써야 한다.
		for(Map.Entry<Object, Object> e : 설정.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
	}
	
}
