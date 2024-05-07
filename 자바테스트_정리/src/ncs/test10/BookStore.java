package ncs.test10;

public class BookStore {
	public static void main(String[] args) {
		
		/*
		 자료형 변수명 = 리터럴(값); // 메모리 사용량이 적다. 가능하면 이 방법을 사용하는 것이 좋다.
		 
		 자료형 변수명;
		 변수명 = 리터럴(값); // 메모리 사용량이 많다. 
		 */
		
		Book bI;
		bI = new Book("IT", "HTML5", 30000.0, 15.0);
		System.out.println("===== 출력 시작 =====");
		System.out.println(bI.getBookName() + " // " + bI.getBookPrice());
		
		BookUpdate bI2 = new BookUpdate(bI);
		bI2.updateBookPrice();
		System.out.println("===== 가격 변경 =====");
		System.out.println(bI.getBookName() + " // " + bI.getBookPrice());
	}
}
