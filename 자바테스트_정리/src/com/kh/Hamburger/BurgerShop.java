package com.kh.Hamburger;

import java.util.*;

public class BurgerShop {

	public static void main(String[] args) {
		
		// ArrayList ���
		// List<�ҷ��� �ʼ� ������ �̸�> ���ο� ������ = new ArrayList();
		List<HamburgerOrder> orderList = new ArrayList();
		
		// ���ο� ������.add(new �ҷ��� �ʼ� ������ �̸�(�� �߰�))
		orderList.add(new HamburgerOrder("���׶��", "ġ��"));
		orderList.add(new HamburgerOrder("����", "������"));
		orderList.add(new HamburgerOrder("�׸�", "ġŲ"));
		orderList.add(new HamburgerOrder("�ϳ�", "�Ұ��"));
		orderList.add(new HamburgerOrder("��", "������"));
		
		// toString ���
		System.out.println(orderList);
		
		// 1���� ����ϰ� �ʹٸ� for - each �� ���
		// for - each ��		���� �ҷ����� ���ο� ������ : �ڰ� ������
		for(HamburgerOrder order : orderList) {
			System.out.println(order); // ���� ���ο� ������
		}
		
		// ArrayList �� ��� �ߺ� �̸��� �ֹ� ���ϰ� �ϱ�
		
		System.out.println("�ߺ� �ֹ��� ó���� �ֹ��� ������ ��ü�˴ϴ�.");
		
		// HashSet �� ����Ͽ� �ߺ� �̸� �����ϱ�
		Set<String> check = new HashSet(); // �ߺ� Ȯ�� ���θ� ���� �ν��Ͻ� ����
		
		// �ߺ� �̸��� ������ ����, �ߺ� �̸� �ƴ� ���� �ٽ� ArrayList �� ���
		List<HamburgerOrder> add = new ArrayList(); // �ߺ� �̸��� ������ ���� ���� ����
		
		// for - each �� ����Ͽ� �ߺ� �̸��� �ִ��� �ѹ��� ���鼭 Ȯ���ϰ�, �ߺ� �̸� �ƴ� ���� �ٽ� �߰��ϱ�
		for(HamburgerOrder order : orderList) {
			// if(check.contains(order.getcN())) { // �����ϴ� �̸��� �߰��ϰڴ� �ǹ��̱� ������, �߰��� ���� �ʴ´�.
			if(!check.contains(order.getcN())) { // �� �տ� ! �߰� // ���� �������� �ʴ´ٸ�,
				add.add(order); // �ֹ� �߰�
				check.add(order.getcN());
			}
		}
		System.out.println(add); // ��������� ó���� �ֹ��� ���븸 ���� �� �ְ� �ȴ�.
	}
	
}
