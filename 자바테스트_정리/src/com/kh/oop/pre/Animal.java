package com.kh.oop.pre;

// ��� �θ� Ŭ����
public class Animal {

// �ʵ�
	private String name;

	
// �޼���
	// Getter
	public String getName() {
		return name;
	}
		
	// Setter
	public void setName(String name) {
		this.name = name;
	}
		
	// �⺻ ������
	public Animal() {
		
	}

	// �ʼ� ������
	public Animal(String name) {
		// super(); �θ� Ŭ�������� �ʿ� ����.
		this.name = name;
	}
	
	// ��� void
	public void makeSound() {
		System.out.println(name + " ��(��) �Ҹ��� ���ϴ�.");
	}
	
}
