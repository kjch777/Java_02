package com.kh.pizzaOrder;

import java.util.*;

public class PizzaShop {

	public static void main(String[] args) {
		// 주문 목록을 저장할 ArrayList 생성하고,
		ArrayList<String> nameList = new ArrayList(Arrays.asList("김철수", "신짱구", "이유리", "이훈이", "맹구"));
		ArrayList<String> pizzaList = new ArrayList(Arrays.asList("페퍼로니", "마르게리따", "포테이토", "베이컨", "치즈"));
		
		// 주문자와 피자 정보를 한 번에 묶을 ArrayList 생성하기
		ArrayList<PizzaOrder> orderList = new ArrayList();
		
		// for 문을 사용하여 주문 추가하기
		for(int i = 0; i < nameList.size(); i++) {
			PizzaOrder order = new PizzaOrder(nameList.get(i), pizzaList.get(i));
			orderList.add(order);
		}
		
		System.out.println(orderList);
		System.out.println(nameList);
		System.out.println(pizzaList);
		
	}

}
