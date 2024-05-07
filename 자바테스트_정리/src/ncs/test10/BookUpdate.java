package ncs.test10;

public class BookUpdate {

// 필드
	private Book bookData;
	
// 메서드
	// Setter
	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	// Getter
	public Book getBookData() {
		return bookData;
	}

	// 기본 생성자
	public BookUpdate() {
		
	}
	
	// 필수 생성자
	public BookUpdate(Book bookData) {
		super();
		this.bookData = bookData;
	}
	
	// 출력 void
	public void updateBookPrice() {
		double discountPrice = bookData.getBookPrice() * (1 - bookData.getBookDiscountRate() / 100);
		bookData.setBookPrice(discountPrice);
	}

}
