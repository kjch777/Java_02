package com.kh.test.main;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트예제 {
	public static void main(String[] args) {
		
		// ArrayList 생성
		ArrayList<String> 리스트 = new ArrayList<>(Arrays.asList("바나나", "오렌지"));
		
		// 값 추가   ▼                                                  ▲
		리스트.add("사과");
		System.out.println(리스트);
		
		// 값 제거
		리스트.remove("바나나"); // 값을 직접 작성해서 삭제
		리스트.remove(0); // 인덱스 위치 지정해서 삭제
		System.out.println(리스트); // 사과는 인덱스 2번에서 0번으로 이동한 것이다.
		
		// 값 변경
		리스트.set(0, "체리"); // .set(지정할 인덱스 위치, 지정할 값);
		System.out.println(리스트);
		
		리스트.add(1, "파파야"); // .add(지정할 인덱스 위치, 지정할 값);
		/*
		 리스트는 0부터 순서대로 +1 해서 자리가 생기는 것이기 때문에,
		 0 = 체리
		 1 = 비어있음
		 2 = 파파야
		 이런 식으로 값을 추가하는 것은 불가능하다.
		 추가할 땐, 인덱스 번호 순서대로 추가 해주어야 한다. 
		 */
		System.out.println(리스트);
		
		// 크기 확인
		System.out.println(리스트.size());
		
		// 포함 여부 확인
		System.out.println(리스트.contains("파파야"));
		
		// 인덱스 확인
		System.out.println(리스트.indexOf("체리")); // 체리는 인덱스 0번이기 때문에, 0이 나오는 것이다.
		//                                         체리가 없다는 것이 아니다.
		
		리스트.add("파파야"); // 리스트는 중복된 값 추가가 가능하다.
		System.out.println(리스트);
		
	}
}
