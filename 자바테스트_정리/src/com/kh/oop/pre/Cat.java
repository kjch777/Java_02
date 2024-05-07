package com.kh.oop.pre;

// extends Animal // Animal 호출 // extends 와 implements 를 같이 쓸 수도 있기는 하다.
public class Cat extends Animal {

	// super() 를 이용하여, Cat 에서 부모 클래스에 있는 필수 생성자 호출하기
	public Cat(String name) {
		super(name);
	}
	
// 메서드
	@Override
	public void makeSound() {
		System.out.println("고양이가 " + getName() + " 야옹");
	}
	
}
