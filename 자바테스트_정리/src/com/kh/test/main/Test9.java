package com.kh.test.main;

public class Test9 {
	public static void main(String[] args) {
		String[] ���� = {"��", "ȭ", "��"};
		for(String ��¥ : ����) {
			System.out.println(��¥);
		}
		
		// .length �� ��ٱ��ϰ��� �迭�� ����ִ� ������ �ǹ��Ѵ�.
		System.out.println("������ ���� : " + ����.length);
		
		// index �� �� �ڸ��� � ���� ����ִ��� Ȯ���ϰ� �ʹٸ�,
		// ������[�˰���� �ڸ��� ����]
		System.out.println("���� 0��° �ڸ� : " + ����[0]);
		
		// index �� �̿��Ͽ� ���� 1�� �ڸ��� �ִ� ����,
		// ���� 2�� �ڸ��� �ִ� �� ����غ���
		System.out.println("���� 1��° �ڸ� : " + ����[1]);
		System.out.println("���� 2��° �ڸ� : " + ����[2]);
	}
}
