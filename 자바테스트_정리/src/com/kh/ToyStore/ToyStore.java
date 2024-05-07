package com.kh.ToyStore;

import java.util.*;

public class ToyStore {

	public static void main(String[] args) {
		
		// 장난감 가게 재고를 HashMap 으로 표현하기
		// Map 은 추가한 순서대로 저장되지 않는다. 또한 키는 중복 저장이 불가하다.
		Map<String, Integer> 재고 = new HashMap();
		
		// 키 - 값 추가하기
		재고.put("자동차", 10);
		재고.put("인형", 15);
		재고.put("공", 20);
		
		// 장난감 재고가 몇 개씩 남아 있는지
		System.out.println("장난감 재고");
		for(Map.Entry<String, Integer> e : 재고.entrySet()) {
			System.out.println("Entry : " + e);
			System.out.println("Key : " + e.getKey());
			System.out.println("Value : " + e.getValue());
		}
	}
}
