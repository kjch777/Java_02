package 자바_문제풀이;
/*
 캡슐화 원칙에 맞게 구현하기 
 */
public class Animal {

	private String name;
	private int age;
	
	public Animal() {
		// Ctrl + Space
	}

	public Animal(String name, int age) {
		// super();
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
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
}
