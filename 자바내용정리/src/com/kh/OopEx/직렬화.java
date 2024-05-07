package com.kh.OopEx;
/*
 직렬화(Serialization) : 자바에서 사용되는 객체 또는 데이터를, 다른 컴퓨터에서도 사용할 수 있도록
                       ByteStream 으로 변환하는 과정이다.
                       객체 상태를 저장하거나, 네트워크를 통해 전송한다.
                       메모리의 힙과 스택에 머물고 있는 객체나 데이터를 Byte 형태로 변환하고, 
                       DB나 외부 파일을 같은 외부 공간에 저장해두었다가, 
                       나중에 다른 컴퓨터에서 불러와 다시 메모리를 사용할 때 쓴다.
                       
 역직렬화(Deserialization) : ByteStream을 객체로 복원하는 과정이다.
 
   implements Serializable == Stream 에서 많이 사용한다.
   
   	직렬화를 사용하는 경우
   		객체나 파일의 상태를 일단 저장해두었다가 복원할 때
   		데이터 백업 ▶ 복원
   		네트워크 통신에서 전송할 때
   		캐시를 저장할 때
 */
public class 직렬화 {

}
