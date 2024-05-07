package com.kh.serialEx;

import java.io.Serializable;

// 학생을 직렬화 하기
// implements Serializable
public class Student implements Serializable {

// 필드
	private String name;
	private int age;

// 메서드
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
		return "이름 : " + name + ", 나이 : " + age;
	}

}
