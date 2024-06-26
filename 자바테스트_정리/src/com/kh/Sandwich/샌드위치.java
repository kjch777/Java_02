package com.kh.Sandwich;

public class 샌드위치 {

// 필드 
	private String customerName;
	private String sandwichType;
	
// 메서드
	// Getter
	public String getCustomerName() {
		return customerName;
	}
	
	public String getSandwichType() {
		return sandwichType;
	}
	
	// Setter
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setSandwichType(String sandwichType) {
		this.sandwichType = sandwichType;
	}
	
	// 기본 생성자
	public 샌드위치() {
		// Ctrl + Space // 주석 처리 제대로 안 하면 ~ 에러가 발생한다.
	}
	
	// 필수 생성자
	public 샌드위치(String customerName, String sandwichType) {
		// super(); 부모 클래스에선 필요 없다.
		this.customerName = customerName;
		this.sandwichType = sandwichType;
	}

	// @Override toString
	@Override
	public String toString() {
		return "주문자 이름 : " + customerName + " , 샌드위치 종류 : " + sandwichType;
	}
}
