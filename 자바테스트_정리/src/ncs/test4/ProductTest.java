package ncs.test4;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("상품 가격을 입력하세요 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("상품 수량을 입력하세요 : ");
		int quantity = Integer.parseInt(sc.nextLine());
		
		// 입력받은 값을 객체 Product 에 넣은 후
		Product p1 = new Product(name, price, quantity); // 괄호 안에 채우기
		
		// 출력 하기
		System.out.println(p1.information());
		
	}
}
