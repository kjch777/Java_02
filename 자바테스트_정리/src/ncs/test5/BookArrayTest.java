package ncs.test5;

public class BookArrayTest {
	
	public static void main(String[] args) {
		
		Book bArray[] = new Book[3];
		bArray[0] = new Book("자바의 정석", "남궁성", 30_000, "도우출판", 0.1); 
		bArray[1] = new Book("열혈강의 자바", "구정은", 29_000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30_000, "북스홈", 0.1);
		
		for(Book b : bArray) {
			String title = b.getTitle();
			String author = b.getAuthor();
			int price = b.getPrice();
			String publisher = b.getPublisher();
			double discountRate = b.getDiscountRate();
			int discountPrice = b.getDiscountPrice();
			System.out.println("도서명 : " + title + ", 작가명 : " + author + ", 판매가 : " + price + "원, 출판사 : " + publisher + ", 할인율 : " + discountRate);
			System.out.println("할인된 가격 : " + discountPrice);
		}
		
	}
	
}
