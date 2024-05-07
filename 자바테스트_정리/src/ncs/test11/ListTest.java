package ncs.test11;

import java.util.*;

// �Ű������� ����� ����, ���߿� �־������� �ϴ� �Ű����� Ÿ�԰�,
//                  �޼��忡 �������� �ϴ� �Ű����� Ÿ���� ���� ���ƾ� �Ѵ�.
// �޼��� ��ġ�� ��ġ�� ����̰� ��� ������, �ʵ� ���� �ֻ�ܿ� �ۼ����ִ� ���� ����.
public class ListTest {
	
	public static void display(List<Integer> list) {
		for(int num : list) {
			System.out.print(num + " ");
		}
		System.out.println(); // Enter ó�� �ٹٲ� ó���� ���ִ� �ڵ��̴�.
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		
		// 1���� 100 ���̿� ������ ���� 10���� �����ϰ�, ����Ʈ�� �߰��ϱ�
		for(int i = 0; i < 10; i++) {
			list.add(random.nextInt(100) + 1);
		}
		System.out.print("���� �� : ");
		display(list); // List ������ ����ϰ� �ൿ�ϰ�, ����ϰ� ���� �޼��尡 �־, ������ ���� ���� �ۼ��غ� ��
		
		// �������� ����
		Collections.sort(list, new Decending());
		System.out.print("���� �� : ");
		display(list);
		
	}
	
}
