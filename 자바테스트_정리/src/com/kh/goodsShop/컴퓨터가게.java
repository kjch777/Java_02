package com.kh.goodsShop;

import java.util.*;

public class ��ǻ�Ͱ��� {

	public static void main(String[] args) {
		
		Map<String, Integer> all = new HashMap();
		
		all.put("��Ʈ��", 700_000);
		all.put("����ũž", 500_000);
		all.put("�����", 100_000);
		all.put("���콺", 50_000);
		all.put("Ű����", 80_000);
		
		System.out.println("==== ��ǰ ��� ====");
		
		for(Map.Entry<String, Integer> a : all.entrySet()) {
			String pN = a.getKey();
			int pP = a.getValue();
			System.out.println("��ǰ �̸� : " + pN + " // ���� : " + pP);
		}
		
		// ��ǰ���� ���� �Է¹ް� �ʹٸ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� ��ǰ�� �̸��� �Է��ϼ��� : ");
		String product = sc.nextLine();
		
		// Ư�� ��ǰ ���� ���
		if(all.containsKey(product)) {
			int price = all.get(product);
			System.out.println(product + "�� ������ " + price + "���Դϴ�.");
		} else {
			System.out.println(product + "��/�� �����ϴ�.");
		}
		
	}

}
