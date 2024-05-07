package ncs.test11;

import java.util.Comparator;

// 내림차순으로 정렬하는 Comparator<Integer> 사용하기
public class Decending implements Comparator<Integer> {
	// 미완성된 메서드를 작성해야 하기 때문에, 빨간 밑줄이 생기는 것이다.
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	/*
	 o1 이 o2 보다 작으면 거꾸로
	 o1 이 o2 와 같으면 0
	 o1 이 o2 보다 크면 올바르게 
	 */
}
