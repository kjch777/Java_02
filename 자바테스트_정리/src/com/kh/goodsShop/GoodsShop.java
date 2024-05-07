package com.kh.goodsShop;

import java.util.*;

public class GoodsShop {

	public static void main(String[] args) {
		
		Map<String, Integer> item = new HashMap();
		System.out.println("=== ���ֵ� ���ǰ �Ǹż� ===");
		
		// ��ǰ�� ���� �߰��ϱ�
		item.put("�������", 20_000);
		item.put("���ָ���", 15_000);
		item.put("����Ű��", 25_000);
		
		// ��ǰ ��� ����
		// Map<String, Integer> == Map.Entry<�ȿ� ����ִ� �ڷ����� �����ؾ� �Ѵ�.>
		//  item �� �ϳ��� Ű-������ ��������    : �ȿ� ����ִ� item ��� ����
		for(Map.Entry<String, Integer> e : item.entrySet()) {
			String product = e.getKey(); // ��ǰ �̸��� ������ ��
			int price = e.getValue(); // ��ǰ ���ݸ� ������ ��
			System.out.println(product + "��/�� " + price + "�� �Դϴ�.");
		}
		
		// Ư�� ��ǰ�� ���� ����
		// ��ǰ�� �ִ��� Ȯ���ϰ�, �ִٸ� ������ ����ϱ�
		String productName = "�������";
		if(item.containsKey(productName)) { // ��ǰ�� �����ϴ��� Ȯ���ϴ� �ڵ�
			int productPrice = item.get(productName); // ��ǰ�� �����ϸ� ���� �������� �ڵ�
			System.out.println(productName + "�� ������ " + productPrice + "�� �Դϴ�.");
		} else {
			System.out.println(productName + "��/�� �����ϴ�.");
		}
		
	}
	
}
