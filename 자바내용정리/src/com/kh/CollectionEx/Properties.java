package com.kh.CollectionEx;
/*
 Map : 인터페이스 / HashMap TreeMap LinkedMap 클래스를 사용해야 한다.
 
 Properties : 키(key) - 값(value) 문자열 형태로 저장되는 클래스이다.
 			  일반적으로 속성 파일을 읽거나 쓸 때 사용한다.
              주로 텍스트 파일로 저장된다.
              키와 값이 모두 문자열이다.
   	메서드
   		 .load() : 파일을 대기
   	    .store() : 파일을 저장
  .getProperty() : 값 전달
  .setProperty() : 값 설정
  .loadFromXML() : xml 파일을 대기
   .storeToXML() : xml 파일을 저장
   		파일 안에 주석을 작성하는 것도 가능한데, 이 때 주석은 # 과 ! 를 사용한다.
   		
		Properties 키와 값을 설정할 때, 한글로 작성해서 파일로 저장할 경우,
		한글이 유니코드 형태(\U5BC) 로 보일 수도 있으므로, 영어로 작성하는 것을 권장한다.
		
		Properties 는 설정 파일이고, 자바에서 코드로 작성하여 파일로 보낼 때는
		" " 를 사용하여 키와 값을 집어넣지만, 추후 저장되는 값은 무조건 String 이 아니기 때문에
		Object 를 사용하여 전체 조회를 할 수 있다.
		
		전체조회 코드예제
		for(Map.Entry<Object, Object> 새로운변수명 : 이미있는변수명.entrySet()) {
			Object key = e.getKey();		// 키 가져오기
			Object value = e.getValue();    // 값 가져오기
		}
 */
public class Properties {

}
