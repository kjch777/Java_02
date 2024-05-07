package ncs4.test2;

// 비교
public class Fruit implements Comparable<Fruit> {

// 필드
	private String name;
	private int price;
	private int quantity;

// 메서드
	// 기본 생성자
	public Fruit() {
		// Ctrl + Space
	}
	
	// 필수 생성자
	public Fruit(String name, int price, int quantity) {
		// super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// @Override
	@Override
	public String toString() {
		return "과일 종류 : " + name + ", 과일 가격 : " + price + ", 과일 수량 : " + quantity;
	}
	
	@Override
	public int compareTo(Fruit 과일비교) {
		return this.name.compareTo(과일비교.name);
		// 같은 이름끼리 비교하기
	}
	
}
