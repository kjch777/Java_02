package 자바_문제풀이;

import java.util.*;

public class 실습문제2 {
	
	public static void main(String[] args) {
		List<String> student = new ArrayList(Arrays.asList("홍길동", "김철수", "박재석"));
		student.add("윤민식");
		
		for(String name : student) {
			System.out.println(name);
		}
		
		System.out.println("index 0번째 학생 이름은: " + student.get(0));
		
		student.set(1, "이영희");
		
		System.out.println("index 1번째 학생 이름은: " + student.get(1));
		
		student.remove("박재석");
		
		System.out.println("박재석이 포함되어 있습니까?: " + student.contains("박재석"));
		
		System.out.println("학생 리스트의 크기는: " + student.size());
		
		System.out.println("학생 리스트가 비어 있습니까?: " + student.isEmpty());
	}

}
