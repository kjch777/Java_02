package com.kh.Hamburger;

public class HamburgerOrder {

// �ʵ�
	private String cN;
	private String bT;
	
// �޼���
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
		
	// �⺻ ������
	public HamburgerOrder() {
		// Ctrl + Space
	}
	
	// �ʼ� ������
	public HamburgerOrder(String cN, String bT) {
		// super(); // �θ� Ŭ�������� �ʿ� ����.
		this.cN = cN;
		this.bT = bT;
	}
	
	// @Override toString return 
	@Override // Alt + Shift + S + S
	public String toString() {
		return "[�ֹ��� �̸� : " + cN + " , ���� ���� : " + bT + "]";
	}
	
}
