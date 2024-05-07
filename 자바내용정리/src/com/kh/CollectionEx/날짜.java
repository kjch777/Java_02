package com.kh.CollectionEx;
/*
 Date : 날짜와 시간을 나타내는 클래스이다.
        현재 시간이나, 특정 시점의 시간을 표현할 때 사용한다.
        자바에서 날짜와 시간 연산을 위한 다양한 기능등을 제공하지 않았기 때문에,
        java.time 폴더에 LocalDate LocalTime 등 다양한 클래스를 새롭게 추가하였고,
        Date 에서 변형된 날짜값으로 사용하는 것이 권장된다.
        
 SimpleDateFormat : 날짜 및 시간을 개발자나 사용자가 원하는 기준으로 형식을 맞춰서 사용할 수 있게 해준다.
                    사용자가 지정한 패턴을 문자열로 형식화 하거나, 문자열을 날짜 객체로 변환하여 사용할 수 있게 해준다.
                    
                     년도    월    일  시간    분   초  요일
                    yyyy - MM - dd   HH : mm : ss 			eeee
                                     H == 24시간     			E : n요일의 n만 표기
                                     h == 오전/오후           EEEE : n요일 모두 표기
                    // 이 때, - : 는 다른 걸로 바꿔주어도 된다.      d.. : 컴퓨터나 각자 환경에 맞게 d, e, D 등 표기를 변경해서 작성하기도 한다.
                    // 되기는 한데, 그럼 시 분 초에서 오류가 난다. 
                     
                    형식을 따로 지정해주지 않는다면,
                    SimpleDateFormat 변수명 = new SimpleDateFormat(); // 24. 5. 3. 오전 10:44 형식으로 출력된다.
                    
                    format(Date date) : 날짜 시간 형식
                                      : 날짜(Date) ▶ 문자열(String = SimpleDateFormat)
                   
                   parse(String date) : 문자열을 날짜 시간 형식으로 변환할 때 사용한다.
                                        문자열로 이루어진 날짜(String = SimpleDateFormat) ▶ 날짜(Date)
 */
public class 날짜 {

}
