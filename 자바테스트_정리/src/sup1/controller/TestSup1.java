package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public class TestSup1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		sc.nextLine(); // ���� �����
		System.out.print("������� ���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		sc.nextLine(); // ���� �����
		System.out.print("������� ���� ������ �Է��ϼ��� : ");
		int mth = sc.nextInt();
		sc.nextLine(); // ���� �����
		
		Score Score = new Score(kor, eng, mth);
		
		Score.result();
		
	}
}
