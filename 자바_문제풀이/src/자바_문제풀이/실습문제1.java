package 자바_문제풀이;

import java.util.*;
import java.util.Map.Entry;

public class 실습문제1 {

	public static void main(String[] args) {
		Map<String, Integer> studentScores = new HashMap();
		studentScores.put("홍길동", 85);
		studentScores.put("김철수", 60);
		studentScores.put("박재석", 88);
		studentScores.put("윤민식", 42);
				
		System.out.println("홍길동의 점수는 : " + studentScores.get("홍길동"));

		for(Map.Entry<String, Integer> m : studentScores.entrySet()) {
			String name = m.getKey();
			int score = m.getValue();
			System.out.println("학생 이름: " + name + ", 학생 점수: " + score);
		}
		
		studentScores.replace("윤민식", 88);
		System.out.println("윤민식의 점수는 : " + studentScores.get("윤민식"));
		
		studentScores.remove("박재석");
		System.out.println("박재석의 정보는 : " + studentScores.get("박재석"));
		
		System.out.println("Map이 비어있습니까? : " + studentScores.isEmpty());
		System.out.println("Map의 크기는 : " + studentScores.size());
	}
	
}
