package com.kh.study;

public class Study {
	
	public static void main(String[] args) {
		int var = 10; // ������ ���� ������ ���� �ʵ忡�� ���� ���Ѵ�.
		int result = var++; // ���� �����ڰ� ������ ���� ����, ���� �ٷ� �ٲ��� �ʴ´�. 
		System.out.println(result);
		
		int var1 = 10;
		int result1 = ++var1; // ���� �����ڰ� ������ ���� ����, ���� �ٷ� �ٲ��.
		System.out.println(result1);
		
		byte b = 10;
		float fl = 3;
		int i = 100;
		long l = 1000L;
		
		i=(int)b;
		System.out.println(i);
		i=b;
		System.out.println(i);
		
		fl=(float)b;
		System.out.println(fl);
		fl=b;
		System.out.println(fl);
		
		fl=(float)3.14;
		System.out.println(fl);
		fl=3.14f; // �ڿ� f�� ���ִ� �͵� ����ȯ�ΰ�? double�� �ڿ� �ƹ� �͵� �� �ᵵ �Ǵϱ�?
		System.out.println(fl);
		
		short s=(short)fl;
		System.out.println(s);
		// s=fl;
		
		/* 
		   java.lang ��Ű���� ��� �ڹ� ���α׷��� �ڵ����� ���ԵǴ� ��Ű���̱� ������, 
		   import ������ �ʾƵ� ����ȴ�.
		*/
		
		// �ٸ� Ŭ������ �ҷ��ͼ� ����ϰ� ���� ��, import ��θ�;
		
		// public static void main(String[] args) {}
		
		/*
		 boolean : 1byte 
		 int, float : 4byte
		 short, char : 2byte
		 double, long : 8byte
		 */ 
		
		// ������ ����� �� �ִ� Ư�����ڴ� $ _ ���̴�.
		
		/* 
		 ������ �켱 ����
		 	�ֿ켱 �� 
		 		���� ���� ������ ++ --
		 		�Լ� ȣ�� ()
		 		÷�� ������ []
		 		���� . �� ���� ����
		 		������ -> �� ���� ����
		 	    
		 	2���� ��
		 		�� NOT ������ !
		 		��Ʈ NOT ������ ~
		 		���� ��ȣ + - 		���� ������ *		 �ּ� ������ & (���� ������)
		 		���� ���� ������ ++ --
		 		type ĳ��Ʈ ������ (type)
		 		ũ�� sizeOf
		 		
		 	3���� ��
		 		���� ������ *
		 		������ ������ /
		 		������ ������ %
		 		
		 	4���� ��
		 		���� ���� ������(���� ������) + - 
		 	
		 	5���� ��
		 		��Ʈ ���� ����Ʈ ������ <<
		 		��Ʈ ������ ����Ʈ ������(��ȣ ��Ʈ Ȯ��) >>
		 		
		 	6���� ��
		 		���� ������(ũ�Ⱑ ���� �ٸ� ��) < <= > >=
		 		
		 	7���� ��
		 		���� ������(�� ���� ���� ��) =
		 		���� ������(�� ���� �ٸ� ��) !=
		 		
		 	8���� ��
		 		��Ʈ ������(AND) &
		 		
		 	9���� ��
		 		��Ʈ ������(XOR) ^
		 		
		 	10���� ��
		 		��Ʈ ������(OR) |
		 		
		 	11���� ��
		 		�� ������(AND) &&
		 		
		 	12���� ��
		 		�� ������(OR) ||
		 		
		 	13���� ��
		 		���� ���� ������ ? :
		 		
		 	14���� ��
		 		���� ������ �� ���� ���� ������ = += -= *= /= %= <<= >>= &= ^= |=
		 		
		 	15���� ��
		 		��ǥ ������ ,
		 		
		 	���� �����ڸ� �̿��Ͽ� ch �� �빮������ �ƴ��� �˾ƺ��� ���� ��
		 	char ch = 'A';
		 	String result = ((ch >= 'A' && ch <= 'Z') ? �빮�� O : �빮�� X);
		 */
		
		byte b1 = 12;
		byte b2 = 15;
		/* ����Ʈ ���� 2���� ���� ���� ���� ��Ҵٸ�, �� ������ ���� ���� �����̹Ƿ�, 
		   �� ������ ���� ���� ���ο� ������ �����Ϸ��� ������ int �� ���� ����ȯ�� ���־�� �Ѵ�.
		 */ 
		
		byte b3 = 125;
		b3 += 10;
		System.out.println(b3);
		// ������� -121
		
		int num = 10;
		System.out.println("result : " + (12*num++));
		// ������� 120
		
		// ��Ű���� Ŭ������ �����̴�.
		
		// ��ĳ�ʸ� import ���� �ʰ� ����Ϸ���
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// Ŭ������.�޼����(); �� �������� �ٸ� Ŭ������ �ִ� �޼��带 �ҷ��ͼ� ����� �� �ִ�.
		
		/*
		 �迭�� 
		 	���� Ÿ���� ���� �����͸� �ϳ��� �̸����� ������ �� �ִ�.
		 	���� ���� �����͸� �����ϱ� ���Ͽ� ���ȴ�.
		 	�迭�� ����� �������� ������ ����� �� ����.
		 	�迭�� ��ü�̸�, ���۷��� Ÿ���̴�.
		 */
		
		// �迭 ����
		int[] arr = {1, 2, 3};
		int[] arr1 = new int[5];
		// int[] arr2 = new int[5] {1, 2, 3, 4, 5}; [ ] �� { } �� �Ѳ����� ����Ͽ� ���� �������� �� ����.
		// int arr3[5]; = �� ������� �ʰ�, �迭�� ����� �� ������ ���ÿ� ���� �� ����.
		
		int[][] array = {{5, 5, 5, 5, 5}, 
				         {10, 10, 10}, 
				         {20, 20, 20, 20}, 
				         {30, 30}};
		int ary = array[3].length;
		System.out.println(ary);
		// ��°��� 2 �̴�.
		
		int[] arr7 = {10, 20, 30, 40, 50};
		int sum7 = 0;
		for(int i7 = 0; i7 < arr7.length; i7++) {
			sum7 += arr7[i7];
		}
		System.out.println("sum : " + sum7);
		
		int[] no = {100, 97, 89};
		int[][] count = {{3, 4, 6}, {7, 4, 5}};
		System.out.println(no.length); // ����� 3
		System.out.println(count.length); // ����� 2
		System.out.println(count[1].length); // ����� 3
		System.out.println(no[2] + count[1][2]); // ����� 94
	}
	
}
