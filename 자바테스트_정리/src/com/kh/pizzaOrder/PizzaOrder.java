package com.kh.pizzaOrder;

public class PizzaOrder {

// 필드
	// 전역변수(각각의 멤버변수)
	private String name;
	private String pizza;
	
// 메서드
	// Getter
	public String getName() {
		return name;
	}
	
	public String getPizza() {
		return pizza;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPizza(String pizza) {
		this.pizza = pizza;
	}
		
	// 기본 생성자
	public PizzaOrder() {
		// Ctrl + Space
	}
	
	// 필수 생성자
	public PizzaOrder(String name, String pizza) {
		// super(); 부모 클래스에선 필요 없다.
		this.name = name;
		this.pizza = pizza;
	}
	
	// @Override toString return
	@Override // Alt + Shift + S + S
	public String toString() {
		return "주문자 이름 : " + name + " // 피자 정보 : " + pizza;
	}
	
}
