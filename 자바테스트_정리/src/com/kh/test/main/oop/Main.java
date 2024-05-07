package com.kh.test.main.oop;

public class Main {

	// 최종 출력 및 실행 할 메인 메서드로, 내가 정말 실행하고자 하는 파일과 코드만 작성하는 공간이다.
	public static void main(String[] args) {
		
		Dog 댕댕 = new Dog(); // Dog == 객체
		Dog 마루 = new Dog(); // new Dog == 인스턴스
		Dog 시바 = new Dog(); 
		
		// Animal 인터페이스 메서드에 작성한 makeSound 를, Dog 에서 재사용한 소리로 변경한 것 출력하기
		댕댕.makeSound();
		마루.makeSound();
		시바.makeSound();
		
		댕댕.eat();
		마루.eat();
		시바.eat();
		
	}
}
