package com.kh.test.main;

import java.util.HashMap;
import java.util.Map;

public class MapPre {

	public static void main(String[] args) {

		// Map 도 Set 처럼 인터페이스이기 때문에,
		// 인스턴스로 사용하려면
		// Map<String, Integer> map = new HashMap<>(); 과 같이 사용해야 한다.
		
		Map<String, Integer> map = new HashMap<>();
		
		// 추가한 순서대로 출력되지 않는다. 즉, 순서가 보장되지 않는다.
		map.put("apple", 2_000);
		map.put("banana", 3_000);
		map.put("cherry", 1_000);
		
		System.out.println(map);
		
		// 주의
		// " " 안에 공백 유무 확인해야 하고, 순서 보장이 안 된다는 것을 유념해야 한다.
		map.put("banana", 500);
		System.out.println(map);
		
		map.put("banana ", 1_000); // 컴퓨터는 띄어쓰기만 해도 다른 키로 인식한다.
		System.out.println(map);

		map.put(" banana", 1_000); // 컴퓨터는 띄어쓰기만 해도 다른 키로 인식한다.
		System.out.println(map);
		
	}

}
