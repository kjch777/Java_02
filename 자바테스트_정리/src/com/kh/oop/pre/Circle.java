package com.kh.oop.pre;

// Shape, Drawable 인터페이스를 implements 를 사용해서 호출
// 처음에 인터페이스부터 가져오면 당연히 빨간 밑줄이 생긴다.
// 앞에서 작성한 미완성된 메서드를 가져왔으면 빨리 완성해달라는 표시이기 때문이다.
public class Circle implements Shape, Drawable {

// 메서드
	@Override // 재사용 표시
	public double Area() {
		return 4.8;
	}
	
	@Override // 재사용 표시
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	
}
