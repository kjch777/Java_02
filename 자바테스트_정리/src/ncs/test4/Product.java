package ncs.test4;

public class Product {

// 필드
	private String name;
	private int price;
	private int quantity;
	
// 메서드
	// Getter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price; // 총 구매 가격 == 가격 * 수량 return
	} // Getter Setter 는 값을 임의로 건들지 않는다.
	
	public int getQuantity() {
		return quantity;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// 기본 생성자
	public Product() {
		
	}
	
	// 필수 생성자
	public Product(String name, int price, int quantity) {
		// super(); 부모 클래스에선 필요 없다.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// String // return 메서드
	public String information() {
		return "상품 이름 : " + name + " // 상품 가격 : " + price + " // 상품 수량 : " + quantity + " // 가격 총합 : " + getPrice();
		//                                                                                                    메서드 하나를 더 만들어서 사용해야 한다.
		//                                                                                                    ex) public void totalPrice(){}
	}
	
}