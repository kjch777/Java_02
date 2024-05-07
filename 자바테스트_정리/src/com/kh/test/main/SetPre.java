package com.kh.test.main;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

// set �� �������̽� �̱� ������, �ܵ����� ������� ���Ѵ�.
// Set �� = new Set<>(); �� ���� ���Ѵ�.
// Set �� = new HashSet<>(); �� �� �� �ִ�.
public class SetPre {
	
	public static void main(String[] args) {
	
		Set<String> set1 = new HashSet<>();
		
		set1.add("���");
		set1.add("�ٳ���");
		set1.add("������");
		
		System.out.println("�ؽ� �� : " + set1);
		
		Set<Integer> set2 = new TreeSet<>();
		
		set2.add(5);
		set2.add(2);
		set2.add(8);
		
		System.out.println("Ʈ�� �� : " + set2);
		
		Set<String> set3 = new LinkedHashSet<>();
		
		set3.add("��ȭ");
		set3.add("���");
		set3.add("������");
		
		System.out.println("��ũ�� �ؽ� �� : " + set3);
		
		// .clear() .remove() .isEmpty() �� �� �� ������,
		// .set() .get() �� �Ἥ ���� �����ϰų�, ������ �� ����.
		
	}
	
}
