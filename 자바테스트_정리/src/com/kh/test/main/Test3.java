package com.kh.test.main;

import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		int count = 0; // �ݺ� Ƚ��. ��� �ݺ��ߴ��� Ȯ��
		
		while(num <= 100) {
			sum += num; // ���� = num + num + ... 100�� ... + num
			count++; // ����� ���� �� �ʿ��� ��
			num++; // while ���� 100�� �ݺ��ϰ� ���ش�.
		}
		double avg = (double) sum / count;
		System.out.println(sum);
		System.out.println(avg);
		
		/*
		boolean rp = true;
		Scanner sc = new Scanner(System.in);
		String toDo = "";
		while (rp) {
			System.out.print("���� �Է� : ");
			int date = sc.nextInt();
			switch (date) {
			case 1:
				toDo = "������ = ����";
				break;
			case 2:
				toDo = "ȭ���� = ����";
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				// return;
				rp = false;
				break;
			default:
				toDo = "�޽�";
				break;
			}
			System.out.println("���� = " + toDo); // switch - case ���� ��¹��� �̷��� ������ �� ���°� ������� �ʴ´�.
		}
		*/
	}
}
