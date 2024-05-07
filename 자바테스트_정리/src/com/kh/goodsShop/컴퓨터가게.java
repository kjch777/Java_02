package com.kh.goodsShop;

import java.util.*;

public class 컴퓨터가게 {

	public static void main(String[] args) {
		
		Map<String, Integer> all = new HashMap();
		
		all.put("노트북", 700_000);
		all.put("데스크탑", 500_000);
		all.put("모니터", 100_000);
		all.put("마우스", 50_000);
		all.put("키보드", 80_000);
		
		System.out.println("==== 제품 목록 ====");
		
		for(Map.Entry<String, Integer> a : all.entrySet()) {
			String pN = a.getKey();
			int pP = a.getValue();
			System.out.println("제품 이름 : " + pN + " // 가격 : " + pP);
		}
		
		// 물품명을 직접 입력받고 싶다면
		Scanner sc = new Scanner(System.in);
		System.out.print("찾는 제품의 이름을 입력하세요 : ");
		String product = sc.nextLine();
		
		// 특정 물품 가격 출력
		if(all.containsKey(product)) {
			int price = all.get(product);
			System.out.println(product + "의 가격은 " + price + "원입니다.");
		} else {
			System.out.println(product + "은/는 없습니다.");
		}
		
	}

}
