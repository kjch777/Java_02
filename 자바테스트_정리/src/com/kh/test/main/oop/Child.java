package com.kh.test.main.oop;

// 자식 클래스로 부모 클래스를 상속받기
// 상속은 extends 를 사용하여 진행
// 인터페이스가 아니라 클래스를 상속 받을 때에는, 하나만 상속받을 수 있기 때문에, extends 를 사용한 후 하나의 클래스만 작성해주어야 한다.
public class Child extends Parent {

// 필드
	int cV; // child Variable
	
// 메서드
	// 기본 생성자
	public Child() {
		// Ctrl + Space ▶ constructor 표시가 있는지 확인 후 Enter
	}
	
	/* 필수 생성자 Alt + Shift + S ▶ O
	// pV 는 Parent 에서 가져오기
	public Child(/ int pV, / int cV) {
		// super(pV); // pV 에 어떻게 받아서 가져가겠다 라는 코드가 없기 때문에 에러가 발생한다.
		// pV 에도 기본 생성자를 넣어서 작성해주어야 한다.
		this.cV = cV;
	}
	*/
	public Child(int cV) {
		super(); // Parent 의 기본 생성자를 호출하겠다는 의미이다.
		// super(pV); 하나의 자식 생성자에서 2개의 super() 를 사용하는 것은 불가능하다.
		// 만약 super() 로 부모 클래스의 기본 생성자와 필수 생성자를 전부 불러오고 싶다면,
		// 자식 생성자도 2개 만들어서 super() 를 각각 하나씩 사용해주어야 한다.
		// 하지만 그렇게 사용할 일은 사실상 없다.
		this.cV = cV;
	}
	
	public Child(int pV, int cV) {
		super(pV); // 부모 클래스에서 필수 생성자를 호출해 사용하겠다는 의미이다.
		this.cV = cV;
	}

	public void cMethod() {
		super.pMethod();
		System.out.println("자식이 호출됐습니다.");
	}
}
