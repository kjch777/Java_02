package com.kh.test.main.oop;

public class Parent {

// 필드
	int pV; // parentVariable
	
// 메서드
	// 기본 생성자
	public Parent() {
		// Ctrl + Space
	}
	
	// 필수 생성자
	public Parent(int pV) {
		// super(); 부모 클래스에선 필요 없다.
		this.pV = pV;
	}
		
	// 출력 void
	public void pMethod() {
		System.out.println("부모가 등장했습니다.");
	}

}
