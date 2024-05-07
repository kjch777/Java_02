package com.kh.goodsShop;

import java.util.*;

public class GoodsShop {

	public static void main(String[] args) {
		
		Map<String, Integer> item = new HashMap();
		System.out.println("=== 제주도 기념품 판매소 ===");
		
		// 물품과 가격 추가하기
		item.put("동백모자", 20_000);
		item.put("감귤모자", 15_000);
		item.put("돼지키링", 25_000);
		
		// 물품 목록 보기
		// Map<String, Integer> == Map.Entry<안에 들어있는 자료형이 동일해야 한다.>
		//  item 을 하나씩 키-값으로 꺼내보기    : 안에 들어있는 item 모두 보기
		for(Map.Entry<String, Integer> e : item.entrySet()) {
			String product = e.getKey(); // 제품 이름만 가져온 것
			int price = e.getValue(); // 제품 가격만 가져온 것
			System.out.println(product + "은/는 " + price + "원 입니다.");
		}
		
		// 특정 물품의 가격 보기
		// 제품이 있는지 확인하고, 있다면 얼마인지 출력하기
		String productName = "동백모자";
		if(item.containsKey(productName)) { // 제품이 존재하는지 확인하는 코드
			int productPrice = item.get(productName); // 제품이 존재하면 정보 가져오는 코드
			System.out.println(productName + "의 가격은 " + productPrice + "원 입니다.");
		} else {
			System.out.println(productName + "이/가 없습니다.");
		}
		
	}
	
}
