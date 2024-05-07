package ncs.test11;

import java.util.*;

// 매개변수를 사용할 때는, 나중에 넣어줬으면 하는 매개변수 타입과,
//                  메서드에 넣으려고 하는 매개변수 타입이 서로 같아야 한다.
// 메서드 위치는 위치가 어디이건 상관 없으나, 필드 값은 최상단에 작성해주는 것이 좋다.
public class ListTest {
	
	public static void display(List<Integer> list) {
		for(int num : list) {
			System.out.print(num + " ");
		}
		System.out.println(); // Enter 처럼 줄바꿈 처리를 해주는 코드이다.
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		
		// 1부터 100 사이에 임의의 정수 10개를 생성하고, 리스트에 추가하기
		for(int i = 0; i < 10; i++) {
			list.add(random.nextInt(100) + 1);
		}
		System.out.print("정렬 전 : ");
		display(list); // List 하위에 비슷하게 행동하고, 비슷하게 생긴 메서드가 있어서, 에러를 보기 위해 작성해본 것
		
		// 내림차순 정렬
		Collections.sort(list, new Decending());
		System.out.print("정렬 후 : ");
		display(list);
		
	}
	
}
