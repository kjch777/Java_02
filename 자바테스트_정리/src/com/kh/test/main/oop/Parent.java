package com.kh.test.main.oop;

public class Parent {

// �ʵ�
	int pV; // parentVariable
	
// �޼���
	// �⺻ ������
	public Parent() {
		// Ctrl + Space
	}
	
	// �ʼ� ������
	public Parent(int pV) {
		// super(); �θ� Ŭ�������� �ʿ� ����.
		this.pV = pV;
	}
		
	// ��� void
	public void pMethod() {
		System.out.println("�θ� �����߽��ϴ�.");
	}

}
