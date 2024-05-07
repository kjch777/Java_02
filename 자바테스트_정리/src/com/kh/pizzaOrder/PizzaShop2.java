package com.kh.pizzaOrder;

import java.util.*;

public class PizzaShop2 {

	public static void main(String[] args) {
		// 주문 목록을 저장할 ArrayList 생성하고,
		List<PizzaOrder> orderList = new ArrayList();
		
		// PizzaOrder 를 사용하여 주문 추가하기
		PizzaOrder order1 = new PizzaOrder("김철수", "페퍼로니");
		orderList.add(order1);
		
		/*
		 위의 코드와 아래의 코드는 방식만 다를 뿐, 동일하게 작동한다.
		 둘 다 값을 추가하는 방법이다. 
		 */
		
		// PizzaOrder 필수 생성자를 사용하여 값을 바로 입력하기
		orderList.add(new PizzaOrder("신짱구", "마르게리따"));
		orderList.add(new PizzaOrder("이유리", "포테이토"));
		orderList.add(new PizzaOrder("이훈이", "베이컨"));
		orderList.add(new PizzaOrder("맹구", "치즈"));
		
		// 주문 내용 전체 보기 (toString)
		// toString 을 추가하여 출력을 하지 않아도, PizzaOrder 에 작성한 것만으로도
		// 정보를 정확하게 출력한다는 의미로 표기한 것이다.
		System.out.println(orderList);
		
		// 1개씩 보고 싶다면 for - each 문을 사용한다.
		for(PizzaOrder order : orderList) {
			System.out.println(order);
		}
		
		// HashSet 을 사용하여 중복 주문을 방지하기 위한 set 생성
		Set<String> orderCheck = new HashSet();
		
		
		// 중복 주문 정보 제거하고 출력하기
		
	}

}