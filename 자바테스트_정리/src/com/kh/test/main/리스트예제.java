package com.kh.test.main;

import java.util.ArrayList;
import java.util.Arrays;

public class ����Ʈ���� {
	public static void main(String[] args) {
		
		// ArrayList ����
		ArrayList<String> ����Ʈ = new ArrayList<>(Arrays.asList("�ٳ���", "������"));
		
		// �� �߰�   ��                                                  ��
		����Ʈ.add("���");
		System.out.println(����Ʈ);
		
		// �� ����
		����Ʈ.remove("�ٳ���"); // ���� ���� �ۼ��ؼ� ����
		����Ʈ.remove(0); // �ε��� ��ġ �����ؼ� ����
		System.out.println(����Ʈ); // ����� �ε��� 2������ 0������ �̵��� ���̴�.
		
		// �� ����
		����Ʈ.set(0, "ü��"); // .set(������ �ε��� ��ġ, ������ ��);
		System.out.println(����Ʈ);
		
		����Ʈ.add(1, "���ľ�"); // .add(������ �ε��� ��ġ, ������ ��);
		/*
		 ����Ʈ�� 0���� ������� +1 �ؼ� �ڸ��� ����� ���̱� ������,
		 0 = ü��
		 1 = �������
		 2 = ���ľ�
		 �̷� ������ ���� �߰��ϴ� ���� �Ұ����ϴ�.
		 �߰��� ��, �ε��� ��ȣ ������� �߰� ���־�� �Ѵ�. 
		 */
		System.out.println(����Ʈ);
		
		// ũ�� Ȯ��
		System.out.println(����Ʈ.size());
		
		// ���� ���� Ȯ��
		System.out.println(����Ʈ.contains("���ľ�"));
		
		// �ε��� Ȯ��
		System.out.println(����Ʈ.indexOf("ü��")); // ü���� �ε��� 0���̱� ������, 0�� ������ ���̴�.
		//                                         ü���� ���ٴ� ���� �ƴϴ�.
		
		����Ʈ.add("���ľ�"); // ����Ʈ�� �ߺ��� �� �߰��� �����ϴ�.
		System.out.println(����Ʈ);
		
	}
}
