package com.kh.Sandwich;

import java.util.*;

public class 샌드위치가게 {
	
	public static void main(String[] args) {
		
		List<샌드위치> orderList = new ArrayList();
		
		orderList.add(new 샌드위치("하나", "토마토"));
		orderList.add(new 샌드위치("둘", "치킨"));
		orderList.add(new 샌드위치("삼", "비프"));
		orderList.add(new 샌드위치("넷", "포크"));
		orderList.add(new 샌드위치("하나", "치즈"));
		
		Set<String> nameCheck = new HashSet();
		
		List<샌드위치> valueAdd = new ArrayList();
		
		for(샌드위치 order : orderList) { // for(부모클래스명 새로운변수명 : 모집단)
			if(!nameCheck.contains(order.getCustomerName())) { // !HashSet이름.contains(위의변수명.getCustomerName())
				valueAdd.add(order); // ArrayList명.add(위의변수명);
				nameCheck.add(order.getCustomerName()); // HashSet명.add(위의변수명.getCustomerName())
			}
		}
		System.out.println(valueAdd); // 마지막 ArrayList명
		
		// for - each 문으로 값을 한 개씩 출력하기
		for(샌드위치 order : valueAdd) {
			System.out.println(order);
		}
	}
	
}
