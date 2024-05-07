package com.kh.test.main.oop;

// Animal interface �ϳ��� ��� �������� implements Animal 
// �̿ܿ��� ���� ������ , �� ����Ͽ� �ۼ��� �� �ִ�.
// �ٸ�, ������ ������ interface ���߸� �Ѵ�.
// Animal ���� �Ҹ��� ����� makeSound �� ����ǰ� ���� �ʱ� ������,
// Dog ���� ������ �߻��Ѵ�.
public class Dog implements Animal, AnimalEat {
	
	// Animal �� �ִ� �������̽� �޼��� �����ϱ�
	@Override // �ּ����� �ǹ̷�, ���� �ص� ��� ������, ������ ���� ������� �ۼ��ϴ� ���̱� ������
	// ������ �� �ۼ����ִ� ���� ����.
	public void makeSound() {
		System.out.println("�۸�");
	}
	
	@Override
	public void eat() {
		System.out.println("�ͱ��ͱ�");
	}
}
