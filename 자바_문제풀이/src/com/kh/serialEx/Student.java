package com.kh.serialEx;

import java.io.Serializable;

// �л��� ����ȭ �ϱ�
// implements Serializable
public class Student implements Serializable {

// �ʵ�
	private String name;
	private int age;

// �޼���
	public Student() {
		// Ctrl + Space
	}

	public Student(String name, int age) {
		// super(); // Alt + Shift + S + O
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() { // Alt + Shift + S + S
		return "�̸� : " + name + ", ���� : " + age;
	}

}
