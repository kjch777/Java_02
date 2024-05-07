package com.kh.test.main.oop;

// 추상 클래스를 상속받았으니, 추상 클래스에서 작성한 추상 메서드를 필수로 재사용하여 완성해야 하는데,
// 아직 코드 작성을 하지 않았기 때문에 빨간 밑줄이 뜨는 것이다.
public class Circle extends Shape {

	// 추상 메서드 구현하기
	@Override
	public double getArea() {
		return 3.14;
	}
	
}
