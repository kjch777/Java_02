package com.kh.test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// ArrayList 와 HashSet 을 같이 사용해보기
public class ListSetEx {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList(); // 뒷 항에는 < > 를 생략해도 상관없다.
		
		// 값 추가
		list.add("피자");
		list.add("햄버거");
		list.add("토스트");
		list.add("피자");
		
		// HashSet 선언 및 초기화
		// 객체를 통해 인스턴스 생성하기
		HashSet<String> hashSet = new HashSet();
		
		hashSet.add("피자");
		hashSet.add("햄버거");
		hashSet.add("토스트");
		hashSet.add("피자");
		
		System.out.println(list);
		System.out.println(hashSet);
		
		// 키에 숫자도 가능, 중복 불가능
		HashMap<Integer, String> hashMap = new HashMap();
		
		System.out.println("===== 과일 가게 =====");
		
		hashMap.put(1, "망고");
		hashMap.put(2, "패션후르츠");
		hashMap.put(3, "블루베리");
		
		System.out.println(hashMap);
		hashMap.put(1, "샤인머스캣");
		System.out.println(hashMap);
		
	}
	
}
