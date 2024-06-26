package com.kh.test.main;

public class Car {

// 필드
	private String carName;
	private int carYear;
	private String carColor;
	
// 메서드
	// Setter
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	// Getter
	public String getCarName() {
		return carName;
	}
	public int getCarYear() {
		return carYear;
	}
	public String getCarColor() {
		return carColor;
	}
	
	// 필수 생성자
	public Car(String carName, int carYear, String carColor) {
		// super(); 부모 클래스에선 필요 없다.
		this.carName = carName;
		this.carYear = carYear;
		this.carColor = carColor;
	}
	
	// 기본 생성자
	public Car() {
		this("아벤타도르", 2020, "빨간색");
	}
	
	// String return
	public String information() {
		return this.carYear + "년식" + this.carName + " // " + this.carName;
	}
	
	// main method
	public static void main(String[] args) {
		Car newCar = new Car();
		System.out.println(newCar.information());
	}
	
}
