package com.kh.test.main.oop;

public class Main {

	// ���� ��� �� ���� �� ���� �޼����, ���� ���� �����ϰ��� �ϴ� ���ϰ� �ڵ常 �ۼ��ϴ� �����̴�.
	public static void main(String[] args) {
		
		Dog ��� = new Dog(); // Dog == ��ü
		Dog ���� = new Dog(); // new Dog == �ν��Ͻ�
		Dog �ù� = new Dog(); 
		
		// Animal �������̽� �޼��忡 �ۼ��� makeSound ��, Dog ���� ������ �Ҹ��� ������ �� ����ϱ�
		���.makeSound();
		����.makeSound();
		�ù�.makeSound();
		
		���.eat();
		����.eat();
		�ù�.eat();
		
	}
}
