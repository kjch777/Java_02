package com.kh.Hamburger;

import java.util.*;

public class BurgerShop {

	public static void main(String[] args) {
		
		// ArrayList 사용
		// List<불러올 필수 생성자 이름> 새로운 변수명 = new ArrayList();
		List<HamburgerOrder> orderList = new ArrayList();
		
		// 새로운 변수명.add(new 불러올 필수 생성자 이름(값 추가))
		orderList.add(new HamburgerOrder("동그라미", "치즈"));
		orderList.add(new HamburgerOrder("세모", "베이컨"));
		orderList.add(new HamburgerOrder("네모", "치킨"));
		orderList.add(new HamburgerOrder("하나", "불고기"));
		orderList.add(new HamburgerOrder("둘", "상하이"));
		
		// toString 출력
		System.out.println(orderList);
		
		// 1개씩 출력하고 싶다면 for - each 문 사용
		// for - each 문		앞은 불러오고 새로운 변수명 : 뒤가 모집단
		for(HamburgerOrder order : orderList) {
			System.out.println(order); // 앞의 새로운 변수명
		}
		
		// ArrayList 에 담긴 중복 이름은 주문 못하게 하기
		
		System.out.println("중복 주문은 처음에 주문한 건으로 대체됩니다.");
		
		// HashSet 을 사용하여 중복 이름 방지하기
		Set<String> check = new HashSet(); // 중복 확인 여부를 위한 인스턴스 생성
		
		// 중복 이름을 제거한 다음, 중복 이름 아닌 값만 다시 ArrayList 에 담기
		List<HamburgerOrder> add = new ArrayList(); // 중복 이름을 제거한 값만 담을 예정
		
		// for - each 문 사용하여 중복 이름이 있는지 한바퀴 돌면서 확인하고, 중복 이름 아닌 값만 다시 추가하기
		for(HamburgerOrder order : orderList) {
			// if(check.contains(order.getcN())) { // 존재하는 이름만 추가하겠단 의미이기 때문에, 추가가 되지 않는다.
			if(!check.contains(order.getcN())) { // 맨 앞에 ! 추가 // 고객이 존재하지 않는다면,
				add.add(order); // 주문 추가
				check.add(order.getcN());
			}
		}
		System.out.println(add); // 결과적으로 처음에 주문한 내용만 받을 수 있게 된다.
	}
	
}
