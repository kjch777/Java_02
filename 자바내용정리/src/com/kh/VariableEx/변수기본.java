package com.kh.VariableEx;
/*
 자료형	변수명	=	변수값;
 type	name	=	literal(리터럴);
 
 변수
  기본 자료형(primitive type) 프리미티브
  	숫  자 : byte short int long // int 가 기본 자료형
  	문  자 : char			        // ' ' 를 사용하고, 한 글자만 들어갈 수 있다.
  	실  수 : float double        // double 이 기본 자료형
  	참/거짓 : boolean             // false 가 기본 값
  
  참조 자료형(reference type) 레퍼런스
  	문자열 : String		  // " " 를 사용하고, 문자를 모두 나열한다. " " 안에는 특수문자 등 모든 문자를 사용할 수 있다.
  	
  상수형 : 절대불변의 값을 뜻한다. 이름을 전부 대문자로 작성해야 한다.
  	final 자료형 상수명 = 값;
  	final int MAX_NUM = 100; // 이렇게 작성해두면 MAX_NUM 은 100 으로 값이 고정되어 변하지 않는다.
  	
  열거형 : 상수를 하나씩 작성하게되면 번거롭기 때문에, 관련이 있는 상수들을 한꺼번에 { } 안에 작성하여
  		 final 과 자료형을 생략해서 작성하는 상수 표기 방법이다.
  	열거형 예시로는 주로 요일, 계절과 같이 변함 없는 값들을 사용하여 상수를 나열하는 방법을 알려준다.
  	enum 대표이름 { 상수 모두 작성 } // ; 은 안 붙여도 상관은 없으나, 가능한 붙이는게 좋은 것 같다.
 
 변수명은 어떤 특정 기능을 하기 위한 코드가 아니기 때문에, 메서드 안에 작성하지 않아도 상관 없다. 클래스에서 바로 작성 가능하다.
 하지만, System.out.print 와 같은 코드는 무언가를 하기 위한 기능적 코드이기 때문에, 메서드 안에 작성해주어야 한다.
 */
public class 변수기본 {
// 필드
	// 기본 자료형
	 // 1. 숫자
		int 숫자 = 10;
		byte b = 2;
		short sh = 3;
		long lng = 5;

     // 2. 실수
		float ft = 3.14f; // 실수의 기본형은 double 이고, double 은 float 보다 큰 값이기 때문에,
		                  // 뒤에 f 나 F 를 작성해주어야 한다.
		double db = 3.14; // 실수의 기본형은 double 이므로, 뒤에 d를 작성하지 않아도 된다.
	 
	 // 3. 문자
		char ch = 'A';    // 문자는 ' ' 을 쓰고, 가 A 같이 하나의 문자만 넣어야 한다.
	 
	 // 4. 참/거짓
		boolean bln = false;
		boolean bln2; // boolean 은 기본값이 false 이기 때문에, 위와 아래는 서로 같은 뜻이다. 
		
	// 참조 자료형
	 String name = "가나다"; // 나중에 추가로 만들어진 자료형으로, 대문자로 시작한다.
	 // 참조 자료형은 누구나 만들 수 있다.
	 
	// 상수형
	 // 상수형은 앞에 final 을 작성하고, 모두 사용할 경우 static 을 작성한다.
	 final int MAX_NUM = 100;
	 final double PI = 3.14;
	 final String 상수란 = "절대불변해야 하는 값";
	 
	// 열거형(enum)
	 // 서로 관련있는 상수의 모음이다.
	 enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
}
