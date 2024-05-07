package com.kh.VariableEx;
/*
 (자료)형변환 : 데이터 타입을 변환하는 것으로, 자동으로 변환하는 형변환과, 강제로 변환하는 형변환이 존재한다.
 	자동 형변환이 가능한 경우 : 자료형의 byte 가 서로 같거나, 
 						변환하는 결과가 변환하기 전 byte 보다 클 때
 						
 	강제 형변환 해야하는 경우 : 큰 byte 에서 작은 byte 로 넘어갈 때는, 큰 그릇에서 작은 그릇으로 이동하는 것이기 때문에
 	  					강제로 넣어줘야 한다. (이 때, 데이터 손실이 발생할 가능성이 있다.)
 	  					
 	자동 형변환은 ( ) 를 생략해도 되고, 생략하지 않아도 된다.
 		예제
 			int 정수 = 10;
 			double 실수 = (double) 정수; // (double) 생략 가능
 			
    강제 형변환은 ( ) 를 무조건 작성해주어야 한다.
    	예제
    		double 실수 = 1.0;
    		int 정수 = (int) 실수; // (int) 를 필수로 작성해주어야 한다.
    		
    메서드 호출을 통한 형변환도 있다.
    	
    	String ▶ 숫자 자료형
    	객체자료형.parse자료형(변환하고 싶은 값);
    	
		Integer.parseInt(변환할 String 변수);
		Byte.parseByte(변환할 String 변수);
		Short.parseShort(변환할 String 변수);
		Long.parseLong(변환할 String 변수);
		Double.parseDouble(변환할 String 변수);
		Float.parseFloat(변환할 String 변수);
		
		숫자 자료형 ▶ String
		객체자료형.toString(변환할 숫자 변수);
		
		Integer.toString(변환할 숫자 변수);
		Byte.toString(변환할 숫자 변수);
		Short.toString(변환할 숫자 변수);
		Long.toString(변환할 숫자 변수);
		Double.toString(변환할 실수 변수);
		Float.toString(변환할 실수 변수);
		
		
	    	일부 데이터는 메서드를 통해 값 변환이 진행된다.
	    	문자열 String 으로 담은 값을, 숫자 값으로 변경하고 싶을 때 많이 사용한다.
	    	
	    	예를 들어, 문자열을 정수로 변환하길 원한다면
	    		String 전화번호 = "01012345678";
	    		Integer.parseInt(전화번호); ◀ 이렇게 하면 int 값으로 변경된다.
	    		
 정수는 맨 앞에 0 이 있다면, 자동으로 제거시킨 후 진행한다.
 */
public class 형변환 {

}
