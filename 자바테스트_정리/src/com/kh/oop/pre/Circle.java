package com.kh.oop.pre;

// Shape, Drawable �������̽��� implements �� ����ؼ� ȣ��
// ó���� �������̽����� �������� �翬�� ���� ������ �����.
// �տ��� �ۼ��� �̿ϼ��� �޼��带 ���������� ���� �ϼ��ش޶�� ǥ���̱� �����̴�.
public class Circle implements Shape, Drawable {

// �޼���
	@Override // ���� ǥ��
	public double Area() {
		return 4.8;
	}
	
	@Override // ���� ǥ��
	public void draw() {
		System.out.println("���� �׸��ϴ�.");
	}
	
}
