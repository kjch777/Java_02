package com.kh.pizzaOrder;

import java.util.*;

public class PizzaShop {

	public static void main(String[] args) {
		// �ֹ� ����� ������ ArrayList �����ϰ�,
		ArrayList<String> nameList = new ArrayList(Arrays.asList("��ö��", "��¯��", "������", "������", "�ͱ�"));
		ArrayList<String> pizzaList = new ArrayList(Arrays.asList("���۷δ�", "�����Ը���", "��������", "������", "ġ��"));
		
		// �ֹ��ڿ� ���� ������ �� ���� ���� ArrayList �����ϱ�
		ArrayList<PizzaOrder> orderList = new ArrayList();
		
		// for ���� ����Ͽ� �ֹ� �߰��ϱ�
		for(int i = 0; i < nameList.size(); i++) {
			PizzaOrder order = new PizzaOrder(nameList.get(i), pizzaList.get(i));
			orderList.add(order);
		}
		
		System.out.println(orderList);
		System.out.println(nameList);
		System.out.println(pizzaList);
		
	}

}
