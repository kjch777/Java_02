package com.kh.oop.pre;

// extends Animal // Animal ȣ�� // extends �� implements �� ���� �� ���� �ֱ�� �ϴ�.
public class Cat extends Animal {

	// super() �� �̿��Ͽ�, Cat ���� �θ� Ŭ������ �ִ� �ʼ� ������ ȣ���ϱ�
	public Cat(String name) {
		super(name);
	}
	
// �޼���
	@Override
	public void makeSound() {
		System.out.println("����̰� " + getName() + " �߿�");
	}
	
}
