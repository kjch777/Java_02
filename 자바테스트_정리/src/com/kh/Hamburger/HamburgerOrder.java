package com.kh.Hamburger;

public class HamburgerOrder {

// 필드
	private String cN;
	private String bT;
	
// 메서드
	// Getter
	public String getcN() {
		return cN;
	}
	public String getbT() {
		return bT;
	}
	
	// Setter
	public void setcN(String cN) {
		this.cN = cN;
	}
	public void setbT(String bT) {
		this.bT = bT;
	}
		
	// 기본 생성자
	public HamburgerOrder() {
		// Ctrl + Space
	}
	
	// 필수 생성자
	public HamburgerOrder(String cN, String bT) {
		// super(); // 부모 클래스에선 필요 없다.
		this.cN = cN;
		this.bT = bT;
	}
	
	// @Override toString return 
	@Override // Alt + Shift + S + S
	public String toString() {
		return "[주문자 이름 : " + cN + " , 버거 종류 : " + bT + "]";
	}
	
}
