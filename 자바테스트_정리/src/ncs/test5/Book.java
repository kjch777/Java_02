package ncs.test5;

public class Book {

// 필드 // 전역변수
	private String title; // 멤버변수
	private String author; // 멤버변수
	private int price; // 멤버변수
	private String publisher; // 멤버변수
	private double discountRate; // 멤버변수
	
// 메서드 // 메서드 순서는 상관 없다.
	// 기본 생성자
	public Book() {
		// Ctrl + Space
	}
	
	// 필수 생성자
	public Book(String title, String author, int price, String publisher, double discountRate) {
		// super(); // 부모 클래스에선 필요 없다. // Alt + Shift + S + O
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}
	
	// Getter
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	// 최종가격도 출력하고 싶다면
	public int getDiscountPrice() {
		
		// 할인율 계산 방식 == 실수
		double discountAmount = price * discountRate;
		
		// 할인가격 = 원래가격 - 할인율
		int discountPrice = (int) (price - discountAmount);
		return discountPrice;
	}
	
	// 아니면 여기다 @Override String toString return ""; 을 만들어줘도 된다.
	
}
