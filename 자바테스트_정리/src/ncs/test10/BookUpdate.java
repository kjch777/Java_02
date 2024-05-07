package ncs.test10;

public class BookUpdate {

// �ʵ�
	private Book bookData;
	
// �޼���
	// Setter
	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	// Getter
	public Book getBookData() {
		return bookData;
	}

	// �⺻ ������
	public BookUpdate() {
		
	}
	
	// �ʼ� ������
	public BookUpdate(Book bookData) {
		super();
		this.bookData = bookData;
	}
	
	// ��� void
	public void updateBookPrice() {
		double discountPrice = bookData.getBookPrice() * (1 - bookData.getBookDiscountRate() / 100);
		bookData.setBookPrice(discountPrice);
	}

}
