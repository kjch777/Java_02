package com.kh.study;

public class Study {
	
	public static void main(String[] args) {
		int var = 10; // 변수명에 값을 지정할 때는 필드에서 하지 못한다.
		int result = var++; // 증감 연산자가 후위에 있을 때는, 값이 바로 바뀌지 않는다. 
		System.out.println(result);
		
		int var1 = 10;
		int result1 = ++var1; // 증감 연산자가 전위에 있을 때는, 값이 바로 바뀐다.
		System.out.println(result1);
		
		byte b = 10;
		float fl = 3;
		int i = 100;
		long l = 1000L;
		
		i=(int)b;
		System.out.println(i);
		i=b;
		System.out.println(i);
		
		fl=(float)b;
		System.out.println(fl);
		fl=b;
		System.out.println(fl);
		
		fl=(float)3.14;
		System.out.println(fl);
		fl=3.14f; // 뒤에 f를 써주는 것도 형변환인가? double은 뒤에 아무 것도 안 써도 되니까?
		System.out.println(fl);
		
		short s=(short)fl;
		System.out.println(s);
		// s=fl;
		
		/* 
		   java.lang 패키지는 모든 자바 프로그램에 자동으로 포함되는 패키지이기 때문에, 
		   import 해주지 않아도 적용된다.
		*/
		
		// 다른 클래스를 불러와서 사용하고 싶을 땐, import 경로명;
		
		// public static void main(String[] args) {}
		
		/*
		 boolean : 1byte 
		 int, float : 4byte
		 short, char : 2byte
		 double, long : 8byte
		 */ 
		
		// 변수명에 사용할 수 있는 특수문자는 $ _ 뿐이다.
		
		/* 
		 연산자 우선 순위
		 	최우선 ▼ 
		 		후위 증감 연산자 ++ --
		 		함수 호출 ()
		 		첨자 연산자 []
		 		참조 . 에 의한 선택
		 		포인터 -> 를 통한 선택
		 	    
		 	2순위 ▼
		 		논리 NOT 연산자 !
		 		비트 NOT 연산자 ~
		 		음양 부호 + - 		참조 연산자 *		 주소 연산자 & (단항 연산자)
		 		전위 증감 연산자 ++ --
		 		type 캐스트 연산자 (type)
		 		크기 sizeOf
		 		
		 	3순위 ▼
		 		곱셈 연산자 *
		 		나눗셈 연산자 /
		 		나머지 연산자 %
		 		
		 	4순위 ▼
		 		덧셈 뺄셈 연산자(이항 연산자) + - 
		 	
		 	5순위 ▼
		 		비트 왼쪽 시프트 연산자 <<
		 		비트 오른쪽 시프트 연산자(부호 비트 확장) >>
		 		
		 	6순위 ▼
		 		관계 연산자(크기가 서로 다를 때) < <= > >=
		 		
		 	7순위 ▼
		 		관계 연산자(두 값이 같을 때) =
		 		관계 연산자(두 값이 다를 때) !=
		 		
		 	8순위 ▼
		 		비트 연산자(AND) &
		 		
		 	9순위 ▼
		 		비트 연산자(XOR) ^
		 		
		 	10순위 ▼
		 		비트 연산자(OR) |
		 		
		 	11순위 ▼
		 		논리 연산자(AND) &&
		 		
		 	12순위 ▼
		 		논리 연산자(OR) ||
		 		
		 	13순위 ▼
		 		삼항 조건 연산자 ? :
		 		
		 	14순위 ▼
		 		대입 연산자 및 복합 대입 연산자 = += -= *= /= %= <<= >>= &= ^= |=
		 		
		 	15순위 ▼
		 		쉼표 연산자 ,
		 		
		 	삼항 연산자를 이용하여 ch 가 대문자인지 아닌지 알아보는 조건 식
		 	char ch = 'A';
		 	String result = ((ch >= 'A' && ch <= 'Z') ? 대문자 O : 대문자 X);
		 */
		
		byte b1 = 12;
		byte b2 = 15;
		/* 바이트 변수 2개에 각각 정수 값을 담았다면, 두 변수를 합한 값도 정수이므로, 
		   두 변수를 합한 값을 새로운 변수에 지정하려면 정수형 int 로 강제 형변환을 해주어야 한다.
		 */ 
		
		byte b3 = 125;
		b3 += 10;
		System.out.println(b3);
		// 결과값은 -121
		
		int num = 10;
		System.out.println("result : " + (12*num++));
		// 결과값은 120
		
		// 패키지는 클래스의 묶음이다.
		
		// 스캐너를 import 하지 않고 사용하려면
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 클래스명.메서드명(); 의 문법으로 다른 클래스에 있는 메서드를 불러와서 사용할 수 있다.
		
		/*
		 배열은 
		 	단일 타입의 여러 데이터를 하나의 이름으로 관리할 수 있다.
		 	많은 양의 데이터를 저장하기 위하여 사용된다.
		 	배열의 사이즈를 선언하지 않으면 사용할 수 없다.
		 	배열은 객체이며, 레퍼런스 타입이다.
		 */
		
		// 배열 사용법
		int[] arr = {1, 2, 3};
		int[] arr1 = new int[5];
		// int[] arr2 = new int[5] {1, 2, 3, 4, 5}; [ ] 와 { } 를 한꺼번에 사용하여 값을 지정해줄 순 없다.
		// int arr3[5]; = 을 사용하지 않고, 배열의 선언과 값 지정을 동시에 해줄 순 없다.
		
		int[][] array = {{5, 5, 5, 5, 5}, 
				         {10, 10, 10}, 
				         {20, 20, 20, 20}, 
				         {30, 30}};
		int ary = array[3].length;
		System.out.println(ary);
		// 출력값은 2 이다.
		
		int[] arr7 = {10, 20, 30, 40, 50};
		int sum7 = 0;
		for(int i7 = 0; i7 < arr7.length; i7++) {
			sum7 += arr7[i7];
		}
		System.out.println("sum : " + sum7);
		
		int[] no = {100, 97, 89};
		int[][] count = {{3, 4, 6}, {7, 4, 5}};
		System.out.println(no.length); // 결과값 3
		System.out.println(count.length); // 결과값 2
		System.out.println(count[1].length); // 결과값 3
		System.out.println(no[2] + count[1][2]); // 결과값 94
	}
	
}
