package com.kh.test.main;

public class 객체힙스택1 {
	public static void main(String[] args) {
		Car 차1 = new Car();
		Car 차2 = new Car("쏘나타", 2019, "화이트");
		
		System.out.println("차1 : " + 차1); // 주소값은 다른 사람과 일치하지 않는다.
		System.out.println("차2 : " + 차2);
		
		System.out.println(차1.getCarName());
		System.out.println(차1.getCarColor());
		System.out.println(차1.getCarYear());
		
		System.out.println(차2.getCarName());
		System.out.println(차2.getCarColor());
		System.out.println(차2.getCarYear());
	}
}
